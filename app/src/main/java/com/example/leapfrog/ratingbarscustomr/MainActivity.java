package com.example.leapfrog.ratingbarscustomr;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar rb_customColor;
    RatingBar ratingBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using custom images in rating bar
        //make sure images you use are 30-35px
        //http://android-helper.blogspot.in/2011/06/android-custom-ratingbar-example.html
        ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);

        ratingBar1.setRating(3.5f);


       /* Drawable progress = ratingBar1.getProgressDrawable();
        DrawableCompat.setTint(progress, getResources().getColor(R.color.greendirty));*/


       /* LayerDrawable stars = (LayerDrawable) ratingBar1
                .getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.parseColor("#26ce61"),
                PorterDuff.Mode.SRC_ATOP); // for filled stars
        stars.getDrawable(1).setColorFilter(Color.parseColor("#FFFF00"),
                PorterDuff.Mode.SRC_ATOP); // for half filled stars
        stars.getDrawable(0).setColorFilter(Color.CYAN,
                PorterDuff.Mode.SRC_ATOP); // for empty stars

        ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), Float.toString(rating), Toast.LENGTH_LONG).show();

            }

        });*/


        /*RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar5);

        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable().getCurrent();

        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(0).setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(1).setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);*/
    }
}
