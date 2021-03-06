package sig.modules;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import sig.Module;
import sig.sigIRC;
import sig.modules.Twitch.Announcement;
import sig.modules.Twitch.FancyNumber;
import sig.utils.DrawUtils;
import sig.utils.FileUtils;
import sig.utils.SoundUtils;
import sig.utils.TextUtils;
import sig.utils.TimeUtils;

public class TwitchModule extends Module{
	public String console="Twitch module goes here.";
	final public static String USERDIR = sigIRC.BASEDIR+"sigIRC/users/"; 
	final public static String SOUNDSDIR = sigIRC.BASEDIR+"sigIRC/follower_sounds/"; 
	final public static String FOLLOWERQUEUEFILE = USERDIR+"followers.txt";
	public static boolean streamOnline = false;
	static BufferedImage follower_img; 
	BufferedImage followerUserLogo;
	List<Announcement> follower_queue = new ArrayList<Announcement>();
	final static int FOLLOWERCHECKTIMER = 900;
	int lastFollowerCheck=300;
	final static int FOLLOWERANNOUNCEMENTTIME = 300;
	int lastFollowerAnnouncement=0;
	//User announcedFollowerUser;
	String[] followersounds = new String[]{"Glaceon_cry.wav"};
	FancyNumber viewers_numb;
	FancyNumber followers_numb;
	FancyNumber views_numb;
	Date uptime = Calendar.getInstance().getTime();
	String currentlyPlaying=" ";
	final public static int ARROWTIMER = 3000;
	public static BufferedImage UPARROWIMAGE;
	public static BufferedImage DOWNARROWIMAGE;
	public static BufferedImage UPTIMEIMAGE;
	public static long myTwitchChannelID = 0;

	public TwitchModule(Rectangle2D bounds, String moduleName) {
		this(bounds,moduleName,true);
	}

	public TwitchModule(Rectangle2D bounds, String moduleName, boolean enabled) {
		super(bounds, moduleName, enabled);
		Initialize();
	}
	
	private void Initialize() {
		boolean firstTime = false;
		InitializeImages();
		InitializeStatistics();
		InitializeFollowerSounds();
		firstTime = CreateUserFolder();
		if (firstTime) {
			CreateFollowerQueueLog();
		}
		
		myTwitchChannelID = getMyChannelID();
		
		/*manager.streams().get("theduckishot", new StreamResponseHandler() {

			@Override
			public void onFailure(Throwable arg0) {
			}

			@Override
			public void onFailure(int arg0, String arg1, String arg2) {
				System.out.println(arg0+","+arg1+","+arg2);
			}

			@Override
			public void onSuccess(Stream arg0) {
				//System.out.println("Stream data is available! "+arg0);
				if (arg0==null) {
					System.out.println("Stream is offline.");
				} else {
					System.out.println("Stream is online.");
				}
			}
			
		});*/
		/*manager.channels().getFollows(TextUtils.getActualChannelName(), new ChannelFollowsResponseHandler() {
				@Override
				public void onSuccess(int total, java.util.List<ChannelFollow> follows) {
					//System.out.println("Successfully found followers for channel "+sigIRC.channel+". Total: "+total);
					//console = "Last Follower: "+follows.get(0).getUser().getDisplayName();
					follows.get(0).
				}

				@Override
				public void onFailure(Throwable arg0) {
				}

				@Override
				public void onFailure(int arg0, String arg1, String arg2) {
					System.out.println(arg0+","+arg1+","+arg2);
				}
			}
		);*/
		/*SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		System.out.println("Follower Queue Size: "+follower_queue.size()+", Contents: "+follower_queue);
            }
		});*/
	}
	
