package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bai1.R;

public class MainActivity extends AppCompatActivity {

    EditText etWeight, etHeight;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ view
        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        // Xử lý khi bấm nút
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = etWeight.getText().toString().trim();
                String heightStr = etHeight.getText().toString().trim();

                if (weightStr.isEmpty() || heightStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both weight and height", Toast.LENGTH_SHORT).show();
                    return;
                }

                double weight = Double.parseDouble(weightStr);
                double heightCm = Double.parseDouble(heightStr);

                if (heightCm <= 0 || weight <= 0) {
                    Toast.makeText(MainActivity.this, "Invalid input!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển chiều cao sang mét
                double heightM = heightCm / 100;
                double bmi = weight / (heightM * heightM);

                // Xác định phân loại BMI
                String category;
                if (bmi < 18) {
                    category = "Bạn bị gầy";
                } else if (bmi < 24.9) {
                    category = "Bạn bình thường";
                } else if (bmi < 29.9) {
                    category = "Bạn béo phì cấp độ I";
                } else if (bmi < 34.9) {
                    category = "Bạn béo phì cấp độ II";
                } else {
                    category = "HẾT CỨU, bạn béo phì cấp độ 3";
                }

                // Hiển thị kết quả
                tvResult.setText(String.format("BMI: %.2f\nCategory: %s", bmi, category));
            }
        });
    }
}
