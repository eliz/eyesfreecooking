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
	TextView ingredient1;
	TextView ingredient2;
	TextView ingredient3;
	TextView ingredient4;
	TextView ingredient5;
	TextView ingredient6;
	TextView quantity1;
	TextView quantity2;
	TextView quantity3;
	TextView quantity4;
	TextView quantity5;
	TextView quantity6;
	
	StringBuffer sb = new StringBuffer();
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_ingredients);
		
		dish_name = (TextView) findViewById(R.id.dish_name);

		sb.append(Constants.currentDishName);
		sb.append("\n");
		dish_name.setText(sb.toString());
		
		ingredient1 = (TextView) findViewById(R.id.Ingredient1);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[0]);
		ingredient1.setText(sb.toString());
		
		ingredient2 = (TextView) findViewById(R.id.Ingredient2);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[1]);
		ingredient2.setText(sb.toString());
		
		ingredient3 = (TextView) findViewById(R.id.Ingredient3);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[2]);
		ingredient3.setText(sb.toString());
		
		ingredient4 = (TextView) findViewById(R.id.Ingredient4);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[3]);
		ingredient4.setText(sb.toString());
		
		ingredient5 = (TextView) findViewById(R.id.Ingredient5);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[4]);
		ingredient5.setText(sb.toString());
		
		ingredient6 = (TextView) findViewById(R.id.Ingredient6);
		
		sb.delete(0, sb.length());
		sb.append(Constants.ingredients[5]);
		ingredient6.setText(sb.toString());
		
		quantity1 = (TextView) findViewById(R.id.Quantity1);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[0]);
		quantity1.setText(sb.toString());
		
		quantity2 = (TextView) findViewById(R.id.Quantity2);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[1]);
		quantity2.setText(sb.toString());
		
		quantity3 = (TextView) findViewById(R.id.Quantity3);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[2]);
		quantity3.setText(sb.toString());
		
		quantity4 = (TextView) findViewById(R.id.Quantity4);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[3]);
		quantity4.setText(sb.toString());
		
		quantity5 = (TextView) findViewById(R.id.Quantity5);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[4]);
		quantity5.setText(sb.toString());
		
		quantity6 = (TextView) findViewById(R.id.Quantity6);
		
		sb.delete(0, sb.length());
		sb.append(Constants.quantity[5]);
		quantity6.setText(sb.toString());
		
		
		
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