package com.example.baitapviewpage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.*;

import java.util.ArrayList;

public class Fragment3 extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        recyclerView = view.findViewById(R.id.recyclerView3);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        list = new ArrayList<>();
        list.add(new Product("Nón lưỡi trai", "90.000đ", R.drawable.sample6));
        list.add(new Product("Vali du lịch", "650.000đ", R.drawable.sample4));
        list.add(new Product("Balo laptop", "490.000đ", R.drawable.sample1));
        list.add(new Product("Đồng hồ nam", "1.200.000đ", R.drawable.sample3));

        adapter = new ProductAdapter(list);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
