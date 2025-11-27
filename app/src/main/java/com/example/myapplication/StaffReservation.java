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

public class StaffReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_staff_reservation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView view = findViewById(R.id.imageView58);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, Notification.class);
                startActivity(intent);
            }
        });

        ImageView view2 = findViewById(R.id.imageView59);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView view3 = findViewById(R.id.imageView60);
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, GuestInfo.class);
                startActivity(intent);
            }
        });

        ImageView view4 = findViewById(R.id.imageView61);
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, StaffMenu.class);
                startActivity(intent);
            }
        });

        ImageView view5 = findViewById(R.id.imageView62);
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, StaffReservation.class);
                startActivity(intent);
            }
        });

        ImageView view6 = findViewById(R.id.imageView63);
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffReservation.this, Location.class);
                startActivity(intent);
            }
        });
    }
}