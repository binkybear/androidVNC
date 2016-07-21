package com.sun.jna.examples.unix;

public class XF86KeySymDef {
	/*
	 * XFree86 vendor specific keysyms.
	 *
	 * The XFree86 keysym range is 0x10080001 - 0x1008FFFF.
	 *
	 * X.Org will not be adding to the XF86 set of keysyms, though they have
	 * been adopted and are considered a "standard" part of X keysym definitions.
	 * XFree86 never properly commented these keysyms, so we have done our
	 * best to explain the semantic meaning of these keys.
	 *
	 * XFree86 has removed their mail archives of the period, that might have
	 * shed more light on some of these definitions. Until/unless we resurrect
	 * these archives, these are from memory and usage.
	 */
	
	/*
	 * ModeLock
	 *
	 * This one is old, and not really used any more since XKB offers this
	 * functionality.
	 */
	
	public static final int XF86XK_ModeLock		 = 0x1008FF01;	/* Mode Switch Lock */
	
	/* Backlight controls. */
	public static final int XF86XK_MonBrightnessUp    = 0x1008FF02;  /* Monitor/panel brightness */
	public static final int XF86XK_MonBrightnessDown  = 0x1008FF03;  /* Monitor/panel brightness */
	public static final int XF86XK_KbdLightOnOff      = 0x1008FF04;  /* Keyboards may be lit     */
	public static final int XF86XK_KbdBrightnessUp    = 0x1008FF05;  /* Keyboards may be lit     */
	public static final int XF86XK_KbdBrightnessDown  = 0x1008FF06;  /* Keyboards may be lit     */
	
	/*
	 * Keys found on some "Internet" keyboards.
	 */
	public static final int XF86XK_Standby		 = 0x1008FF10;   /* System into standby mode   */
	public static final int XF86XK_AudioLowerVolume	 = 0x1008FF11;   /* Volume control down        */
	public static final int XF86XK_AudioMute	 = 0x1008FF12;   /* Mute sound from the system */
	public static final int XF86XK_AudioRaiseVolume	 = 0x1008FF13;   /* Volume control up          */
	public static final int XF86XK_AudioPlay	 = 0x1008FF14;   /* Start playing of audio >   */
	public static final int XF86XK_AudioStop	 = 0x1008FF15;   /* Stop playing audio         */
	public static final int XF86XK_AudioPrev	 = 0x1008FF16;   /* Previous track             */
	public static final int XF86XK_AudioNext	 = 0x1008FF17;   /* Next track                 */
	public static final int XF86XK_HomePage		 = 0x1008FF18;   /* Display user's home page   */
	public static final int XF86XK_Mail		 = 0x1008FF19;   /* Invoke user's mail program */
	public static final int XF86XK_Start		 = 0x1008FF1A;   /* Start application          */
	public static final int XF86XK_Search		 = 0x1008FF1B;   /* Search                     */
	public static final int XF86XK_AudioRecord	 = 0x1008FF1C;   /* Record audio application   */
	
	/* These are sometimes found on PDA's (e.g. Palm, PocketPC or elsewhere)   */
	public static final int XF86XK_Calculator	 = 0x1008FF1D;   /* Invoke calculator program  */
	public static final int XF86XK_Memo		 = 0x1008FF1E;   /* Invoke Memo taking program */
	public static final int XF86XK_ToDoList		 = 0x1008FF1F;   /* Invoke To Do List program  */
	public static final int XF86XK_Calendar		 = 0x1008FF20;   /* Invoke Calendar program    */
	public static final int XF86XK_PowerDown	 = 0x1008FF21;   /* Deep sleep the system      */
	public static final int XF86XK_ContrastAdjust	 = 0x1008FF22;   /* Adjust screen contrast     */
	public static final int XF86XK_RockerUp		 = 0x1008FF23;   /* Rocker switches exist up   */
	public static final int XF86XK_RockerDown	 = 0x1008FF24;   /* and down                   */
	public static final int XF86XK_RockerEnter	 = 0x1008FF25;   /* and let you press them     */
	
