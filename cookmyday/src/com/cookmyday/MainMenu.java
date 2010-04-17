package com.example.cookmyday;

/** CS3248 
 * I hope it's working
*/

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainMenu extends ListActivity implements OnItemClickListener {
	
	static final String[] INPUT_METHODS = new String[] {
		"Find recipe",
		"View shopping list",
		"Start cooking",
		"Share experience online",
		"?"
	};
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(1);
		setListAdapter(new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_1, INPUT_METHODS));
		getListView().setTextFilterEnabled(true);
		getListView().setOnItemClickListener(this);
	}
	
	/** Called when the user clicks on the list */
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
		Intent newScreen = null;
		try {
			switch(position) {
				case 0:
					newScreen = new Intent(v.getContext(), Dummy.class);
					startActivity(newScreen);
					break;
				case 1:
					newScreen = new Intent(v.getContext(), Dummy.class);
					startActivity(newScreen);
					break;
				case 2:
					newScreen = new Intent(v.getContext(), Dummy.class);
					startActivity(newScreen);
					break;
				case 3:
					newScreen = new Intent(v.getContext(), Dummy.class);
					startActivity(newScreen);
					break;
				case 4:
					newScreen = new Intent(v.getContext(), Dummy.class);
					startActivity(newScreen);
					break;
			}
			
		}
		
		catch(Exception e) {
			Toast.makeText(MainMenu.this, "Error creating " + INPUT_METHODS[position] + ": " + e.toString(), Toast.LENGTH_LONG).show();
		}
		
	}
	
}