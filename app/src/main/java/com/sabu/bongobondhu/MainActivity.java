package com.sabu.bongobondhu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7243601331616499~1041653365");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        populateView();
        callNewClcik();
    }



    private void populateView() {

        String[] item = new String[]{" জীবনী "," ভাষন "," ছবির সংগ্রহশালা "," বঙ্গবন্ধুর লিখা চিঠি ","বঙ্গবন্ধুর উক্তি সমূহ","বিশ্ব নেতাদের উক্তি","আমাদের সম্পর্কে"};
        ArrayAdapter<String> adapter = new CustomAdapter(this,item);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
    private void callNewClcik() {
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int ItemPosition = position;
                if (ItemPosition==0){

                    Intent intent = new Intent(MainActivity.this,IntroductionActivity.class);
                    startActivity(intent);

                }
                else if(ItemPosition==1){
                    Intent intent = new Intent(MainActivity.this,SpeechActivity.class);
                    startActivity(intent);

                }
                else if (ItemPosition==2){
                    Intent intent = new Intent(MainActivity.this,GallaryActivity.class);
                    startActivity(intent);
                }
                else if(ItemPosition==3){
                    Intent intent = new Intent(MainActivity.this,LetterActivity.class);
                    startActivity(intent);
                }
                else if(ItemPosition==4){
                    Intent intent = new Intent(MainActivity.this,BcommentsActivity.class);
                    startActivity(intent);
                }
                else if(ItemPosition==5){
                    Intent intent = new Intent(MainActivity.this,CommentsActivity.class);
                    startActivity(intent);
                }
                else if(ItemPosition==6){
                    Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                    startActivity(intent);
                }




            }
        });
    }
}
