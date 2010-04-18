package com.cookmyday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


/** CS3248 G4
*/

public class grocery_list extends Activity implements OnClickListener {
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
	CheckBox check1;
	CheckBox check2;
	CheckBox check3;
	CheckBox check4;
	CheckBox check5;
	CheckBox check6;
	
	
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
			newScreen = new Intent(v.getContext(), main.class);

			
			check1 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check1.isChecked()){
				Constants.bought[0] = true;
			} else {
				Constants.bought[0]=false;
			}
			
			check2 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check2.isChecked()){
				Constants.bought[1] = true;
			} else {
				Constants.bought[1]=false;
			}
			
			check3 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check3.isChecked()){
				Constants.bought[2] = true;
			} else {
				Constants.bought[2]=false;
			}
			
			check4 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check4.isChecked()){
				Constants.bought[3] = true;
			} else {
				Constants.bought[3]=false;
			}
			
			check5 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check5.isChecked()){
				Constants.bought[4] = true;
			} else {
				Constants.bought[4]=false;
			}
			
			check6 = (CheckBox) findViewById(R.id.CheckBox01);
			if (check6.isChecked()){
				Constants.bought[5] = true;
			} else {
				Constants.bought[5]=false;
			}
			
			startActivityForResult(newScreen, 0);
		}
		

	}
}