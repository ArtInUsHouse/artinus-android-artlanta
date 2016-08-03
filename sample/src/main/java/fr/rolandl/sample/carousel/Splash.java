package fr.rolandl.sample.carousel;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Godfather on 7/12/2016.
 */
public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.splash_screen);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMainScreen);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
