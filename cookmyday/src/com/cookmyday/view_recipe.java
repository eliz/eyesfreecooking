


package com.cookmyday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/** CS3248 G4
*/

public class view_recipe extends Activity implements OnClickListener {
	Button btnBack;
	Button btnIngred;
	Button btnVideo;
	Intent newScreen = null;
	TextView dish_name;
	TextView dish_description;
	StringBuffer sb = new StringBuffer();
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_recipe);
		
		dish_name = (TextView) findViewById(R.id.dish_name);

		sb.append(Constants.currentDishName);
		sb.append("\n");
		dish_name.setText(sb.toString());
		
		dish_description = (TextView) findViewById(R.id.dish_description);
		
		sb.delete(0, sb.length());
		sb.append(Constants.dishDescription);
		dish_description.setText(sb.toString());
		
		btnBack = (Button) findViewById(R.id.Buttonback);
		btnIngred = (Button) findViewById(R.id.ButtonIngred);
		btnVideo = (Button) findViewById(R.id.ButtonVideo);
		btnBack.setOnClickListener(this);
		btnIngred.setOnClickListener(this);
		btnBack.setOnClickListener(this);			
	}
	
	
	public void onClick(View v) {
		if (v == btnBack) {
			String lastPage = Constants.lastPage;
					//how to get back?
				
		} else if (v == btnIngred){
			newScreen = new Intent(v.getContext(), view_ingredients.class);
			startActivityForResult(newScreen, 0);
		} else if (v == btnVideo){
			//do nth for now
		}
	}
}