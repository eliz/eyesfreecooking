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

public class find_recipe extends Activity implements OnClickListener {
	Button btnBack;
	Button btnBrowse;
	Button btnSearch;
	Button btnDetails;
	Intent newScreen = null;
	TextView dish_name;
	TextView dish_description;
	StringBuffer sb = new StringBuffer();
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_recipe1);
		
		dish_name = (TextView) findViewById(R.id.dish_name);

		sb.append(Constants.currentDishName);
		sb.append("\n");
		dish_name.setText(sb.toString());
		
		dish_description = (TextView) findViewById(R.id.dish_description);
		
		sb.delete(0, sb.length());
		sb.append(Constants.dishDescription);
		dish_description.setText(sb.toString());
		
		btnBack = (Button) findViewById(R.id.Buttonback);
		btnBrowse = (Button) findViewById(R.id.ButtonBrowse);
		btnSearch = (Button) findViewById(R.id.ButtonSearch);
		btnDetails = (Button) findViewById(R.id.Buttondetails);
		btnBack.setOnClickListener(this);
		btnBrowse.setOnClickListener(this);
		btnSearch.setOnClickListener(this);		
		btnDetails.setOnClickListener(this);		
	}
	
	
	public void onClick(View v) {
		if (v == btnBack) {
			String lastPage = Constants.lastPage;
					//how to get back?
				
		} else if (v == btnBrowse){
			//do nth for now
		} else if (v == btnSearch){
			//do nth for now
		} else if (v == btnDetails){
			newScreen = new Intent(v.getContext(), view_recipe.class);
			startActivityForResult(newScreen, 0);
		}
			
	}
}