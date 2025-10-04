package com.example.myapplication; // Thay đổi package name nếu cần

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private Button btnAhihi;
    private Button btnDotnetGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Giả sử file XML là activity_main.xml

        // Tìm các button theo ID
        btnClick = findViewById(R.id.btnClick);
        btnAhihi = findViewById(R.id.btnAhihi);
        btnDotnetGroup = findViewById(R.id.btnDotnetGroup);

        // Xử lý sự kiện click cho button "Click để xem"
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bạn đã click vào 'Click để xem'!", Toast.LENGTH_SHORT).show();
            }
        });

        // Xử lý sự kiện click cho button "AHIHI đồ ngốc"
        btnAhihi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bạn đã click vào 'AHIHI đồ ngốc'!", Toast.LENGTH_SHORT).show();
            }
        });

        // Xử lý sự kiện click cho button "DONETGROUP"
        btnDotnetGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bạn đã click vào 'DONETGROUP'!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}