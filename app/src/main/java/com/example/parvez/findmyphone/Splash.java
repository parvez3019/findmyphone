package com.example.parvez.findmyphone;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer <3000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    Intent myIntent = new Intent(Splash.this, MainActivity.class);

                    Splash.this.startActivity(myIntent);
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };

        logoTimer.start();
    }

}






