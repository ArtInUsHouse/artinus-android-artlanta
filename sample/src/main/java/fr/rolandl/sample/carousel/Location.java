package fr.rolandl.sample.carousel;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


/**
 * Created by Godfather on 8/19/2016.
 */
public class Location extends ActionBarActivity {

//    private GoogleApiClient mGoogleApiClient;
    private String placeId = "ChIJWYhh9hID9YgRZqrf5Wq6ONs";
    private String TAG = this.getClass().getSimpleName();

    private static final String LOG_TAG = "PlacesAPIActivity";
    private static final int GOOGLE_API_CLIENT_ID = 0;
    private static final int PERMISSION_REQUEST_CODE = 100;

//    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .build();

        Places.GeoDataApi.getPlaceById(mGoogleApiClient, placeId)
                .setResultCallback(new ResultCallback<PlaceBuffer>() {
                    @Override
                    public void onResult(PlaceBuffer places) {
                        if (places.getStatus().isSuccess() && places.getCount() > 0) {
                            final Place myPlace = places.get(0);
                            Log.i(TAG, "Place found: " + myPlace.getName());
                        } else {
                            Log.e(TAG, "Place not found");
                        }
                        places.release();
                    }
                });*/

//        location(mGoogleApiClient, placeId);

//        imageStatement();
//
//        Typeface typefaceOne = Typeface.createFromAsset(getAssets(), "LemonMilk.otf");
//
//        TextView galleryHours = (TextView) findViewById(R.id.textViewGalleryHours);
//        galleryHours.setTypeface(typefaceOne);
//
//        TextView galleryDays = (TextView) findViewById(R.id.textViewGalleryDays);
//        galleryDays.setTypeface(typefaceOne);
//
//        TextView galleryTime = (TextView) findViewById(R.id.textViewGalleryTime);
//        galleryTime.setTypeface(typefaceOne);
//
//        TextView location = (TextView) findViewById(R.id.textViewGalleryLocation);
//        location.setTypeface(typefaceOne);
//
//        TextView address = (TextView) findViewById(R.id.textViewGalleryAddress);
//        address.setTypeface(typefaceOne);
//
//        TextView zip = (TextView) findViewById(R.id.textViewGalleryZip);
//        zip.setTypeface(typefaceOne);
    }

    /*@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void imageStatement() {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageViewMap);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);

        Glide.with(this)
                .load(R.drawable.static_map)
                .into(imageView1);
        Glide.with(this)
                .load(R.drawable.artlanta_colours_200)
                .centerCrop()
                .into(imageView2);
        Glide.with(this)
                .load(R.drawable.artlanta_bankroll_200) //tyree_interns_200
                .centerCrop()
                .into(imageView3);
        Glide.with(this)
                .load(R.drawable.tyree_interns_200)
                .centerCrop()
                .into(imageView4);
        Glide.with(this)
                .load(R.drawable.tyree_200)
                .centerCrop()
                .into(imageView5);

        Drawable wolve = getResources().getDrawable(R.drawable.rsz_artlanta_wolve_fade);
        wolve.setAlpha(30);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview_background);
        scrollView.setBackground(wolve);
    }*/

    /*@Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }*/
}

