package fr.rolandl.sample.carousel;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by GodfatherFrancis on 7/19/2016.
 */
public class Welcome extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageStatement();

        Typeface typefaceOne = Typeface.createFromAsset(getAssets(), "LemonMilk.otf");
        TextView textViewOne = (TextView) findViewById(R.id.textview1);
        textViewOne.setTypeface(typefaceOne);

        Typeface typefaceTwo = Typeface.createFromAsset(getAssets(), "LemonMilk.otf");
        TextView textViewTwo = (TextView) findViewById(R.id.textview2);
        textViewTwo.setTypeface(typefaceTwo);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void imageStatement() {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        Glide.with(this)
                .load(R.drawable.rsz_artlanta_red)
                .centerCrop()
                .into(imageView1);
        Glide.with(this)
                .load(R.drawable.rsz_artlanta_blue)
                .centerCrop()
                .into(imageView2);
        Glide.with(this)
                .load(R.drawable.rsz_artlanta_yellow)
                .centerCrop()
                .into(imageView3);
        Glide.with(this)
                .load(R.drawable.rsz_artlanta_red)
                .centerCrop()
                .into(imageView4);

        Drawable wolve = getResources().getDrawable(R.drawable.rsz_artlanta_wolve_fade);
        wolve.setAlpha(30);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview_background);
        scrollView.setBackground(wolve);
    }
}
