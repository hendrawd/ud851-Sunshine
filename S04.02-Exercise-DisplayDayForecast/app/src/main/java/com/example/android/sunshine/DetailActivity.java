package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        if (intent.hasExtra("weather")) {
            String weather = intent.getStringExtra("weather");
            TextView textView = new TextView(DetailActivity.this);
            textView.setText(weather);
            ((ViewGroup) findViewById(android.R.id.content)).addView(textView);
        }
    }
}