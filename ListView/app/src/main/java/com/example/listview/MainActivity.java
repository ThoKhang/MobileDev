package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] monHoc = {"Toán", "Văn", "Anh", "Sinh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewMonHoc320);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (
                this,android.R.layout.simple_list_item_1, monHoc
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String tenMon = monHoc[position];
            Toast.makeText(this, "Bạn chọn: " + tenMon, Toast.LENGTH_SHORT).show();
        });
    }
}