	/* Some more "Internet" keyboard symbols */
	public static final int XF86XK_Back		 = 0x1008FF26;   /* Like back on a browser     */
	public static final int XF86XK_Forward		 = 0x1008FF27;   /* Like forward on a browser  */
	public static final int XF86XK_Stop		 = 0x1008FF28;   /* Stop current operation     */
	public static final int XF86XK_Refresh		 = 0x1008FF29;   /* Refresh the page           */
	public static final int XF86XK_PowerOff		 = 0x1008FF2A;   /* Power off system entirely  */
	public static final int XF86XK_WakeUp		 = 0x1008FF2B;   /* Wake up system from sleep  */
	public static final int XF86XK_Eject             = 0x1008FF2C;   /* Eject device (e.g. DVD)    */
	public static final int XF86XK_ScreenSaver       = 0x1008FF2D;   /* Invoke screensaver         */
	public static final int XF86XK_WWW               = 0x1008FF2E;   /* Invoke web browser         */
	public static final int XF86XK_Sleep             = 0x1008FF2F;   /* Put system to sleep        */
	public static final int XF86XK_Favorites	 = 0x1008FF30;   /* Show favorite locations    */
	public static final int XF86XK_AudioPause	 = 0x1008FF31;   /* Pause audio playing        */
	public static final int XF86XK_AudioMedia	 = 0x1008FF32;   /* Launch media collection app */
	public static final int XF86XK_MyComputer	 = 0x1008FF33;   /* Display "My Computer" window */
	public static final int XF86XK_VendorHome	 = 0x1008FF34;   /* Display vendor home web site */
	public static final int XF86XK_LightBulb	 = 0x1008FF35;   /* Light bulb keys exist       */
	public static final int XF86XK_Shop		 = 0x1008FF36;   /* Display shopping web site   */
	public static final int XF86XK_History		 = 0x1008FF37;   /* Show history of web surfing */
	public static final int XF86XK_OpenURL		 = 0x1008FF38;   /* Open selected URL           */
	public static final int XF86XK_AddFavorite	 = 0x1008FF39;   /* Add URL to favorites list   */
	public static final int XF86XK_HotLinks		 = 0x1008FF3A;   /* Show "hot" links            */
	public static final int XF86XK_BrightnessAdjust	 = 0x1008FF3B;   /* Invoke brightness adj. UI   */
	public static final int XF86XK_Finance		 = 0x1008FF3C;   /* Display financial site      */
	public static final int XF86XK_Community	 = 0x1008FF3D;   /* Display user's community    */
	public static final int XF86XK_AudioRewind	 = 0x1008FF3E;   /* "rewind" audio track        */
	public static final int XF86XK_BackForward	 = 0x1008FF3F;   /* ??? */
	public static final int XF86XK_Launch0		 = 0x1008FF40;   /* Launch Application          */
	public static final int XF86XK_Launch1		 = 0x1008FF41;   /* Launch Application          */
	public static final int XF86XK_Launch2		 = 0x1008FF42;   /* Launch Application          */
	public static final int XF86XK_Launch3		 = 0x1008FF43;   /* Launch Application          */
	public static final int XF86XK_Launch4		 = 0x1008FF44;   /* Launch Application          */
	public static final int XF86XK_Launch5		 = 0x1008FF45;   /* Launch Application          */
	public static final int XF86XK_Launch6		 = 0x1008FF46;   /* Launch Application          */
	public static final int XF86XK_Launch7		 = 0x1008FF47;   /* Launch Application          */
	public static final int XF86XK_Launch8		 = 0x1008FF48;   /* Launch Application          */
	public static final int XF86XK_Launch9		 = 0x1008FF49;   /* Launch Application          */
	public static final int XF86XK_LaunchA		 = 0x1008FF4A;   /* Launch Application          */
	public static final int XF86XK_LaunchB		 = 0x1008FF4B;   /* Launch Application          */
	public static final int XF86XK_LaunchC		 = 0x1008FF4C;   /* Launch Application          */
	public static final int XF86XK_LaunchD		 = 0x1008FF4D;   /* Launch Application          */
	public static final int XF86XK_LaunchE		 = 0x1008FF4E;   /* Launch Application          */
	public static final int XF86XK_LaunchF		 = 0x1008FF4F;   /* Launch Application          */
	