	private long getMyChannelID() {
		Long id = -1l;
		try {
			FileUtils.downloadFileFromUrl("https://api.twitch.tv/kraken/users?login="+sigIRC.nickname, "temp_connect");
			JSONObject j = FileUtils.readJsonFromFile("temp_connect");
			JSONArray a = j.getJSONArray("users");
			id = Long.parseLong(a.getJSONObject(0).getString("_id"));
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
		return id;
	}

	private void InitializeFollowerSounds() {
		File follower_sounds_dir = new File(SOUNDSDIR);
		String[] files = filterFiles(follower_sounds_dir.list());
		followersounds = files;
		//System.out.println(Arrays.toString(followersounds));
	}

	private static String[] filterFiles(String[] files) {
		List<String> finallist = new ArrayList<String>();
		for (String file : files) {
			if (!file.equalsIgnoreCase("README.txt")) {
				File f = new File(SOUNDSDIR+file);
				if (!f.isDirectory()) {
					finallist.add(file);
				}
			}
		}
		return finallist.toArray(new String[finallist.size()]);
	}

	private void InitializeStatistics() {
		viewers_numb = new FancyNumber("icon_viewers_count.png",0);
		views_numb = new FancyNumber("icon_views_count.png",0);
		followers_numb = new FancyNumber("icon_follower_count.png",0);
	}

	public void run() {
		if (lastFollowerCheck--<=0) {
			lastFollowerCheck = FOLLOWERCHECKTIMER;
			getFollowers(false);
			popFollowerFromQueue();
//			isStreamOnline(true);
			///TODO Rewrite.
		}
		if (lastFollowerAnnouncement>0) {
			lastFollowerAnnouncement--;
		}
		//System.out.println(lastFollowerCheck);
	}
	
	public void ApplyConfigWindowProperties() {
		sigIRC.twitchmodule_X=(int)position.getX();
		sigIRC.twitchmodule_Y=(int)position.getY();
		sigIRC.config.setInteger("TWITCH_module_X", sigIRC.twitchmodule_X);
		sigIRC.config.setInteger("TWITCH_module_Y", sigIRC.twitchmodule_Y);
	}

	private void popFollowerFromQueue() {
		//TODO REWRITE.
		if (sigIRC.testMode) {
			/*User user = new User();
			user.setDisplayName("Test User"+((int)Math.random()*100000));
			user.setBio("I am an awesome test subject.");
			user.setName(user.getDisplayName());
			user.setLogo("http://45.33.13.215/sigIRCv2/sigIRC/sigIRCicon.png");
			DisplayFollowerAnnouncement(user,true);*/
		} else
		if (follower_queue.size()>0) {
			///TODO Rewrite.
//			if (isStreamOnline()) {
//				//We have a follower to announce!
//				/*Announcement a = follower_queue.remove(0);
//				User user = a.getUser();
//				if (user.getDisplayName().length()>0 &&
//						!user.getDisplayName().contains("?")) {
//					DisplayFollowerAnnouncement(user,true);
//				} else {
//					DisplayFollowerAnnouncement(user,false);
//				}*/
//			} else {
//				//Store away all remaining followers in the queue....We can't announce them right now.
//				StoreRemainingFollowers();
//			}
		}
	}
	
	public void windowClosed(WindowEvent ev) {
		StoreRemainingFollowers();
	}

	private void StoreRemainingFollowers() {
		for (Announcement a : follower_queue) {
			//FileUtils.logToFile(Long.toString(a.getUser().getId()), FOLLOWERQUEUEFILE);
			//TODO REWRITE
		}
		follower_queue.clear();
	}


	//TODO REWRITE
	/*private void DisplayFollowerAnnouncement(User user, boolean useNickname) {
		lastFollowerAnnouncement = FOLLOWERANNOUNCEMENTTIME;
		if (!useNickname) {
			user.setDisplayName(user.getName());
		}
		announcedFollowerUser = user;
		String followerAnnouncement = user.getDisplayName()+" is now following the stream!";
		String userlogo = USERDIR+user.getId()+"_logo";
		if (user.getLogo()!=null && !user.getLogo().equalsIgnoreCase("null")) {
			try {
				org.apache.commons.io.FileUtils.copyURLToFile(new URL(user.getLogo()),new File(userlogo));
				File logo = new File(userlogo);
				if (logo.exists()) {
					followerUserLogo = ImageIO.read(logo);
				} else {
					followerUserLogo=null;
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			followerUserLogo = null;
		}
		LogMessageToFile(followerAnnouncement);
		System.out.println(followerAnnouncement);
		SoundUtils.playSound(SOUNDSDIR+followersounds[(int)(Math.random()*followersounds.length)]);
	}*/

	private void InitializeImages() {
		try {
			follower_img = ImageIO.read(new File(sigIRC.BASEDIR+sigIRC.twitchmodule_follower_img));
			UPARROWIMAGE = ImageIO.read(new File(sigIRC.BASEDIR+"sigIRC/icon_up_arrow.png"));
			DOWNARROWIMAGE = ImageIO.read(new File(sigIRC.BASEDIR+"sigIRC/icon_down_arrow.png"));
			UPTIMEIMAGE = ImageIO.read(new File(sigIRC.BASEDIR+"sigIRC/icon_uptime.png"));
			//System.out.println("Initialized Follower Image successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void CreateFollowerQueueLog() {
		String dir = FOLLOWERQUEUEFILE;
		File filer = new File(dir);
		if (!filer.exists()) {
			try {
				filer.createNewFile();
				System.out.println("Follower Queue Log does not exist. Creating in "+USERDIR+".");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void getFollowers(boolean firstTime) {
		try {
			FileUtils.downloadFileFromUrl("https://api.twitch.tv/kraken/channels/"+myTwitchChannelID+"/follows", "follows");
			JSONObject o = FileUtils.readJsonFromFile("follows");
			JSONArray data = o.getJSONArray("follows");
			for (int i=0;i<data.length();i++) {
				
			}
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
		
		///TODO Rewrite.
		/*sigIRC.manager.channels().getFollows(TextUtils.getActualChannelName(), new ChannelFollowsResponseHandler() {
					@Override
					public void onSuccess(int total, java.util.List<ChannelFollow> follows) {
						//System.out.println("Successfully found followers for channel "+sigIRC.channel+". Total: "+total);
						//console = "Last Follower: "+follows.get(0).getUser().getDisplayName();
						for (ChannelFollow f : follows) {
							addFollower(f,isStreamOnline(),firstTime);
						}
					}
		
					@Override
					public void onFailure(Throwable arg0) {
					}
		
					@Override
					public void onFailure(int arg0, String arg1, String arg2) {
						System.out.println(arg0+","+arg1+","+arg2);
					}
				}
			);
		if (isStreamOnline()) {ClearFollowerAnnouncerQueue();}*/
		
	}

	private void ClearFollowerAnnouncerQueue() {
		String[] contents = FileUtils.readFromFile(FOLLOWERQUEUEFILE);
		//System.out.println("Contents: "+Arrays.toString(contents));
		FileUtils.deleteFile(FOLLOWERQUEUEFILE);
		for (String s : contents) {
			if (s.length()>0) {
				int twitchID = Integer.parseInt(s);
				AddFollowerToQueue(twitchID);
			} 
		}
	}
//	private boolean isStreamOnline() {
		///TODO Rewrite.
//		return isStreamOnline(false);
//	}


	///TODO Rewrite.
	/*private boolean isStreamOnline(boolean update) {
		if (update) {
			sigIRC.manager.streams().get(TextUtils.getActualChannelName(), new StreamResponseHandler() {
	
				@Override
				public void onFailure(Throwable arg0) {
					TwitchModule.streamOnline=false;
				}
	
				@Override
				public void onFailure(int arg0, String arg1, String arg2) {
					System.out.println(arg0+","+arg1+","+arg2);
					TwitchModule.streamOnline=false;
				}
	
				@Override
				public void onSuccess(Stream arg0) {
					//System.out.println("Stream data is available! "+arg0);
					if (arg0==null) {
						TwitchModule.streamOnline=false;
					} else {
						TwitchModule.streamOnline=true;
						UpdateAllStreamStatistics(arg0);
					}
				}
	
				private void UpdateAllStreamStatistics(Stream data) {
					if (data!=null) {
						if (data.getGame()!=null && data.getGame().length()>0) {
							currentlyPlaying = data.getGame();
						}
						if (data.getCreatedAt()!=null) {
							uptime = data.getCreatedAt();
						}
						viewers_numb.updateValue(data.getViewers());
						views_numb.updateValue((int)data.getChannel().getViews());
						followers_numb.updateValue(data.getChannel().getFollowers());
					}
				}
				
			});
			return TwitchModule.streamOnline;
		} else {
			return TwitchModule.streamOnline;
		}
		//TwitchModule.streamOnline=true;
		//return true;
	}*/

//	protected void addFollower(ChannelFollow f, boolean streamOnline, boolean silent) {
//		String filename = USERDIR+f.getUser().getId();
//		File userProfile = new File(filename);
//		if (!userProfile.exists()) {
//			if (!silent) { //If we got in here, this isn't the initial follower setup, so we are good to go with announcing these followers.
//				if (!streamOnline) {
//					//Save their ID to a queue.
//					FileUtils.logToFile(Long.toString(f.getUser().getId()), FOLLOWERQUEUEFILE);
//				} else {
//					//Announce it now.
//					//System.out.println("Stream is online...");
//					AnnounceFollower(f);
//				}
//			}
//			CreateUserProfile(f, filename, userProfile);
//		}
//	}
//
//	private void CreateUserProfile(ChannelFollow f, String filename, File userProfile) {
//		try {
//			userProfile.createNewFile();
//			FileUtils.logToFile(DateFormat.getDateInstance().format(f.getCreatedAt()), filename);
//			FileUtils.logToFile(f.getUser().getBio(), filename);
//			FileUtils.logToFile(f.getUser().getDisplayName(), filename);
//			FileUtils.logToFile(f.getUser().getLogo(), filename);
//			FileUtils.logToFile(f.getUser().getName(), filename);
//			FileUtils.logToFile(f.getUser().getType(), filename);
//			FileUtils.logToFile(DateFormat.getDateInstance().format(f.getUser().getUpdatedAt()), filename);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void AnnounceFollower(ChannelFollow f) {
//		//System.out.println("Thanks for following "+f.getUser().getDisplayName()+"!");
//		AddFollowerToQueue(f.getUser());
//	}

	private void AddFollowerToQueue(int id) {
		follower_queue.add(new Announcement(id));
	}

//	private void AddFollowerToQueue(User user) {
//		follower_queue.add(new Announcement(user));
//	}

	private boolean CreateUserFolder() {
		File userDir = new File(USERDIR);
		if (!userDir.exists()) {
			userDir.mkdir();
			System.out.println("Could not find Twitch User directory. Creating in "+USERDIR+".");
			return true;
		} else {
			return false;
		}
	}

	private void LogMessageToFile(String message) {
		Calendar cal = Calendar.getInstance();
		FileUtils.logToFile(message, sigIRC.BASEDIR+"sigIRC/logs/log_"+(cal.get(Calendar.MONTH)+1)+"_"+cal.get(Calendar.DAY_OF_MONTH)+"_"+cal.get(Calendar.YEAR)+".txt",true);
	}

	public void draw(Graphics g){
		super.draw(g);
		//DrawUtils.drawText(g, bounds.getX(), bounds.getY()+24, Color.RED, console);
		DrawFollowerAnnouncement(g);
		if (streamOnline) {
			DrawStatisticsBar(g);
		}
	}

	private void DrawStatisticsBar(Graphics g) {
		g.setColor(new Color(25,25,25));
		int xoffset = (int)position.getX()+4;
		int yoffset = (int)(position.getY()+follower_img.getHeight()+sigIRC.twitchmodule_newfollowerImgLogoSize);
		g.fillPolygon(new int[]{(int)position.getX(),(int)(position.getX()+position.getWidth()),(int)(position.getX()+position.getWidth()),(int)position.getX()}, 
				new int[]{yoffset-4,yoffset-4,yoffset+16,yoffset+16}, 
				4);
		if (currentlyPlaying!=null && currentlyPlaying.length()>0) {
			DrawUtils.drawOutlineText(g, sigIRC.panel.userFont, xoffset, yoffset+TextUtils.calculateStringBoundsFont(currentlyPlaying, sigIRC.panel.userFont).getHeight()/2+3, 2, g.getColor(), new Color(195,195,195), currentlyPlaying);xoffset+=TextUtils.calculateStringBoundsFont(currentlyPlaying, sigIRC.panel.userFont).getWidth()+16;
		}
		Rectangle offsets = DrawUptime(g, xoffset, yoffset);xoffset+=offsets.getWidth();
		offsets = views_numb.draw(g, xoffset, yoffset);xoffset+=offsets.getWidth();
		offsets = followers_numb.draw(g, xoffset, yoffset);xoffset+=offsets.getWidth();
		offsets = viewers_numb.draw(g, xoffset, yoffset);xoffset+=offsets.getWidth();
	}

	private Rectangle DrawUptime(Graphics g, int x, int y) {
		int xoffset = 0;
		int yoffset = 0;
		g.drawImage(UPTIMEIMAGE, x+xoffset, y+yoffset-2, sigIRC.panel);xoffset+=UPTIMEIMAGE.getWidth()+4;
		String timediff = TimeUtils.GetTimeDifferenceFromCurrentDate(uptime);
		if (timediff.length()>0) {
			DrawUtils.drawTextFont(g, sigIRC.panel.userFont, x+xoffset, y+yoffset+TextUtils.calculateStringBoundsFont(timediff, sigIRC.panel.userFont).getHeight()/2+3,new Color(184,181,192),timediff);xoffset+=TextUtils.calculateStringBoundsFont(timediff, sigIRC.panel.userFont).getWidth()+12;
		}
		yoffset+=16;
		return new Rectangle(x,y,xoffset,yoffset);
	}

	private void DrawFollowerAnnouncement(Graphics g) {
		if (lastFollowerAnnouncement>0) {
			final int ticksPassed = FOLLOWERANNOUNCEMENTTIME-lastFollowerAnnouncement;
			final int yAlteration = 
					(sigIRC.twitchmodule_follower_img_animation) 
					? Math.max(0,(int)(200-(ticksPassed*(200d/30))))
					: 0;
			final int canvasYOffset = 
					(sigIRC.twitchmodule_follower_img_animation) 
					? Math.min(follower_img.getHeight(),yAlteration)
					: 0;
			final int xAlteration = 
					(sigIRC.twitchmodule_follower_img_animation) 
					? (ticksPassed>=270)?(int)(-((ticksPassed-270)*(500d/30))):0
					: 0;
			final int canvasXOffset = 
					(sigIRC.twitchmodule_follower_img_animation) 
					? Math.min(follower_img.getWidth(),xAlteration)
					: 0;
			//System.out.println(yAlteration);
			//g.drawImage(follower_img, (int)bounds.getX()+xAlteration, (int)bounds.getY()+yAlteration, sigIRC.panel);
			//g.drawImage(follower_img, (int)bounds.getX(), (int)bounds.getY(), , , sigIRC.panel)
			g.drawImage(follower_img, (int)position.getX(), (int)position.getY()+canvasYOffset, (int)position.getX()+follower_img.getWidth()+canvasXOffset, (int)position.getY()+follower_img.getHeight(),
					-xAlteration, 0, follower_img.getWidth(), follower_img.getHeight()-yAlteration, sigIRC.panel);
//			Rectangle2D usernameTextsize = TextUtils.calculateStringBoundsFont(announcedFollowerUser.getDisplayName(), sigIRC.panel.programFont);
//			int textY = (int)position.getY()+sigIRC.twitchmodule_followerText_Y+yAlteration;
//			int textX = (int)position.getX()+sigIRC.twitchmodule_followerText_centerX+xAlteration;
//			if (textY<position.getY()+position.getHeight() && textX+usernameTextsize.getWidth()>position.getX()) {
//				DrawUtils.drawCenteredText(g, sigIRC.panel.programFont, (int)position.getX()+sigIRC.twitchmodule_followerText_centerX+xAlteration, (int)position.getY()+sigIRC.twitchmodule_followerText_Y+yAlteration, Color.BLACK, announcedFollowerUser.getDisplayName());	
//			}
//			if (announcedFollowerUser.getBio()!=null && !announcedFollowerUser.getBio().equalsIgnoreCase("null")) {
//				if (followerUserLogo!=null) {
//					final int image_size = sigIRC.twitchmodule_newfollowerImgLogoSize;
//					int img_startx = (int)(position.getX()+position.getWidth()-ticksPassed*3-(image_size+4));
//					int img_starty = (int)(position.getY()+follower_img.getHeight()+2-image_size/2);
//					//g.setColor(Color.BLACK);
//					//g.drawRect(img_startx, img_starty, image_size, image_size);
//					g.drawImage(followerUserLogo, img_startx, img_starty, img_startx+image_size, img_starty+image_size, 0, 0, followerUserLogo.getWidth(), followerUserLogo.getHeight(), TextUtils.convertStringToColor(sigIRC.twitchmodule_newfollowerImgBackgroundColor), sigIRC.panel);
//				}
//				if (announcedFollowerUser.getBio()!=null && announcedFollowerUser.getBio().length()>0) {
//					DrawUtils.drawOutlineText(g, sigIRC.panel.userFont, position.getX()+position.getWidth()-ticksPassed*3, position.getY()+follower_img.getHeight()+2+8, 2, TextUtils.convertStringToColor(sigIRC.twitchmodule_newfollowerTextColor), TextUtils.convertStringToColor(sigIRC.twitchmodule_newfollowerShadowTextColor), announcedFollowerUser.getBio());
//				}
//			}
		}
	}
}
