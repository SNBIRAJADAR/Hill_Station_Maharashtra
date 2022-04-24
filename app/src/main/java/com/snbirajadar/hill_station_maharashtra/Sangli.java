package com.snbirajadar.hill_station_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Sangli extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangli);
        textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(v -> Toast.makeText(Sangli.this, "chan", Toast.LENGTH_SHORT).show());
    }
}