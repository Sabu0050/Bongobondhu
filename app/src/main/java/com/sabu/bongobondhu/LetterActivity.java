package com.sabu.bongobondhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LetterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7243601331616499~1041653365");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        populateView();
        callOnClcik();
    }

    private void populateView() {
        String[] item = new String[]{"কন্যা শেখ হাসিনাকে লেখা চিঠি","বাবা কে লেখা চিঠি","স্ত্রী কে লেখা চিঠি"};

        ArrayAdapter<String> madapter = new SecondCustomAdapter(this,item);
        ListView listView = (ListView) findViewById(R.id.letter_list);
        listView.setAdapter(madapter);
    }
    private void callOnClcik() {
        ListView listView = (ListView) findViewById(R.id.letter_list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(LetterActivity.this, LetterOneActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(LetterActivity.this, LetterTwoActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(LetterActivity.this, LetterThreeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}

