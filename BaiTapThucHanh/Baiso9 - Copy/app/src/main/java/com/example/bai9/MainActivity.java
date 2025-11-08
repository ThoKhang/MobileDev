package com.example.bai9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Student> arr;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arr = new ArrayList<>();
        arr.add(new Student(1, "Trần Văn Thọ Khang", "23115053122320"));
        arr.add(new Student(2, "Nguyễn Quốc Cường", "161250533405"));
        arr.add(new Student(3, "Nguyễn Khương Đào", "151250533308"));
        arr.add(new Student(4, "Vy Văn Đỗ", "161250533207"));

        adapter = new StudentAdapter(this, arr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    "Bạn chọn: " + arr.get(position).name,
                    Toast.LENGTH_SHORT).show();
        });
    }
}
