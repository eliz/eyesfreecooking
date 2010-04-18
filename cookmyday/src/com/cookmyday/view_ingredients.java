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

public class view_ingredients extends Activity implements OnClickListener {
	Button btnBack;
	Intent newScreen = null;
	TextView dish_name;
	StringBuffer sb = new StringBuffer();
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_recipe1);
		
		dish_name = (TextView) findViewById(R.id.dish_name);

		sb.append(Constants.currentDishName);
		sb.append("\n");
		dish_name.setText(sb.toString());
		
		
		btnBack = (Button) findViewById(R.id.Buttonback);
		btnBack.setOnClickListener(this);			
	}
	
	
	public void onClick(View v) {
		if (v == btnBack) {
			String lastPage = Constants.lastPage;
					//how to get back?
				
		}
		//else if (v == btnIngred){
		//	newScreen = new Intent(v.getContext(), view_ingredients.class);
		//	startActivityForResult(newScreen, 0);
		//}
	}
}