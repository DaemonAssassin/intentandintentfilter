package com.gmail.mateendev3.intentandintent_filter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DataShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_show);

        Toast.makeText(this, getIntent().getStringExtra(Intent.EXTRA_TEXT), Toast.LENGTH_SHORT).show();
    }
}