package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewBackToRegister = findViewById(R.id.backToRegister320);
        textViewBackToRegister.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, trangregister.class);
            startActivity(intent);
        });
        ImageButton textViewBackToLogin = findViewById(R.id.backtoLogin320);
        textViewBackToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
