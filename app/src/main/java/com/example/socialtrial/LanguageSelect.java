package com.example.socialtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class LanguageSelect extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);
        b1 = findViewById(R.id.button1id);
        b2 = findViewById(R.id.button2id);
        b3 = findViewById(R.id.button3id);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == b1) {
            Intent i = new Intent(LanguageSelect.this, EnglishActivity.class);
            startActivity(i);
            setLocale("en");

        } else if (view == b2) {
            Intent i = new Intent(LanguageSelect.this, HindiAcitvity.class);
            startActivity(i);
            setLocale("hi");
        } else if (view == b3){
            Intent i = new Intent(LanguageSelect.this, MarathiActivity.class);
            startActivity(i);
            setLocale("mr");
        }
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
        public void loadLocale() {
            SharedPreferences prefs = getSharedPreferences("Settings", MODE_PRIVATE);
            String language = prefs.getString("My_Lang", "");
            setLocale(language);
        }
}