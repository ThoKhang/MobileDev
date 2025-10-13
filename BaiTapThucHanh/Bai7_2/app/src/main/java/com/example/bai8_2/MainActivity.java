package com.example.bai8_2;
import android.graphics.Typeface;  // Thêm import này
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm views
        Spinner spinner = findViewById(R.id.spinnerLanguages);
        TextView tvSelected = findViewById(R.id.tvSelected);

        // Dữ liệu: Placeholder "Chọn ngôn ngữ lập trình của bạn" làm item đầu tiên
        String[] languages = {
                "Chọn ngôn ngữ lập trình của bạn",  // Placeholder mới
                "Java",
                "Android",
                "PHP",
                "C#",
                "ASP.NET"
        };

        // Custom Adapter cho Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, languages) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return createViewFromResource(convertView, parent, position, getContext(), R.layout.spinner_item);
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                return createViewFromResource(convertView, parent, position, getContext(), R.layout.spinner_dropdown_item);
            }

            private View createViewFromResource(View convertView, ViewGroup parent, int position, android.content.Context context, int layoutResource) {
                View view = convertView;
                if (view == null) {
                    LayoutInflater inflater = LayoutInflater.from(context);
                    view = inflater.inflate(layoutResource, parent, false);
                }

                TextView tvItem = view.findViewById(R.id.tvSpinnerItem);
                tvItem.setText(languages[position]);

                // Làm placeholder mờ hơn một chút (italic, xám)
                if (position == 0) {
                    tvItem.setTextColor(0xFF999999); // Màu xám
                    tvItem.setTypeface(Typeface.DEFAULT, Typeface.ITALIC); // Fix: Dùng Typeface cho italic
                } else {
                    tvItem.setTextColor(0xFF333333); // Màu đen đậm
                    tvItem.setTypeface(Typeface.DEFAULT, Typeface.NORMAL); // Fix: Dùng Typeface cho normal
                }

                return view;
            }
        };

        // Áp dụng adapter và chọn mặc định placeholder (index 0)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0); // Hiển thị placeholder mặc định

        // Xử lý sự kiện chọn (bỏ qua nếu chọn placeholder)
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    // Nếu chọn placeholder, ẩn TextView
                    tvSelected.setVisibility(View.GONE);
                } else {
                    // Nếu chọn ngôn ngữ thật, hiển thị
                    String selected = languages[position];
                    tvSelected.setText("Bạn đã chọn: " + selected);
                    tvSelected.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tvSelected.setVisibility(View.GONE);
            }
        });
    }
}