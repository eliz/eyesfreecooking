package com.cookmyday;
 
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;
 
public class cooking_steps_timer extends Activity implements OnClickListener {
    ProgressDialog dialog;
    long startTime;
    long prevTime;
    long currentTime;
    int totalTimeInSec;
    int increment;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooking_steps);
        totalTimeInSec = Constants.timer.get(Constants.currentStepNo+1) * 60;
        //totalTimeInSec = 900; //15min
        
        Button startbtn = (Button) findViewById(R.id.startbtn);
        startbtn.setOnClickListener(this);
    }
 
    public void onClick(View view) {
 
    	startTime = System.nanoTime(); //to be used later for telling time elapsed.
    	prevTime = System.nanoTime();
 
        dialog = new ProgressDialog(this);
        dialog.setCancelable(true);
        dialog.setMessage("Loading...");
        // set the progress to be horizontal
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        // reset the bar to the default value of 0
        dialog.setProgress(0);

        int maximum = totalTimeInSec;
        dialog.setMax(maximum);
        // display the progressbar
        dialog.show();
 
        // create a thread for updating the progress bar
        Thread background = new Thread (new Runnable() {
           public void run() {
               try {
                   // enter the code to be run while displaying the progressbar.
                   //
                   // This example is just going to increment the progress bar:
                   // So keep running until the progress value reaches maximum value
                   while (dialog.getProgress()<= dialog.getMax()) {
                       // wait 500ms between each update
                       Thread.sleep(500);
 
                       // active the update handler
                       progressHandler.sendMessage(progressHandler.obtainMessage());
                   }
               } catch (java.lang.InterruptedException e) {
                   // if something fails do something smart
               }
           }
        });
 
        // start the background thread
        background.start();
 
    }
 
    // handler for the background updating
    Handler progressHandler = new Handler() {
        public void handleMessage(Message msg) {
        	currentTime = System.nanoTime();
        	long temp = currentTime - prevTime;
        	int increment = (int)temp/1000000000;
        	prevTime = currentTime;
            dialog.incrementProgressBy(increment);
        }
    };
}