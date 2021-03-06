package com.cookmyday;

import java.util.HashMap;

/** CS3248 G4
 * this class makes it easier for xml to work with since all the constants here are some sort of global variables
*/

public class Constants {
	static int TOTALNUMSTEPS = 16;
	static int TOTALNUM_INGRED = 5; //starts from 0
	static String[] recipe = {"1. Place rice into mixing bowl with cool water", 
		"2. Swirl the rice in water then pour off the water", 
		"3. Repeat the previous steps 2 to 3 times until the water is clear",
		"4. Place rice and 2 cups of water into a median saucepan and place over high heat", 
		"5. Bring to boil uncovered", 
		"6. Once it begins to boil, reduce heat to the lowest setting and cover for 15 minutes",
		"7. Timer for 15minutes have started",
		"8. Remove from heat and let stand, covered, for 10minutes", 
		"9. Timer for 10minutes have started",
		"10. Combine rice vinegar, sugar and salt in a small bowl", 
		"11. Transfer the rice into a large mixing bowl and add the vinegar mixture", 
		"12. Fold thoroughly to combine and coat each grain of rice with the mixture",
		"13. Allow to cool to room temperature",
		"14. Fill a rice bowl halfway with rice",
		"15. Place in abit of salmon in the middle",
		"16. Remove the contents of the rice bowl with wet hands, be careful to not drop the salmon",
		"17. Press the rice and salmon together, with the salmon inside and unexposed",
		"18. Put some salt on your palm, continue to press the rice ball into triangular shape",
		"19. Place a piece of seaweed at the bottom of the rice ball to complete the onigiri"};
	
	static String[] ingredients = {"Rice", "Japanese rice vinegar", "Sugar", "Salt", "Salmon spread", "Seaweed"};
	static String[] quantity = {"2 cups", "3 tablespoon", "3 tablespoon", "2 teaspoon", "1 can", "a few pieces"};
	static boolean[] bought = {false, false, false, false, false, false};
	static int currentStepNo = 0;
	
	static HashMap<Integer,Integer> timer = new HashMap<Integer,Integer>();
	
	static String currentDishName = "Simple Salmon Onigiri";
	static String dishDescription = "A simple dish with salmon and rice in harmony. Have fun making your own onigiri " +
			"and bring in your own creativity in making your own shape and sizes after you have master this dish!";
	static String lastPage = "";
	
	static void updateStepNo (){
		if (currentStepNo -1 == TOTALNUMSTEPS){
			//last step already, do nth
		} else {
			currentStepNo++;
		}
	}
	
	static boolean updateStepNoPrev (){
		if (currentStepNo > 0){
			currentStepNo --;
			return true;
		} else {
			return false;
		}
	}
}