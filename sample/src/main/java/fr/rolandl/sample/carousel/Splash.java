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

//        ImageView imageView = (ImageView)findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.artlanta_blue);

//        ImageView imageView = (ImageView)findViewById(R.id.flaganim);
//        imageView.setImageResource(R.drawable.flag);
//
//        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getDrawable();
//        frameAnimation.start();

//        final ImageView iv = (ImageView) findViewById(R.id.imageView);
//        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.gif);
//
//        iv.startAnimation(an);
//        an.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                finish();
//                Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);
////              startActivity(startMainScreen);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });

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
