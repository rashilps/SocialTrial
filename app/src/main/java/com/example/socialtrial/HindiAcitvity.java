package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HindiAcitvity extends AppCompatActivity {
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_acitvity);
        b3 = findViewById(R.id.but1);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiatimes.com/hindi/entrepreneurship/success-story-of-lijjat-papad-from-80-rs-to-crores-business-365541.html"));
                startActivity(browserIntent);
            }
        });
    }

}