	public static final int XF86XK_ApplicationLeft	 = 0x1008FF50;   /* switch to application, left */
	public static final int XF86XK_ApplicationRight	 = 0x1008FF51;   /* switch to application, right*/
	public static final int XF86XK_Book		 = 0x1008FF52;   /* Launch bookreader           */
	public static final int XF86XK_CD		 = 0x1008FF53;   /* Launch CD/DVD player        */
	public static final int XF86XK_Calculater	 = 0x1008FF54;   /* Launch Calculater           */
	public static final int XF86XK_Clear		 = 0x1008FF55;   /* Clear window, screen        */
	public static final int XF86XK_Close		 = 0x1008FF56;   /* Close window                */
	public static final int XF86XK_Copy		 = 0x1008FF57;   /* Copy selection              */
	public static final int XF86XK_Cut		 = 0x1008FF58;   /* Cut selection               */
	public static final int XF86XK_Display		 = 0x1008FF59;   /* Output switch key           */
	public static final int XF86XK_DOS		 = 0x1008FF5A;   /* Launch DOS (emulation)      */
	public static final int XF86XK_Documents	 = 0x1008FF5B;   /* Open documents window       */
	public static final int XF86XK_Excel		 = 0x1008FF5C;   /* Launch spread sheet         */
	public static final int XF86XK_Explorer		 = 0x1008FF5D;   /* Launch file explorer        */
	public static final int XF86XK_Game		 = 0x1008FF5E;   /* Launch game                 */
	public static final int XF86XK_Go		 = 0x1008FF5F;   /* Go to URL                   */
	public static final int XF86XK_iTouch		 = 0x1008FF60;   /* Logitch iTouch- don't use   */
	public static final int XF86XK_LogOff		 = 0x1008FF61;   /* Log off system              */
	public static final int XF86XK_Market		 = 0x1008FF62;   /* ??                          */
	public static final int XF86XK_Meeting		 = 0x1008FF63;   /* enter meeting in calendar   */
	public static final int XF86XK_MenuKB		 = 0x1008FF65;   /* distingush keyboard from PB */
	public static final int XF86XK_MenuPB		 = 0x1008FF66;   /* distinuish PB from keyboard */
	public static final int XF86XK_MySites		 = 0x1008FF67;   /* Favourites                  */
	public static final int XF86XK_New		 = 0x1008FF68;   /* New (folder, document...    */
	public static final int XF86XK_News		 = 0x1008FF69;   /* News                        */
	public static final int XF86XK_OfficeHome	 = 0x1008FF6A;   /* Office home (old Staroffice)*/
	public static final int XF86XK_Open		 = 0x1008FF6B;   /* Open                        */
	public static final int XF86XK_Option		 = 0x1008FF6C;   /* ?? */
	public static final int XF86XK_Paste		 = 0x1008FF6D;   /* Paste                       */
	public static final int XF86XK_Phone		 = 0x1008FF6E;   /* Launch phone; dial number   */
	public static final int XF86XK_Q		 = 0x1008FF70;   /* Compaq's Q - don't use      */
	public static final int XF86XK_Reply		 = 0x1008FF72;   /* Reply e.g., mail            */
	public static final int XF86XK_Reload		 = 0x1008FF73;   /* Reload web page, file, etc. */
	public static final int XF86XK_RotateWindows	 = 0x1008FF74;   /* Rotate windows e.g. xrandr  */
	public static final int XF86XK_RotationPB	 = 0x1008FF75;   /* don't use                   */
	public static final int XF86XK_RotationKB	 = 0x1008FF76;   /* don't use                   */
	public static final int XF86XK_Save		 = 0x1008FF77;   /* Save (file, document, state */
	public static final int XF86XK_ScrollUp		 = 0x1008FF78;   /* Scroll window/contents up   */
	public static final int XF86XK_ScrollDown	 = 0x1008FF79;   /* Scrool window/contentd down */
	public static final int XF86XK_ScrollClick	 = 0x1008FF7A;   /* Use XKB mousekeys instead   */
	public static final int XF86XK_Send		 = 0x1008FF7B;   /* Send mail, file, object     */
	public static final int XF86XK_Spell		 = 0x1008FF7C;   /* Spell checker               */
	public static final int XF86XK_SplitScreen	 = 0x1008FF7D;   /* Split window or screen      */
	public static final int XF86XK_Support		 = 0x1008FF7E;   /* Get support (??)            */
	public static final int XF86XK_TaskPane		 = 0x1008FF7F;   /* Show tasks */
	public static final int XF86XK_Terminal		 = 0x1008FF80;   /* Launch terminal emulator    */
	public static final int XF86XK_Tools		 = 0x1008FF81;   /* toolbox of desktop/app.     */
	public static final int XF86XK_Travel		 = 0x1008FF82;   /* ?? */
	public static final int XF86XK_UserPB		 = 0x1008FF84;   /* ?? */
	public static final int XF86XK_User1KB		 = 0x1008FF85;   /* ?? */
	public static final int XF86XK_User2KB		 = 0x1008FF86;   /* ?? */
	public static final int XF86XK_Video		 = 0x1008FF87;   /* Launch video player       */
	public static final int XF86XK_WheelButton	 = 0x1008FF88;   /* button from a mouse wheel */
	public static final int XF86XK_Word		 = 0x1008FF89;   /* Launch word processor     */
	public static final int XF86XK_Xfer		 = 0x1008FF8A;
	public static final int XF86XK_ZoomIn		 = 0x1008FF8B;   /* zoom in view, map, etc.   */
	public static final int XF86XK_ZoomOut		 = 0x1008FF8C;   /* zoom out view, map, etc.  */
	
	public static final int XF86XK_Away		 = 0x1008FF8D;   /* mark yourself as away     */
	public static final int XF86XK_Messenger	 = 0x1008FF8E;   /* as in instant messaging   */
	public static final int XF86XK_WebCam		 = 0x1008FF8F;   /* Launch web camera app.    */
	public static final int XF86XK_MailForward	 = 0x1008FF90;   /* Forward in mail           */
	public static final int XF86XK_Pictures		 = 0x1008FF91;   /* Show pictures             */
	public static final int XF86XK_Music		 = 0x1008FF92;   /* Launch music application  */
	
