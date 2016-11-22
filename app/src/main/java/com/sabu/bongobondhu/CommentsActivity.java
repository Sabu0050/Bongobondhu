package com.sabu.bongobondhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class CommentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7243601331616499~1041653365");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        populateView();
    }

    private void populateView() {
        String[] item = new String[]{" মুজিব হত্যার পর বাঙালীদের আর বিশ্বাস করা যায় না,যারা মুজিবকে হত্যা করেছে তারা যেকোন জঘন্য কাজ করতে পারে\n---নোবেল বিজয়ী উইলিবান্ট। ",
                "শেখ মুজিবের মৃত্যুতে বিশ্বের শোষিত মানুষ হারাল তাদের একজন মহান নেতাকে,আমি হারালাম একজন অকৃত্রিম বিশাল হৃদয়ের বন্ধুকে\n—ফিদেল কাস্ট্রো।",
                "আপোষহীন সংগ্রামী নেতৃত্ব আর কুসুম কোমল হৃদয় ছিল মুজিব চরিত্রের বৈশিষ্ঠ্য\n—ইয়াসির আরাফাত। "," শেখ মুজিব নিহত হবার খবরে আমি মর্মাহত। তিনি একজন মহান নেতা ছিলেন।তার অনন্যসাধারন সাহসিকতা এশিয়া ও আফ্রিকার জনগনের জন্য প্রেরণাদায়ক ছিল।\n-–ইন্দিরা গান্ধী। ",
                "বঙ্গবন্ধু শেখ মুজিবুর রহমান হচ্ছেন সমাজতন্ত্র প্রতীষ্ঠার সংগ্রামের প্রথম শহীদ।তাই তিনি অমর।\n-–সাদ্দাম হোসেন।",
                "শেখ মুজিবুর রহমান ভিয়েতনামী জনগনকে অনুপ্রাণিত করেছিলেন\n— কেনেথা কাউণ্ডা।",
                "বঙ্গবন্ধুর হত্যাকান্ডে বাঙলাদেশই শুধু এতিম হয় নি বিশ্ববাসী হারিয়েছে একজন মহান সন্তানকে।\n" +
                        "– জেমসলামন্ড,ইংলিশ এম পি।","শেখ মুজিবকে চতুর্দশ লুই য়ের সাথে তুলনা করা যায়। জনগন তার কাছে এত প্রিয় ছিল যে লুই ইয়ের মত তিনি এ দাবী করতে পারেন আমি ই রাষ্ট্র।\n" +
                "--- পশ্চিম জার্মানী পত্রিকা।","আওয়ামিলীগ নেতা শেখ মুজিবুর রহমানের মত তেজী এবং গতিশীল নেতা আগামী বিশ বুছরের মধ্যে এশিয়া মহাদেশে আর পাওয়া যাবে না\n" +
                "---- হেনরি কিসিঞ্জার।","শেখ মুজিব নিহত হলেন তার নিজেরই সেনাবাহিনীর হাতে অথচ তাকে হত্যা করতে পাকিস্তানীরা সংকোচবোধ করেছে।\n" +
                "বিবিসি-১৫ আগস্ট ১৯৭৫।"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        ListView listView = (ListView) findViewById(R.id.cmnt_list);
        listView.setAdapter(adapter);
    }
}
