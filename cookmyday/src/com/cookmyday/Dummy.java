package com.cookmyday;

/** CS3248
 * this class is used for any page under construction 
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Dummy extends Activity implements OnClickListener {
	Button btnBack;
	Intent newScreen = null;
	
	/** Called when the activity is first created. */
	@Override	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dummy);
		btnBack = (Button) findViewById(R.id.Buttonback);
		btnBack.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		if(v == btnBack){
			newScreen = new Intent(v.getContext(), main.class);
			startActivityForResult(newScreen, 0);
		}		
	}
}
