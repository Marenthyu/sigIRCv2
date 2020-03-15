package sig.modules.RabiRibi;

public enum MemoryOffset {
	MONEY(0x167C10C,0x12DA99C+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12DA9AC+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12FE9B4,0x167908C,0),
	PLAYTIME(0x167C7B0,0x12D97A8+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12DB050+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12DB040+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1679734,0), //In frames (Rabi-Ribi runs at 60FPS). Uses Total Playtime.
	//UNKNOWN1(0xD65BDC), //???? Originally assumed to be "Health Ups".
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
	
	
	
	GAME_DIFFICULTY(0x167AF78,0xD64338+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12D9818+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12D9808+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1677EF8,0), //0=Casual, 5=BEX. See DifficultyStruct.java for more.
	GAME_LOOP(0x1683C9C,0xD6D05C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12E253C+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12E252C+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1680C1C,0),
	
	HAMMER(0xD632B0,0xD632B0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	AIR_JUMP(0xD632B4,0xD632B4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SLIDING_POWDER(0xD632B8,0xD632B8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	CARROT_BOMB(0xD632BC,0xD632BC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	HOURGLASS(0xD632C0,0xD632C0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SPEED_BOOST(0xD632C4,0xD632C4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	AUTO_EARRINGS(0xD632C8,0xD632C8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	RIBBON(0xD632CC,0xD632CC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SOUL_HEART(0xD632D0,0xD632D0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	RABI_SLIPPERS(0xD632D4,0xD632D4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BUNNY_WHIRL(0xD632D8,0xD632D8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	QUICK_BARETTE(0xD632DC,0xD632DC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BOOK_OF_CARROT(0xD632E0,0xD632E0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	CHAOS_ROD(0xD632E4,0xD632E4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	HAMMER_WAVE(0xD632E8,0xD632E8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	HAMMER_ROLL(0xD632EC,0xD632EC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	LIGHT_ORB(0xD632F0,0xD632F0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	WATER_ORB(0xD632F4,0xD632F4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	FIRE_ORB(0xD632F8,0xD632F8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	NATURE_ORB(0xD632FC,0xD632FC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD632FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD632FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	P_HAIRPIN(0xD63300,0x12D87D0+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12D87D0+OffsetHelper.MEMORY_OFFSET_V185_TO_V1881,0x12D87D0+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SUNNY_BEAM(0xD63304,0xD63304+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63304+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63304+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	PLUS_NECKLACE(0xD63308,0xD63308+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63308+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63308+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	CYBER_FLOWER(0xD6330C,0xD6330C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6330C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6330C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	HEALING_STAFF(0xD63310,0xD63310+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63310+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63310+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	MAX_BRACELET(0xD63314,0xD63314+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63314+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63314+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	EXPLODE_SHOT(0xD63318,0xD63318+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63318+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63318+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	AIR_DASH(0xD6331C,0xD6331C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6331C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6331C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BUNNY_STRIKE(0xD63320,0xD63320+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63320+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63320+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	STRANGE_BOX(0xD63324,0xD63324+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63324+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63324+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	WALL_JUMP(0xD63328,0xD63328+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63328+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63328+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SPIKE_BARRIER(0xD6332C,0xD6332C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6332C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6332C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BUNNY_AMULET(0xD63330,0xD63330+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63330+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63330+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	CHARGE_RING(0xD63334,0xD63334+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63334+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63334+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	CARROT_SHOOTER(0xD63338,0xD63338+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63338+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63338+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	SUPER_CARROT(0xD6333C,0xD6333C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6333C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6333C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	RUMI_DONUT(0xD63340,0xD63340+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63340+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63340+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	RUMI_CAKE(0xD63344,0xD63344+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63344+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63344+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	GOLD_CARROT(0xD63348,0xD63348+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63348+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63348+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	COCOA_BOMB(0xD6334C,0xD6334C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6334C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6334C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM1(0xD63350,0xD63350+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63350+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63350+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	TROPHY(0xD63354,0xD63354+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63354+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63354+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	EXCLAMATION_POINT(0xD63358,0xD63358+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63358+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63358+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM2(0xD6335C,0xD6335C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6335C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6335C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM3(0xD63360,0xD63360+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63360+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63360+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM4(0xD63364,0xD63364+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63364+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63364+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	RAINBOW_MAGIC(0xD63368,0xD63368+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63368+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63368+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM5(0xD6336C,0xD6336C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6336C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6336C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM6(0xD63370,0xD63370+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63370+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63370+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM7(0xD63374,0xD63374+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63374+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63374+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM8(0xD63378,0xD63378+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63378+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63378+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM9(0xD6337C,0xD6337C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6337C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6337C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM10(0xD63380,0xD63380+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63380+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63380+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM11(0xD63384,0xD63384+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63384+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63384+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM12(0xD63388,0xD63388+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63388+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63388+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM13(0xD6338C,0xD6338C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6338C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6338C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	UNKNOWN_ITEM14(0xD63390,0xD63390+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63390+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63390+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	/*DLC_ITEM1(0xD63394,0xD63394+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851),
	DLC_ITEM2(0xD63398,0xD63398+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851),*/
	BUNNY_CLOVER(0xD6339C,0xD6339C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0x12D887C+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12D886C+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	FAIRYS_FLUTE(0x1679FE4,0x12D8874+OffsetHelper.KEY_ITEM_OFFSET_V185_TO_V1851,0x12D8884+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12D8874+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1676F64,0),
	BUNNY_MEMORIES(0x1679FE8,0x12D7878,0x12D8888+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12D8888-0x10+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1676F68,0),
	WIND_BLESSING(0x1679FE0,0x12D7870,0x12D8880+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x12D8880-0x10+OffsetHelper.MEMORY_OFFSET_V1881_TO_V190,0x1676F60,0),
	DLC_ITEM4(0xD633A0,0xD633A0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633A0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633A0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_HEALTH_PLUS(0xD633AC,0xD633AC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633AC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633AC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_HEALTH_SURGE(0xD633B0,0xD633B0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633B0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_MANA_PLUS(0xD633B4,0xD633B4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633B4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_MANA_SURGE(0xD633B8,0xD633B8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633B8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_CRISIS_BOOST(0xD633BC,0xD633BC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633BC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_ATK_GROW(0xD633C0,0xD633C0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633C0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_DEF_GROW(0xD633C4,0xD633C4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633C4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_ATK_TRADE(0xD633C8,0xD633C8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633C8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_DEF_TRADE(0xD633CC,0xD633CC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633CC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_ARM_STRENGTH(0xD633D0,0xD633D0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633D0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_CARROT_BOOST(0xD633D4,0xD633D4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633D4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_WEAKEN(0xD633D8,0xD633D8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633D8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_SELF_DEFENSE(0xD633DC,0xD633DC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633DC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_ARMORED(0xD633E0,0xD633E0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633E0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_LUCKY_SEVEN(0xD633E4,0xD633E4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633E4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_HEX_CANCEL(0xD633E8,0xD633E8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633E8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_PURE_LOVE(0xD633EC,0xD633EC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633EC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_TOXIC_STRIKE(0xD633F0,0xD633F0+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633F0+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_FRAME_CANCEL(0xD633F4,0xD633F4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633F4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_HEALTH_WAGER(0xD633F8,0xD633F8+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633F8+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_MANA_WAGER(0xD633FC,0xD633FC+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD633FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD633FC+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_STAMINA_PLUS(0xD63400,0xD63400+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63400+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63400+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_BLESSED(0xD63404,0xD63404+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63404+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63404+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_HITBOX_DOWN(0xD63408,0xD63408+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63408+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63408+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_CASHBACK(0xD6340C,0xD6340C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6340C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6340C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_SURVIVAL(0xD63410,0xD63410+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63410+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63410+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_TOP_FORM(0xD63414,0xD63414+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63414+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63414+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_TOUGH_SKIN(0xD63418,0xD63418+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63418+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63418+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_ERINA_BADGE(0xD6341C,0xD6341C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6341C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6341C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_RIBBON_BADGE(0xD63420,0xD63420+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63420+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63420+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_AUTO_TRIGGER(0xD63424,0xD63424+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63424+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63424+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	BADGE_LILITHS_GIFT(0xD63428,0xD63428+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63428+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63428+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),

	HEALTHUP_START(0xD6342C,0xD6342C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6342C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6342C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	HEALTHUP_END(0xD63528,0xD63528+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63528+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63528+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	ATTACKUP_START(0xD6352C,0xD6352C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6352C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6352C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	ATTACKUP_END(0xD63628,0xD63628+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63628+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63628+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	MANAUP_START(0xD6362C,0xD6362C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6362C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6362C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	MANAUP_END(0xD63728,0xD63728+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63728+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63728+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	REGENUP_START(0xD6372C,0xD6372C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6372C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6372C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	REGENUP_END(0xD63828,0xD63828+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63828+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63828+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	PACKUP_START(0xD6382C,0xD6382C+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD6382C+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD6382C+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	PACKUP_END(0xD63928,0xD63928+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD63928+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD63928+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	//13413E8
	
	ITEM_PERCENT(0x16E8080,0x13413E8,0x1342408+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x1366408,0x16E4900,0), //Float
	MAP_PERCENT(0x16E807C,0x13413E4,0x1342404+OffsetHelper.MEMORY_OFFSET_V188_TO_V1881,0x1366404,0x16E48FC,0), //Float
	RAINBOW_EGG_COUNT(0xD65FD4,0xD65FD4+OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V1851,0xD65FD4+OffsetHelper.MEMORY_OFFSET_V175_TO_V1881,0xD65FD4+OffsetHelper.MEMORY_OFFSET_V175_TO_V190,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199,OffsetHelper.KEY_ITEM_OFFSET_V175_TO_V199T),
	PAUSED(0x1038D88,0xC969A0,0xC979A0,0xCBB9AC,0x1036D88,0),
	TITLE_SCREEN(0x16893F4,0,0,0,0,0), //State becomes 10 on the title screen.
	
	EVENT_START(0x167A700,0,0,0,0,0),
	EVENT_END(0x167AB24,0,0,0,0,0),
	
	MAP_TILE_X(0x13B6D2C,0,0,0,0,0),
	MAP_TILE_Y(0x16AA130,0,0,0,0,0),
	MAP_AREA_NUMBER(0xD87FA4,0,0,0,0,0),
	MAP_REGION_START(0x1672E64,0,0,0,0,0),
	MAP_REGION_END(0x16774B3,0,0,0,0,0),
	
	MESSAGE_TIMER(0x16EA4AC,0,0,0,0,0),
	MESSAGE_CHARACTER(0x16EA47C,0,0,0,0,0),
	MESSAGE_TEXT(0x17A8DE8,0,0,0,0,0), //This references the 27th location of text. Use 27 for TEXTREF value.
	MESSAGE_TEXTREF(0x16EA4B0,0,0,0,0,0), //This should be 27 as this allows for MESSAGE_TEXT to be our "custom message" handler.
	
	BOSS_FIGHT(0x16E7D9C,0,0,0,0,0), //Should be 1 when in a boss fight.
	;
	
	long base_offset;
	long offset_v185;
	long offset_v188;
	long offset_v190;
	long offset_v199;
	long offset_v199t;
	long latest_offset;
	
	MemoryOffset(long offset,long offset_v185,long offset_v188,long offset_v190,long offset_v199,long offset_v199t) {
		this.base_offset=offset;
		this.offset_v185=offset_v185;
		this.offset_v188=offset_v188;
		this.offset_v190=offset_v190;
		this.offset_v199=offset_v199;
		this.offset_v199t=offset_v199t;
		
		//TODO CHANGE THIS IF PUBLIC VERSION CHANGES!
		this.latest_offset = offset_v199t;
	}
	
	public long getOffset() {
		return base_offset+latest_offset;
	}
	
	public long getOriginalOffset() {
		return base_offset;
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
	final static long MEMORY_OFFSET_V1881_TO_V190 = 0x24018;
	final static long MEMORY_OFFSET_V175_TO_V190 = MEMORY_OFFSET_V175_TO_V1881+MEMORY_OFFSET_V1881_TO_V190;
	final static long KEY_ITEM_OFFSET_V175_TO_V199 = 0x913BC0;
	final static long KEY_ITEM_OFFSET_V175_TO_V199T = 0x916C40;
}