package com.sabu.bongobondhu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.move_up);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.move_up_text);
        Animation titleanim = AnimationUtils.loadAnimation(this,R.anim.move_up_title);
        Animation logoanim = AnimationUtils.loadAnimation(this,R.anim.logo_up);
        Animation logotextanim = AnimationUtils.loadAnimation(this,R.anim.logo_text_up);
        ImageView imageView = (ImageView) findViewById(R.id.imageView_splash);
        imageView.setAnimation(anim);
        TextView textView =(TextView) findViewById(R.id.textView_splash);
        textView.setAnimation(animation);
        TextView textView1 = (TextView) findViewById(R.id.textView8);
        textView1.setAnimation(titleanim);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView15);
        imageView1.setAnimation(logoanim);
        TextView textView2 = (TextView) findViewById(R.id.textView25);
        textView2.setAnimation(logotextanim);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                finish();
            }
        },4000);
    }
}
