package com.cookmyday;


/** CS3248 G4
 * this class makes it easier for xml to work with since all the constants here are some sort of global variables
*/

public class Constants {
	static int TOTALNUMSTEPS = 9;
	static int TOTALNUM_INGRED = 2; //starts from 0
	static String[] recipe = {"This is step 1", "this is step 2...", "we're at step 3", 
		"moving on to step 4 :)", "step 5 here", "kinda boring? no way, i'm step 6!", "step 7", 
		"step 8", "step 9, which was eaten by 7?", "FINAL STEP!!! step 10!!"};
	static String[] ingredients = {"chicken", "chicky", "egg"};
	static int currentStepNo = 0;
	
	static String currentDishName = "Empty Dish Nameee";
	
	static void updateStepNo (){
		if (currentStepNo -1 == TOTALNUMSTEPS){
			//last step already, do nth
		} else {
			currentStepNo++;
		}
	}
	
	static void updateStepNoPrev (){
		if (currentStepNo > 0){
			currentStepNo --;
		}
	}
}