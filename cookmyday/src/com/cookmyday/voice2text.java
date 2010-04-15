package com.example.voice2text;

import java.util.ArrayList; 
import java.util.List; 

import android.app.Activity; 
import android.content.Intent; 
import android.content.pm.PackageManager; 
import android.content.pm.ResolveInfo; 
import android.os.Bundle; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.ArrayAdapter; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.ListView; 
import android.speech.RecognizerIntent; 


public class voice2text extends Activity { 
      
     Button Voice_Rec_BTN; 
     EditText VoiceResults_Txt; 
      
    private static final int VOICE_RECOGNITION_REQUEST_CODE = 1234; 
    private ListView mList; 


    /** Called when the activity is first created. */ 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.voice2text); 
        
        Voice_Rec_BTN = (Button) findViewById(R.id.startvoice); 
        //VoiceResults_Txt = (EditText) findViewById(R.id.resultwindow); 
        mList = (ListView) findViewById(R.id.list); 

        PackageManager pm = getPackageManager(); 
        List<ResolveInfo> activities = pm.queryIntentActivities( 
                new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0); 
        if (activities.size() != 0) { 
            
            Voice_Rec_BTN.setOnClickListener( 
                    new OnClickListener() { 
                        public void onClick(View v) { 
                         startVoiceRecognitionActivity(); 
                        } 
                    } 
            ); 
            
        } else { 
          Voice_Rec_BTN.setEnabled(false); 
            Voice_Rec_BTN.setText("Recognizer not present"); 
        } 
    } 
    
    /** 
     * Fire an intent to start the speech recognition activity. 
     */ 
    private void startVoiceRecognitionActivity() { 
      
     ArrayList<String> potentialResults = new ArrayList<String>(); 
      
     potentialResults.add("yellow"); 
     potentialResults.add("green"); 
     potentialResults.add("blue"); 
     potentialResults.add("red"); 
      
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH); 
        
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM); 
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Tips:\n 1) Speak clearly into the Mic.\n 2) Pause between words."); 
        intent.putExtra(RecognizerIntent.EXTRA_RESULTS, potentialResults); 
                
        startActivityForResult(intent, VOICE_RECOGNITION_REQUEST_CODE); 
    } 

    /** 
     * Handle the results from the recognition activity. 
     */ 
    @Override 
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { 
        if (requestCode == VOICE_RECOGNITION_REQUEST_CODE && resultCode == RESULT_OK) { 
            // Fill the list view with the strings the recognizer thought it could have heard 
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS); 

            Voice_Rec_BTN.setText(matches.toString()); 
            mList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, 
                    matches)); 
        } 

        super.onActivityResult(requestCode, resultCode, data); 
    } 


} 
