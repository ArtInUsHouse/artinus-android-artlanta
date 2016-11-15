package fr.rolandl.sample.carousel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Godfather on 8/14/2016.
 */
public class Facebook extends AppCompatActivity {

    public static final String WEBVIEW_URL = "https://www.facebook.com/ArtlantaGallery";
    public static final String TAG = "Facebook";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
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
    }
}
