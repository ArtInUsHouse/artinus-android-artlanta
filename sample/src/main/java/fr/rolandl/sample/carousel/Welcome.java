package fr.rolandl.sample.carousel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

/**
 * Created by Godfather on 7/19/2016.
 */
public class Welcome extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.welcome_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        setTitle("ARTlantas' Mission");

//        Thread splashThread = new Thread() {
//            @Override
//            public void run() {
//                try {
//                    sleep(3000);
//                    Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);
//                    startActivity(startMainScreen);
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        splashThread.start();

    }

//    @Override
//    public boolean onMenuItemClick(MenuItem item) {
//        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//    return true;
//    }
}
