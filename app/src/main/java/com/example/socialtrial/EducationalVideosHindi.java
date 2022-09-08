package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EducationalVideosHindi extends AppCompatActivity implements View.OnClickListener {
    TextView yt1, yt2,yt3,yt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_videos_hindi);
        yt1 = findViewById(R.id.yt1);
        yt1.setOnClickListener(this);
        yt2 = findViewById(R.id.yt2);
        yt2.setOnClickListener(this);
        yt3 = findViewById(R.id.yt3);
        yt3.setOnClickListener(this);
        yt4 = findViewById(R.id.yt4);
        yt4.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == yt1) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/sYoz3G2OH5g"));
            startActivity(intent);
        }
        if (view == yt2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ushasew.com/sewing-lessons-marathi/"));
            startActivity(intent);
        }
        if (view == yt3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/RsQ67-KwUw4"));
            startActivity(intent);
        }
        if (view == yt4) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DV-JnJ1ORHw"));
            startActivity(intent);
        }
    }
}