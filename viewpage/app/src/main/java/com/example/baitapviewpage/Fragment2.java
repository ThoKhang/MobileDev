package com.example.baitapviewpage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.*;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        list = new ArrayList<>();
        list.add(new Product("Bộ cáp sạc", "80.000đ", R.drawable.sample2));
        list.add(new Product("Ốp lưng", "40.000đ", R.drawable.sample5));
        list.add(new Product("Dây đeo đồng hồ", "60.000đ", R.drawable.sample6));
        list.add(new Product("Loa mini", "150.000đ", R.drawable.sample7));
        list.add(new Product("Pin dự phòng", "300.000đ", R.drawable.sample3));

        adapter = new ProductAdapter(list);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
