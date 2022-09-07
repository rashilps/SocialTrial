package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MarathiActivity extends AppCompatActivity {

    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi);
        b2 = findViewById(R.id.but1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marathisrushti.com/articles/lijjat-papad-shree-mahila-gruh-udyog/"));
                startActivity(browserIntent);
            }
        });
    }
}