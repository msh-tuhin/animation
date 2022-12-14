package com.tuhin.animatiion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView cat1 = (ImageView) findViewById(R.id.cat1);
//        ImageView cat2 = (ImageView) findViewById(R.id.cat2);
//        if(cat1.getAlpha() == 1f) {
//            cat1.animate().alpha(0f).setDuration(1000);
//            cat2.animate().alpha(1f).setDuration(1000);
//        } else {
//            cat2.animate().alpha(0f).setDuration(1000);
//            cat1.animate().alpha(1f).setDuration(1000);
//        }
        cat1.animate().rotationBy(180f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
