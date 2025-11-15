package com.example.baitapviewpage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.*;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        recyclerView = view.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new Product("Áo thun nam", "120.000đ", R.drawable.sample1));
        list.add(new Product("Tai nghe Bluetooth", "350.000đ", R.drawable.sample2));
        list.add(new Product("Giày sneaker", "550.000đ", R.drawable.sample3));
        list.add(new Product("Túi chéo", "220.000đ", R.drawable.sample4));

        adapter = new ProductAdapter(list);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
