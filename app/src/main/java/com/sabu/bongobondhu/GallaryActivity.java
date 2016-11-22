package com.sabu.bongobondhu;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class GallaryActivity extends AppCompatActivity {


    ViewPager viewPager;
    CustomSwipeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);


    }
}
