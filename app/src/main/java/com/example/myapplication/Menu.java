package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView view = findViewById(R.id.imageView22);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Notification.class);
                startActivity(intent);
            }
        });

        ImageView view2 = findViewById(R.id.imageView23);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView view3 = findViewById(R.id.imageView24);
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, GuestInfo.class);
                startActivity(intent);
            }
        });

        ImageView view4 = findViewById(R.id.imageView25);
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu.class);
                startActivity(intent);
            }
        });

        ImageView view5 = findViewById(R.id.imageView26);
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Reservation.class);
                startActivity(intent);
            }
        });

        ImageView view6 = findViewById(R.id.imageView27);
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Location.class);
                startActivity(intent);
            }
        });
    }
}