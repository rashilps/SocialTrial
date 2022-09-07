package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_activity);
        b1 = findViewById(R.id.but1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.livemint.com/companies/news/lijjat-papad-how-7-women-wrote-a-success-story-with-only-80-for-seed-capital-11618490058193.html"));
                startActivity(browserIntent);
            }
        });
    }
}