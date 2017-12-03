package sig.modules.RabiRibi;

public enum MemoryOffset {
	MONEY(0xD654CC,0x12DA99C+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12DA9AC+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	PLAYTIME(0xD642D8,0x12D97A8+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12DB050+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881), //In frames (Rabi-Ribi runs at 60FPS).
	//UNKNOWN1(0xD65BDC), //???? Originally assumed to be "Health Ups".
	HEALTHUP_START(0xD6342C,0xD6342C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6342C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	HEALTHUP_END(0xD63528,0xD63528+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63528+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	ATTACKUP_START(0xD6352C,0xD6352C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6352C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	ATTACKUP_END(0xD63628,0xD63628+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63628+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	MANAUP_START(0xD6362C,0xD6362C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6362C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	MANAUP_END(0xD63728,0xD63728+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63728+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	REGENUP_START(0xD6372C,0xD6372C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6372C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	REGENUP_END(0xD63828,0xD63828+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63828+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	PACKUP_START(0xD6382C,0xD6382C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6382C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	PACKUP_END(0xD63928,0xD63928+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63928+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	/*ENTITY_ARRAY(0x0096DA3C), //Erina Data Pointer.
	ERINA_HP(0x4D8),
	ERINA_MAXHP(0x4E8),
	ERINA_XPOS(0xC),
	ERINA_YPOS(0x10),
	ERINA_XSPEED(0x470), //Relative to Entity Array.
	ERINA_YSPEED(0x474), //Relative to Entity Array.
	MAPID(0xA600AC),
	CAMERA_XPOS(0x991AF4),
	CAMERA_YPOS(0xABD0A4),
	//ENTITY_SIZE(0x704),
	ENTITY_ID(0x4F4),
	ENTITY_HP(0x4D8),
	ENTITY_MAXHP(0x4E8),
	ENTITY_ISACTIVE(0x674),
	ENTITY_ANIMATION(0x678),
	ENTITY_XPOS(0xC),
	ENTITY_YPOS(0x10),
	ENTITY_COLOR(0x1C),
	TRANSITION_COUNTER(0xA7661C),*/
	//WARP_TRANSITION_COUNTER(0,0x582CE0+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851), //Detects pausing
	
	
	
	GAME_DIFFICULTY(0xD64338,0xD64338+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12D9818+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	GAME_LOOP(0xD6D05C,0xD6D05C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12E253C+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	
	HAMMER(0xD632B0,0xD632B0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	AIR_JUMP(0xD632B4,0xD632B4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	SLIDING_POWDER(0xD632B8,0xD632B8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	CARROT_BOMB(0xD632BC,0xD632BC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	HOURGLASS(0xD632C0,0xD632C0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	SPEED_BOOST(0xD632C4,0xD632C4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	AUTO_EARRINGS(0xD632C8,0xD632C8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	RIBBON(0xD632CC,0xD632CC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	SOUL_HEART(0xD632D0,0xD632D0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	RABI_SLIPPERS(0xD632D4,0xD632D4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BUNNY_WHIRL(0xD632D8,0xD632D8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	QUICK_BARETTE(0xD632DC,0xD632DC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BOOK_OF_CARROT(0xD632E0,0xD632E0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	CHAOS_ROD(0xD632E4,0xD632E4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	HAMMER_WAVE(0xD632E8,0xD632E8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	HAMMER_ROLL(0xD632EC,0xD632EC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	LIGHT_ORB(0xD632F0,0xD632F0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	WATER_ORB(0xD632F4,0xD632F4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	FIRE_ORB(0xD632F8,0xD632F8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	NATURE_ORB(0xD632FC,0xD632FC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	P_HAIRPIN(0xD63300,0x12D87D0+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12D87D0+OffsetHelper.MEMORY_OFFSET_V185_TO_V1881),
	SUNNY_BEAM(0xD63304,0xD63304+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63304+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	PLUS_NECKLACE(0xD63308,0xD63308+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63308+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	CYBER_FLOWER(0xD6330C,0xD6330C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6330C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	HEALING_STAFF(0xD63310,0xD63310+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63310+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	MAX_BRACELET(0xD63314,0xD63314+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63314+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	EXPLODE_SHOT(0xD63318,0xD63318+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63318+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	AIR_DASH(0xD6331C,0xD6331C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6331C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BUNNY_STRIKE(0xD63320,0xD63320+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63320+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	STRANGE_BOX(0xD63324,0xD63324+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63324+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	WALL_JUMP(0xD63328,0xD63328+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63328+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	SPIKE_BARRIER(0xD6332C,0xD6332C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6332C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BUNNY_AMULET(0xD63330,0xD63330+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63330+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	CHARGE_RING(0xD63334,0xD63334+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63334+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	CARROT_SHOOTER(0xD63338,0xD63338+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63338+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	SUPER_CARROT(0xD6333C,0xD6333C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6333C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	RUMI_DONUT(0xD63340,0xD63340+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63340+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	RUMI_CAKE(0xD63344,0xD63344+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63344+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	GOLD_CARROT(0xD63348,0xD63348+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63348+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	COCOA_BOMB(0xD6334C,0xD6334C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6334C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM1(0xD63350,0xD63350+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63350+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	TROPHY(0xD63354,0xD63354+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63354+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	EXCLAMATION_POINT(0xD63358,0xD63358+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63358+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM2(0xD6335C,0xD6335C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6335C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM3(0xD63360,0xD63360+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63360+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM4(0xD63364,0xD63364+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63364+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	RAINBOW_MAGIC(0xD63368,0xD63368+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63368+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM5(0xD6336C,0xD6336C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6336C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM6(0xD63370,0xD63370+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63370+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM7(0xD63374,0xD63374+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63374+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM8(0xD63378,0xD63378+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63378+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM9(0xD6337C,0xD6337C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6337C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM10(0xD63380,0xD63380+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63380+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM11(0xD63384,0xD63384+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63384+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM12(0xD63388,0xD63388+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63388+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM13(0xD6338C,0xD6338C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6338C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	UNKNOWN_ITEM14(0xD63390,0xD63390+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63390+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	/*DLC_ITEM1(0xD63394,0xD63394+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851),
	DLC_ITEM2(0xD63398,0xD63398+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851),*/
	BUNNY_CLOVER(0xD6339C,0xD6339C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12D887C+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	FAIRYS_FLUTE(0,0x12D8874+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12D8884+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	BUNNY_MEMORIES(0,0x12D7878,0x12D8888+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	WIND_BLESSING(0,0x12D7870,0x12D8880+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	DLC_ITEM4(0xD633A0,0xD633A0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633A0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_HEALTH_PLUS(0xD633AC,0xD633AC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633AC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_HEALTH_SURGE(0xD633B0,0xD633B0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_MANA_PLUS(0xD633B4,0xD633B4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_MANA_SURGE(0xD633B8,0xD633B8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_CRISIS_BOOST(0xD633BC,0xD633BC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_ATK_GROW(0xD633C0,0xD633C0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_DEF_GROW(0xD633C4,0xD633C4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_ATK_TRADE(0xD633C8,0xD633C8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_DEF_TRADE(0xD633CC,0xD633CC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_ARM_STRENGTH(0xD633D0,0xD633D0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_CARROT_BOOST(0xD633D4,0xD633D4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_WEAKEN(0xD633D8,0xD633D8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_SELF_DEFENSE(0xD633DC,0xD633DC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_ARMORED(0xD633E0,0xD633E0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_LUCKY_SEVEN(0xD633E4,0xD633E4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_HEX_CANCEL(0xD633E8,0xD633E8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_PURE_LOVE(0xD633EC,0xD633EC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_TOXIC_STRIKE(0xD633F0,0xD633F0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_FRAME_CANCEL(0xD633F4,0xD633F4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_HEALTH_WAGER(0xD633F8,0xD633F8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_MANA_WAGER(0xD633FC,0xD633FC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_STAMINA_PLUS(0xD63400,0xD63400+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63400+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_BLESSED(0xD63404,0xD63404+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63404+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_HITBOX_DOWN(0xD63408,0xD63408+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63408+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_CASHBACK(0xD6340C,0xD6340C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6340C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_SURVIVAL(0xD63410,0xD63410+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63410+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_TOP_FORM(0xD63414,0xD63414+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63414+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_TOUGH_SKIN(0xD63418,0xD63418+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63418+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_ERINA_BADGE(0xD6341C,0xD6341C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6341C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_RIBBON_BADGE(0xD63420,0xD63420+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63420+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_AUTO_TRIGGER(0xD63424,0xD63424+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63424+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	BADGE_LILITHS_GIFT(0xD63428,0xD63428+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63428+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	//13413E8
	ITEM_PERCENT(0,0x13413E8,0x1342408+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	MAP_PERCENT(0,0x13413E4,0x1342404+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881),
	RAINBOW_EGG_COUNT(0xD65FD4,0xD65FD4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD65FD4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881),
	PAUSED(0,0xC969A0,0xC979A0),
	;
	
	long offset;
	long offset_v185;
	long offset_v188;
	long latest_offset;
	
	MemoryOffset(long offset,long offset_v185,long offset_v188) {
		this.offset=offset;
		this.offset_v185=offset_v185;
		this.offset_v188=offset_v188;
		
		//TODO CHANGE THIS IF PUBLIC VERSION CHANGES!
		this.latest_offset = offset_v188;
	}
	
	public long getOffset() {
		return latest_offset;
	}
	
	public long getOffsetV175() {
		return offset;
	}
	
	public long getOffsetV185() {
		return offset_v185;
	}
	
	public long getOffsetV188() {
		return offset_v188;
	}
}

class OffsetHelper{
	final static long KEY_ITEM_OFFSET_V175_TO_V185 = 0x5754D0;
	final static long KEY_ITEM_OFFSET_V175_TO_V1851 = 0x5744D0;
	final static long KEY_ITEM_OFFSET_V175_TO_V188 = 0x5754E0;
	final static long KEY_ITEM_OFFSET_V185_TO_V1851 = -0x1000;
	final static long KEY_ITEM_OFFSET_V1851_TO_V188 = -0xFF0;
	final static long KEY_ITEM_OFFSET_V185_TO_V188 = 0x10;
	final static long BADGE_OFFSET_V175_TO_V188 = 0x5754E0;
	final static long MEMORY_OFFSET_V188_TO_V1881 = -0x10;
	final static long MEMORY_OFFSET_V185_TO_V1881 = KEY_ITEM_OFFSET_V185_TO_V188+MEMORY_OFFSET_V188_TO_V1881;
	final static long MEMORY_OFFSET_V175_TO_V1881 = KEY_ITEM_OFFSET_V175_TO_V188+MEMORY_OFFSET_V188_TO_V1881;
}
