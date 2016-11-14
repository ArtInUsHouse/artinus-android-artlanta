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
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageStatement();

        Typeface typefaceOne = Typeface.createFromAsset(getAssets(), "LemonMilk.otf");

        TextView textViewOne = (TextView) findViewById(R.id.textview1);
        textViewOne.setTypeface(typefaceOne);

        TextView textViewTwo = (TextView) findViewById(R.id.textview2);
        textViewTwo.setTypeface(typefaceOne);

        TextView textViewThree = (TextView) findViewById(R.id.textviewownername);
        textViewThree.setTypeface(typefaceOne);

        TextView textViewFour = (TextView) findViewById(R.id.textviewgalleryname);
        textViewFour.setTypeface(typefaceOne);

        TextView bulletOne = (TextView) findViewById(R.id.bullet_one);
        bulletOne.setTypeface(typefaceOne);
        TextView bulletTwo = (TextView) findViewById(R.id.bullet_two);
        bulletTwo.setTypeface(typefaceOne);
        TextView bulletThree = (TextView) findViewById(R.id.bullet_three);
        bulletThree.setTypeface(typefaceOne);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void imageStatement() {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);

//        Glide.with(this)
//                .load(R.drawable.artlanta_tv_200)
//                .centerCrop()
//                .into(imageView1);
        Glide.with(this)
                .load(R.drawable.artlanta_colours)
                .into(imageView1);
        Glide.with(this)
                .load(R.drawable.artlanta_bankroll)
                .into(imageView2);
        Glide.with(this)
                .load(R.drawable.tyree_interns)
                .into(imageView3);
        Glide.with(this)
                .load(R.drawable.tyree)
                .into(imageView5);

        Drawable wolve = getResources().getDrawable(R.drawable.artlanta_wolves);
        wolve.setAlpha(30);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview_background);
        scrollView.setBackground(wolve);
    }
}
