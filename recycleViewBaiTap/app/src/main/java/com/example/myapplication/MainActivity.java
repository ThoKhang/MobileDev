package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_320;
    private TreeAdapter_320 treeAdapter_320;
    private List<Tree_320> treeList_320;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_320 = findViewById(R.id.recyclerView_320);
        recyclerView_320.setLayoutManager(new LinearLayoutManager(this));

        treeList_320 = createSampleData_320();

        // Sử dụng interface riêng để bắt click
        treeAdapter_320 = new TreeAdapter_320(this, treeList_320, new OnItemClickListener_320() {
            @Override
            public void onItemClick(Tree_320 tree_320) {
                // Hiện Toast với tên cây
                Toast.makeText(MainActivity.this, tree_320.getName_320(), Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView_320.setAdapter(treeAdapter_320);
    }

    private List<Tree_320> createSampleData_320() {
        List<Tree_320> list_320 = new ArrayList<>();
        list_320.add(new Tree_320("Cây Bàng", "Thường gặp nơi sân trường, đường phố.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Đa", "Cổ thụ, có rễ chùm đặc trưng.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Dừa", "Biểu tượng miền Tây, vùng biển.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Tràm", "Sinh trưởng tốt ở vùng ngập mặn.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Me", "Trái chua, ứng dụng trong ẩm thực.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Bưởi", "Trồng nhiều ở miền Bắc và miền Trung.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Cam", "Trái cam, nguồn vitamin C.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Xoài", "Trái xoài, ăn ngon, trồng nhiều miền Nam.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Chuối", "Dễ trồng, quả dùng trong ăn uống.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Lộc Vừng", "Cây cảnh, lá xanh quanh năm.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Phượng Vỹ", "Hoa đỏ, gắn liền với tuổi học trò.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Bằng Lăng", "Hoa tím đẹp, trồng ven đường phố.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Sấu", "Thân to, lá xanh, hay trồng ở công viên.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Mít", "Quả to, ăn và làm bánh.", R.drawable.ic_tree_placeholder_320));
        list_320.add(new Tree_320("Cây Vú Sữa", "Trái ngọt, miền Nam phổ biến.", R.drawable.ic_tree_placeholder_320));
        return list_320;
    }
}
