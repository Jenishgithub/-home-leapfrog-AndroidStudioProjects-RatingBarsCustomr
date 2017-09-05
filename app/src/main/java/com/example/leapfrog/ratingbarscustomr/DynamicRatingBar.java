package com.example.leapfrog.ratingbarscustomr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;


public class DynamicRatingBar extends AppCompatActivity {


    LinearLayout ll;
    RatingBar rb;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll = new LinearLayout(this);
        tv = new TextView(this);

        rb = new RatingBar(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                (int) LayoutParams.WRAP_CONTENT,
                (int) LayoutParams.WRAP_CONTENT);
        params.topMargin = 180;

        rb.setLayoutParams(params);
        ll.addView(tv);
        ll.addView(rb);

        rb.setNumStars(5);
        rb.setRating(3);
        rb.setStepSize((float) 0.5);
        setContentView(ll);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub

                tv.setText("Rated : " + String.valueOf(rating));
            }
        });
    }
}
