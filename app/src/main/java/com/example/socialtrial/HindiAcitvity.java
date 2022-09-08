package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class HindiAcitvity extends AppCompatActivity {
    Button b3 , contact,edu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_acitvity);
        b3 = findViewById(R.id.but1);
        contact = findViewById(R.id.contact);
        edu = findViewById(R.id.edu);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiatimes.com/hindi/entrepreneurship/success-story-of-lijjat-papad-from-80-rs-to-crores-business-365541.html"));
                startActivity(browserIntent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HindiAcitvity.this, ContactUs.class);
                startActivity(i);
                setLocale("hi");
            }
        });
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HindiAcitvity.this, EducationalVideosHindi.class);
                startActivity(i);
                setLocale("hi");
            }
        });
    }
    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        //save data to shared preferences
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
        //load language saved in shared preferences
    }
}