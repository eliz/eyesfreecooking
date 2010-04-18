package com.cookmyday;

/** CS3248 
 * I hope it's working
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mainmenu extends Activity implements OnClickListener {
	Button btnOne;
	Button btnTwo;
	Button btnThree;
	Button btnFour;
	Button btnQn;
	Intent newScreen = null;
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		btnOne = (Button) findViewById(R.id.Button01);
		btnTwo = (Button) findViewById(R.id.Button02);
		btnThree = (Button) findViewById(R.id.Button03);
		btnFour = (Button) findViewById(R.id.Button04);
		btnQn = (Button) findViewById(R.id.Button05);
		btnOne.setOnClickListener(this);
		btnTwo.setOnClickListener(this);
		btnThree.setOnClickListener(this);
		btnFour.setOnClickListener(this);
		btnQn.setOnClickListener(this);
	}
	
	
	/** Called when the Next button is pressed. */
	public void onClick(View v) {
		if (v == btnOne) {
				newScreen = new Intent(v.getContext(), find_recipe.class);
				startActivityForResult(newScreen, 0);
			} else if (v == btnTwo){
				newScreen = new Intent(v.getContext(), grocery_list.class);
				startActivityForResult(newScreen, 0);
			} else if (v == btnThree){
				newScreen = new Intent(v.getContext(), cooking_steps.class);
				startActivityForResult(newScreen, 0);
			} else if (v == btnFour){
				newScreen = new Intent(v.getContext(), Dummy.class);
				startActivityForResult(newScreen, 0);
			} else if (v == btnQn){
				newScreen = new Intent(v.getContext(), HelpPage.class);
				startActivityForResult(newScreen, 0);
			}
	}
}