	public static final int XF86XK_Battery		 = 0x1008FF93;   /* Display battery information */
	public static final int XF86XK_Bluetooth	 = 0x1008FF94;   /* Enable/disable Bluetooth    */
	public static final int XF86XK_WLAN		 = 0x1008FF95;   /* Enable/disable WLAN         */
	public static final int XF86XK_UWB		 = 0x1008FF96;   /* Enable/disable UWB	    */
	
	public static final int XF86XK_AudioForward	 = 0x1008FF97;   /* fast-forward audio track    */
	public static final int XF86XK_AudioRepeat	 = 0x1008FF98;   /* toggle repeat mode          */
	public static final int XF86XK_AudioRandomPlay	 = 0x1008FF99;   /* toggle shuffle mode         */
	public static final int XF86XK_Subtitle		 = 0x1008FF9A;   /* cycle through subtitle      */
	public static final int XF86XK_AudioCycleTrack	 = 0x1008FF9B;   /* cycle through audio tracks  */
	public static final int XF86XK_CycleAngle	 = 0x1008FF9C;   /* cycle through angles        */
	public static final int XF86XK_FrameBack	 = 0x1008FF9D;   /* video: go one frame back    */
	public static final int XF86XK_FrameForward	 = 0x1008FF9E;   /* video: go one frame forward */
	public static final int XF86XK_Time		 = 0x1008FF9F;   /* display, or shows an entry for time seeking */
	public static final int XF86XK_Select		 = 0x1008FFA0;   /* Select button on joypads and remotes */
	public static final int XF86XK_View		 = 0x1008FFA1;   /* Show a view options/properties */
	public static final int XF86XK_TopMenu		 = 0x1008FFA2;   /* Go to a top-level menu in a video */
	
	public static final int XF86XK_Red		 = 0x1008FFA3;   /* Red button                  */
	public static final int XF86XK_Green		 = 0x1008FFA4;   /* Green button                */
	public static final int XF86XK_Yellow		 = 0x1008FFA5;   /* Yellow button               */
	public static final int XF86XK_Blue              = 0x1008FFA6;   /* Blue button                 */
	
	public static final int XF86XK_Suspend		 = 0x1008FFA7;   /* Sleep to RAM                */
	public static final int XF86XK_Hibernate	 = 0x1008FFA8;   /* Sleep to disk               */
	public static final int XF86XK_TouchpadToggle	 = 0x1008FFA9;   /* Toggle between touchpad/trackstick */
	public static final int XF86XK_TouchpadOn	 = 0x1008FFB0;   /* The touchpad got switched on */
	public static final int XF86XK_TouchpadOff	 = 0x1008FFB1;   /* The touchpad got switched off */
	
	public static final int XF86XK_AudioMicMute	 = 0x1008FFB2;   /* Mute the Mic from the system */
	
	/* Keys for special action keys (hot keys) */
	/* Virtual terminals on some operating systems */
	public static final int XF86XK_Switch_VT_1	 = 0x1008FE01;
	public static final int XF86XK_Switch_VT_2	 = 0x1008FE02;
	public static final int XF86XK_Switch_VT_3	 = 0x1008FE03;
	public static final int XF86XK_Switch_VT_4	 = 0x1008FE04;
	public static final int XF86XK_Switch_VT_5	 = 0x1008FE05;
	public static final int XF86XK_Switch_VT_6	 = 0x1008FE06;
	public static final int XF86XK_Switch_VT_7	 = 0x1008FE07;
	public static final int XF86XK_Switch_VT_8	 = 0x1008FE08;
	public static final int XF86XK_Switch_VT_9	 = 0x1008FE09;
	public static final int XF86XK_Switch_VT_10	 = 0x1008FE0A;
	public static final int XF86XK_Switch_VT_11	 = 0x1008FE0B;
	public static final int XF86XK_Switch_VT_12	 = 0x1008FE0C;
	
	public static final int XF86XK_Ungrab		 = 0x1008FE20;   /* force ungrab               */
	public static final int XF86XK_ClearGrab	 = 0x1008FE21;   /* kill application with grab */
	public static final int XF86XK_Next_VMode	 = 0x1008FE22;   /* next video mode available  */
	public static final int XF86XK_Prev_VMode	 = 0x1008FE23;   /* prev. video mode available */
	public static final int XF86XK_LogWindowTree	 = 0x1008FE24;   /* print window tree to log   */
	public static final int XF86XK_LogGrabInfo	 = 0x1008FE25;   /* print all active grabs to log */
}
