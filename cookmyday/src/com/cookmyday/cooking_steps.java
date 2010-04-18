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

public class cooking_steps extends Activity implements OnClickListener {
	Button btnBack;
	Button btnRepeat;
	Button btnNext;
	Intent newScreen = null;
	int currentStep = Constants.currentStepNo + 1;
	int totalStep = Constants.TOTALNUMSTEPS + 1;
	TextView step_content;
	TextView step_num;
	TextView step_total;
	StringBuffer sb = new StringBuffer();
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cooking_steps);
		
		step_content = (TextView) findViewById(R.id.step_content);

		sb.append(Constants.recipe[Constants.currentStepNo]);
		sb.append("\n");
		step_content.setText(sb.toString());
		
		step_num = (TextView) findViewById(R.id.step_num);
		
		sb.delete(0, sb.length());
		sb.append(currentStep);
		step_num.setText(sb.toString());
		
		step_total = (TextView) findViewById(R.id.step_total);
		
		sb.delete(0, sb.length());
		sb.append(totalStep);
		step_total.setText(sb.toString());
		
		
		btnBack = (Button) findViewById(R.id.Buttonback);
		btnNext = (Button) findViewById(R.id.Buttonnext);
		btnRepeat = (Button) findViewById(R.id.Buttonrepeat);
		btnBack.setOnClickListener(this);
		btnNext.setOnClickListener(this);
		btnRepeat.setOnClickListener(this);		
	}
	
	
	/** Called when the Next button is pressed. */
	public void onClick(View v) {
		if (v == btnBack) {
				boolean check = Constants.updateStepNoPrev();
				if(check){
					newScreen = new Intent(v.getContext(), cooking_steps.class);
					startActivityForResult(newScreen, 0);
				} else {
					String lastPage = Constants.lastPage;
					//how to get back?
				}
			} else if (v == btnNext){
				//if(currentStep == totalStep){
				//	Toast.makeText(cooking_steps.this, "This is the last step", Toast.LENGTH_LONG).show();
			//	} else{
					Constants.updateStepNo();
					newScreen = new Intent(v.getContext(), cooking_steps.class);
					startActivityForResult(newScreen, 0);
			//	}
			} else if (v == btnRepeat){
				//dont edit anything, repeat the whole thing
				newScreen = new Intent(v.getContext(), cooking_steps.class);
				startActivityForResult(newScreen, 0);
			} 
			
	}
}