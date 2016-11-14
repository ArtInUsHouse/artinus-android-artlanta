package fr.rolandl.sample.carousel;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by GodfatherFrancis on 7/19/2016.
 */
public class Video extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyAF8AHkBeBay5kGe_DGXbAbmscOO7r3ddA";
    public static final String VIDEO_ID = "PgSXNZxAfLQ";
    public static final String PLAYLIST_ID = "PL4ahlZpnhc5DXtMm1jZqxotLsMTr35uVd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        // TODO add ActionBar
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);
        youTubePlayerView.initialize(API_KEY, this);
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
        /** Start buffering **/
        if (!wasRestored) {
            player.setFullscreen(true);
            player.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
            player.loadPlaylist(PLAYLIST_ID);
        }
    }

    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }

        @Override
        public void onPaused() {
        }

        @Override
        public void onPlaying() {
        }

        @Override
        public void onSeekTo(int arg0) {
        }

        @Override
        public void onStopped() {
        }
    };

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }

        @Override
        public void onError(ErrorReason arg0) {
        }

        @Override
        public void onLoaded(String arg0) {
        }

        @Override
        public void onLoading() {
        }

        @Override
        public void onVideoEnded() {
        }

        @Override
        public void onVideoStarted() {
        }
    };

}
