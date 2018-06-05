package com.udacity.projects.gradle.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeText = findViewById(R.id.joke_text);

        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        jokeText.setText(joke);
    }
}
