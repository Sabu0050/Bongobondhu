package com.sabu.bongobondhu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SpeechActivity extends AppCompatActivity {

    Button play,pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7243601331616499~1041653365");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        play = (Button) findViewById(R.id.button_play);
        pause = (Button) findViewById(R.id.button_pause);
        stop = (Button) findViewById(R.id.button_stop);

        final MediaPlayer mediaPlayer = MediaPlayer.create(SpeechActivity.this,R.raw.speech_of_bangabandhu_sheikh_mujibur_rahman);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                SpeechActivity.this.finish();
            }
        });
    }

}
