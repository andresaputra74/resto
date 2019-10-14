package com.example.belajar1;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
