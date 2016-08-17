package fr.rolandl.sample.carousel;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by GodfatherFrancis on 7/19/2016.
 */
public class Events extends ActionBarActivity {

    public static final String ANONYMOUS_OAUTH_TOKEN = "IQNBS3TYXBPVI43NO76R";
    public static final String PERSONAL_OAUTH_TOKEN = "2DB7O2HHUISEBAMDPUOC";
    public static final String KEYS = "O6BSVBDVBTTYIDP77H";
    public static final String CLIENT_SECRET = "TJZCR43FBGANWVOM4IY5L5QTVMGAHCWYPPKFTB75UKSC26E5HT";
    public static final String USER_URL = "https://www.eventbriteapi.com/v3/users/me/?token=2DB7O2HHUISEBAMDPUOC";
    public static final String USER_EVENTS_URL = "https://www.eventbriteapi.com/v3/users/me/owned_events/?token=2DB7O2HHUISEBAMDPUOC";
    public static final String WEBVIEW_URL = "http://www.eventbrite.com/o/artlanta-gallery-8171465641";
    public static final String TAG = "Eventbrite";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.i(TAG, "onCreate");

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {

//            new AsyncTask<Void, Void, String>() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                // shouldOverrideUrlLoading loads clickable link
//                // w/o opening new browser while in webView
//                view.loadUrl(url);
//                return true;
//            }

            @Override
            public void onPageFinished(WebView view, String url) {
                Log.i(TAG, "onPageFinished: " + url);
//                view.loadUrl(url);
            }
        });
        webView.loadUrl(WEBVIEW_URL);

/*
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(USER_EVENTS_URL)
                        .build();

                try {
                    Response response = client.newCall(request).execute();

                    if (response.isSuccessful()) {
                        Log.i(TAG, response.body().string());
                    }
                    return response.body().string();
                } catch (Exception e) {
                    Log.e(TAG, "Exception caught: " + e);
                }
                return null;
            }
        }.execute();
 */
    }
}
