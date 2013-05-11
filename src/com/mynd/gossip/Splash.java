package com.mynd.gossip;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        // Make Splash Screen full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.splash_screen);
        
        // Start background data loading
        new AsyncTask<Void, Void, Void>() {

			@Override
			protected Void doInBackground(Void... params) {
				// Load Data and Ensure Cache is up to date
				
				return null;
			}

			@Override
			protected void onPostExecute(Void result) {
				onDataLoad();
			}
        	
		}.execute(new Void[]{null});
    }

    protected void onDataLoad(){
    	Intent myIntent = new Intent(this, GossipList.class);
    	this.startActivity(myIntent);
    }
    
}
