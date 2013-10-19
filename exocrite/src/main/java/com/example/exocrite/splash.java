package com.example.exocrite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Jayson on 10/13/13.
 */

public class splash extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("com.example.exocrite.STARTINGPOINT");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

}

