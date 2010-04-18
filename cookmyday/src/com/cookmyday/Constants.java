package com.cookmyday;

/** CS3248 G4
 * this class makes it easier for xml to work with since all the constants here are some sort of global variables
 * jiayou!
*/

public class Constants {
	static final int	RESET = 10;
	
	//we don't need any logging right?
	//static final String	PWD_FILE = "BPPwd", NUM_LOG_FILE = "BPNumLog",
	//						STROKEDIALER_LOG_FILE = "BPStrokeDialerLog",
	//						WHEEL_LOG_FILE = "BPWheelLog",
	//						MUSIC_LOG_FILE = "BPMusicLog";

	static String currentUser = "User 1";
	
	static void setUser (String User){
		currentUser = User;
	}
	
}
