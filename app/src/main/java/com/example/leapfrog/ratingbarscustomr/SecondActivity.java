package com.example.leapfrog.ratingbarscustomr;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

/**
 * Created by leapfrog on 9/5/17.
 */

public class SecondActivity extends AppCompatActivity {

    RatingBar ratingBar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ratingBar5 = (RatingBar) findViewById(R.id.ratingBar5);


        Drawable progress = ratingBar5.getProgressDrawable();
//        DrawableCompat.setTint(progress, Color.WHITE);
        DrawableCompat.setTint(progress, getResources().getColor(R.color.greendirty));


       /* LayerDrawable stars = (LayerDrawable) ratingBar5.getProgressDrawable().getCurrent();
        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(0).setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(1).setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);*/
    }
}
