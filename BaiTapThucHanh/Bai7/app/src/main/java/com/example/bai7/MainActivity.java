package com.example.bai7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm ListView
        android.widget.ListView listView = findViewById(R.id.listView);

        // Generate dữ liệu: bắt đầu từ 23115053122320, 5 lần, +1 mỗi lần
        List<String> data = new ArrayList<>();
        long startNumber = 23115053122320L;
        for (int i = 0; i < 5; i++) {
            data.add(String.valueOf(startNumber + i));
        }

        // Custom Adapter
        CustomAdapter adapter = new CustomAdapter(this, R.layout.list_item, data);
        listView.setAdapter(adapter);
    }

    // Custom ArrayAdapter
    private static class CustomAdapter extends ArrayAdapter<String> {
        public CustomAdapter(android.content.Context context, int resource, List<String> objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.list_item, parent, false);
            }

            TextView tvItem = convertView.findViewById(R.id.tvItem);
            String item = getItem(position);
            tvItem.setText(item);

            return convertView;
        }
    }
}