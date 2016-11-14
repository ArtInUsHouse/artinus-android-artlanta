package fr.rolandl.sample.carousel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by GodfatherFrancis on 7/12/2016.
 */
public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // TODO fix gif
        if(imageView != null) {
            Glide.with(this)
                    .load(R.drawable.red_blue_yellow_slow)
                    .asGif()
                    .error(R.drawable.red_blue_yellow_slow)
                    .into(imageView);
        }

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(4000);
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
