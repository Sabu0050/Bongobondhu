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

public class IntroductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7243601331616499~1041653365");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        populate();
        callOnClcik();
    }

    private void populate(){
        String[] newItem = new String[] {"প্রাথমিক জীবন","রাজনীতিতে হাতেখড়ি","রাষ্ট্রভাষা আন্দোলন","যুক্তফ্রন্ট নির্বাচন","পূর্ব পাকিস্তানের প্রধান নেতা",
                                        "ছয় দফা দাবী","আগরতলা ষড়যন্ত্র মামলা","উনসত্তরের গণঅভ্যুত্থান","১৯৭০ এর নির্বাচন",
                                        "সাল ১৯৭১","বাংলাদেশের শাসন-৭৩ থেকে ৭৫"};

        ArrayAdapter<String> madapter = new SecondCustomAdapter(this,newItem);
        ListView listView = (ListView) findViewById(R.id.life);
        listView.setAdapter(madapter);
    }
    private void callOnClcik() {
        ListView listView = (ListView) findViewById(R.id.life);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(IntroductionActivity.this,FamilyActivity.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent = new Intent(IntroductionActivity.this,PriPoliticsActivity.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent = new Intent(IntroductionActivity.this,PoliticalActivity.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent = new Intent(IntroductionActivity.this,MainLeaderActivity.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent = new Intent(IntroductionActivity.this,RespectActivity.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent = new Intent(IntroductionActivity.this,DeathActivity.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent = new Intent(IntroductionActivity.this,AgartolaActivity.class);
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent = new Intent(IntroductionActivity.this,UnnosottorActivity.class);
                    startActivity(intent);
                }
                else if (position==8){
                    Intent intent = new Intent(IntroductionActivity.this,ElectionActivity.class);
                    startActivity(intent);
                }
                else if (position==9){
                    Intent intent = new Intent(IntroductionActivity.this,MuktijuddhoActivity.class);
                    startActivity(intent);
                }

                else if (position==10){
                    Intent intent = new Intent(IntroductionActivity.this,RuleActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
