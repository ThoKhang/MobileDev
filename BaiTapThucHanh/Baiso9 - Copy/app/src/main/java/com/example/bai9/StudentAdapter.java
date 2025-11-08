package com.example.bai9;

import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.*;

public class StudentAdapter extends BaseAdapter {

    Context context;
    ArrayList<Student> data;

    public StudentAdapter(Context context, ArrayList<Student> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() { return data.size(); }

    @Override
    public Object getItem(int i) { return data.get(i); }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_student, parent, false);
        }

        TextView txtNumber = view.findViewById(R.id.txtNumber);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtMSSV = view.findViewById(R.id.txtMSSV);

        Student s = data.get(i);

        txtNumber.setText(String.valueOf(s.index));
        txtName.setText(s.name);
        txtMSSV.setText(s.mssv);

        return view;
    }
}
