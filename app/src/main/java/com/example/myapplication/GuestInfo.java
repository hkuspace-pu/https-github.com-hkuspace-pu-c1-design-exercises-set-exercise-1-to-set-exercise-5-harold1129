package com.example.myapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GuestInfo extends AppCompatActivity {

    String[] guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_guest_info);

        // string array for test
        Resources res = getResources();
        guest = res.getStringArray(R.array.guest_info_test);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, guest);
        ListView listView = findViewById(R.id.list_item);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, ChangePassword.class);
                startActivity(intent);
            }
        });

        ImageView view = findViewById(R.id.imageView14);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, Notification.class);
                startActivity(intent);
            }
        });

        ImageView view2 = findViewById(R.id.imageView15);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView view3 = findViewById(R.id.imageView16);
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, GuestInfo.class);
                startActivity(intent);
            }
        });

        ImageView view4 = findViewById(R.id.imageView17);
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, Menu.class);
                startActivity(intent);
            }
        });

        ImageView view5 = findViewById(R.id.imageView18);
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, Reservation.class);
                startActivity(intent);
            }
        });

        ImageView view6 = findViewById(R.id.imageView19);
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestInfo.this, Location.class);
                startActivity(intent);
            }
        });
    }
}