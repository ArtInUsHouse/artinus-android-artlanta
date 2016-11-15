package fr.rolandl.sample.carousel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

/**
 * Created by GodfatherFrancis on 7/19/2016.
 */
public class Store extends AppCompatActivity {

    public static final String ANONYMOUS_OAUTH_TOKEN = "IQNBS3TYXBPVI43NO76R";
    public static final String PERSONAL_OAUTH_TOKEN = "2DB7O2HHUISEBAMDPUOC";
    public static final String KEYS = "O6BSVBDVBTTYIDP77H";
    public static final String CLIENT_SECRET = "TJZCR43FBGANWVOM4IY5L5QTVMGAHCWYPPKFTB75UKSC26E5HT";
    public static final String USER_URL = "https://www.eventbriteapi.com/v3/users/me/?token=2DB7O2HHUISEBAMDPUOC";
    public static final String USER_EVENTS_URL = "https://www.eventbriteapi.com/v3/users/me/owned_events/?token=2DB7O2HHUISEBAMDPUOC";
    public static final String WEBVIEW_URL = "http://www.artlantagallery.com/#!shop/plxr3";
    public static final String TAG = "Store";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Log.i(TAG, "onCreate");
        setTitle("Shop ARTlanta");

        // TODO fix webview
        WebView webView = (WebView) findViewById(R.id.webView);

    }
}
