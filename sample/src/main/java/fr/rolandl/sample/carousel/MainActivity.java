package fr.rolandl.sample.carousel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Toast;
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
    implements OnItemClickListener, OnItemLongClickListener {

  private CarouselAdapter adapter;

  Carousel carousel;

  private final List<Photo> photos = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportActionBar().hide();
    setContentView(R.layout.main_activity);

    carousel = (Carousel) findViewById(R.id.carousel);

    photos.add(new Photo("Photo1", "artlanta_red"));
    photos.add(new Photo("Photo2", "artlanta_events"));
    photos.add(new Photo("Photo3", "fotolia_61643329"));
    photos.add(new Photo("Photo4", "fotolia_50806609"));
    photos.add(new Photo("Photo5", "artlanta_frame"));

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
//        Toast.makeText(getApplicationContext(), "The item '" + position + "' has been long clicked", Toast.LENGTH_SHORT).show();
        if (position == 0) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Splash.class);
          startActivityForResult(myIntent, 0);
        }

        if (position == 1) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Splash.class);
          startActivityForResult(myIntent, 1);
        }

        if (position == 2) {
          //code specific to first list item
          Intent myIntent = new Intent(view.getContext(), Splash.class);
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
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    final MenuItem firstItem = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, R.string.activityStaticFragment);
    firstItem.setOnMenuItemClickListener(new OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        startActivity(new Intent(getApplicationContext(), SecondaryActivity.class));
        return true;
      }
    });

    final MenuItem secondItem = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, R.string.activityFragment);
    secondItem.setOnMenuItemClickListener(new OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        startActivity(new Intent(getApplicationContext(), ThirdActivity.class));
        return true;
      }
    });

    return super.onCreateOptionsMenu(menu);
  }

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

  public void sendMessage(View view) {
    // Do something in response to button
  }
}
