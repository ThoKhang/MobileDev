package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button buttonRegister = findViewById(R.id.dangKyNgayBayGio320);
        buttonRegister.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, trangregister.class);
                    startActivity(intent);
                }
        );
        Button buttonLogin = findViewById(R.id.buttonLogin320);
        buttonLogin.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, Profile.class);
                    startActivity(intent);
                }
        );


    }
}