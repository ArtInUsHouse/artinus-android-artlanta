package fr.rolandl.sample.carousel;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import fr.rolandl.carousel.Carousel;
import fr.rolandl.carousel.CarouselAdapter;
import fr.rolandl.carousel.CarouselBaseAdapter;
import fr.rolandl.carousel.CarouselBaseAdapter.OnItemClickListener;
import fr.rolandl.carousel.CarouselBaseAdapter.OnItemLongClickListener;
import fr.rolandl.sample.carousel.adapter.MyAdapter;
import fr.rolandl.sample.carousel.bo.Photo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ludovic ROLAND
 * @since 2014.12.19
 */
public final class MainActivity
    extends ActionBarActivity
    implements OnItemClickListener, OnItemLongClickListener, View.OnClickListener {

  private CarouselAdapter adapter;

  Carousel carousel;

  private final List<Photo> photos = new ArrayList<>();
  private final int[] imageList = new int[4];

  private static final String TAG_TWITTER = "twitter";
  private static final String TAG_FACEBOOK = "facebook";
  private static final String TAG_INSTAGRAM = "instagram";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    getSupportActionBar().hide();
    setContentView(R.layout.main_activity);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
//    getSupportActionBar().setIcon(R.drawable.artlanta_red);
    setTitle("ARTlanta");

    carousel = (Carousel) findViewById(R.id.carousel);

    // TODO use glide/picosso to load photos
//    Glide.with(this)
//            .load(R.drawable.artlanta_red)
//            .into()

    photos.add(new Photo("", "rsz_artlanta_red"));
    photos.add(new Photo("", "rsz_artlanta_events"));
    photos.add(new Photo("", "youtube"));
    photos.add(new Photo("", "rsz_artlanta_shop"));

    adapter = new MyAdapter(this, photos);
    carousel.setAdapter(adapter);
    adapter.notifyDataSetChanged();

    carousel.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(CarouselBaseAdapter<?> carouselBaseAdapter, View view, int position, long l) {
        Toast.makeText(getApplicationContext(), "The item '" + position + "' has been clicked", Toast.LENGTH_SHORT).show();
        carousel.scrollToChild(position);
      }
    });

    carousel.setOnItemLongClickListener(new OnItemLongClickListener() {

      @Override
      public boolean onItemLongClick(CarouselBaseAdapter<?> carouselBaseAdapter, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), "The item '" + position + "' has been long clicked", Toast.LENGTH_SHORT).show();
        if (position == 0) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Welcome.class);
          startActivityForResult(myIntent, 0);
        }

        if (position == 1) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Events.class);
          startActivityForResult(myIntent, 1);
        }

        if (position == 2) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Video.class);
          startActivityForResult(myIntent, 2);
        }

        if (position == 3) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Splash.class);
          startActivityForResult(myIntent, 3);
        }

        carousel.scrollToChild(position);
        return false;
      }

    });

    // TODO Create Floating Action Button
    // Create button w/icon
    ImageView wolveIcon = new ImageView(this);

    Glide.with(this)
            .load(R.drawable.rsz_artlanta_wolve)
            .into(wolveIcon);



    FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
            .setContentView(wolveIcon)
            .build();

    // Create menu items w/icons
    ImageView twitterIcon = new ImageView(this);
    ImageView facebookIcon = new ImageView(this);
    ImageView instagramIcon = new ImageView(this);

//    twitterIcon.setImageResource(R.drawable.artlanta_yellow);
//    facebookIcon.setImageResource(R.drawable.artlanta_red);
//    instagramIcon.setImageResource(R.drawable.artlanta_blue);

    SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
    // construct menu with SubActionButton
    SubActionButton twitterButton = itemBuilder.setContentView(twitterIcon).build();
    SubActionButton facebookButton = itemBuilder.setContentView(facebookIcon).build();
    SubActionButton instagramButton = itemBuilder.setContentView(instagramIcon).build();

    twitterButton.setTag(TAG_TWITTER);
    facebookButton.setTag(TAG_FACEBOOK);
    instagramButton.setTag(TAG_INSTAGRAM);

    twitterButton.setOnClickListener(this);
    facebookButton.setOnClickListener(this);
    instagramButton.setOnClickListener(this);

    FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
            .addSubActionView(twitterButton)
            .addSubActionView(facebookButton)
            .addSubActionView(instagramButton)
            .attachTo(actionButton)
            .build();


  }

//    @Override
//  public boolean onCreateOptionsMenu(Menu menu) {
//      getMenuInflater().inflate();
//      return true;
//    }

//  @Override
//  public boolean onCreateOptionsMenu(Menu menu) {
//    final MenuItem firstItem = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, R.string.activityStaticFragment);
//    firstItem.setOnMenuItemClickListener(new OnMenuItemClickListener() {
//      @Override
//      public boolean onMenuItemClick(MenuItem item) {
//        startActivity(new Intent(getApplicationContext(), SecondaryActivity.class));
//        return true;
//      }
//    });
//
//    final MenuItem secondItem = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, R.string.activityFragment);
//    secondItem.setOnMenuItemClickListener(new OnMenuItemClickListener() {
//      @Override
//      public boolean onMenuItemClick(MenuItem item) {
//        startActivity(new Intent(getApplicationContext(), ThirdActivity.class));
//        return true;
//      }
//    });
//
//    return super.onCreateOptionsMenu(menu);
//  }

  @Override
  public void onItemClick(CarouselBaseAdapter<?> parent, View view, int position, long id) {
    Toast.makeText(getApplicationContext(), "The item '" + position + "' has been clicked", Toast.LENGTH_SHORT).show();
    carousel.scrollToChild(position);
  }

  @Override
  public boolean onItemLongClick(CarouselBaseAdapter<?> parent, View view, int position, long id) {
    Toast.makeText(getApplicationContext(), "The item '" + position + "' has been long clicked", Toast.LENGTH_SHORT).show();
    carousel.scrollToChild(position);
    return false;
  }

  @Override
  public void onClick(View v) {

    if(v.getTag().equals(TAG_TWITTER)) {
//      Toast.makeText(getApplicationContext(), "twitter button clicked", Toast.LENGTH_SHORT).show();
      Intent intent = new Intent(this, Twitter.class);
      startActivity(intent);
    }

    if(v.getTag().equals(TAG_FACEBOOK)) {
//      Toast.makeText(getApplicationContext(), "facebook button clicked", Toast.LENGTH_SHORT).show();
      Intent intent = new Intent(this, Facebook.class);
      startActivity(intent);
    }

    if(v.getTag().equals(TAG_INSTAGRAM)) {
//      Toast.makeText(getApplicationContext(), "instagram button clicked", Toast.LENGTH_SHORT).show();
      Intent intent = new Intent(this, Instagram.class);
      startActivity(intent);
    }
  }
}
