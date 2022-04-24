package com.snbirajadar.hill_station_maharashtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    ImageButton Sangli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Sangli = findViewById(R.id.Sangli);

        Sangli.setOnClickListener(v -> {
            Toast.makeText(Home.this, "Ya ki Sangli la", Toast.LENGTH_SHORT).show();
            Intent sangli = new Intent(Home.this, com.snbirajadar.hill_station_maharashtra.Sangli.class);
            startActivity(sangli);
        });
    }
}