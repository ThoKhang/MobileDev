package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TreeAdapter_320 extends RecyclerView.Adapter<TreeAdapter_320.ViewHolder_320> {

    private Context context_320;
    private List<Tree_320> treeList_320;
    private OnItemClickListener_320 listener_320;  // dùng interface riêng

    public TreeAdapter_320(Context context_320, List<Tree_320> treeList_320, OnItemClickListener_320 listener_320) {
        this.context_320 = context_320;
        this.treeList_320 = treeList_320;
        this.listener_320 = listener_320;
    }

    @NonNull
    @Override
    public ViewHolder_320 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_320 = LayoutInflater.from(context_320).inflate(R.layout.item_tree_card_320, parent, false);
        return new ViewHolder_320(view_320);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_320 holder, int position) {
        Tree_320 tree_320 = treeList_320.get(position);
        holder.tvName_320.setText(tree_320.getName_320());
        holder.tvDesc_320.setText(tree_320.getDescription_320());
        holder.ivTree_320.setImageResource(tree_320.getImageRes_320());
        holder.tvOwner_320.setText("Trần Văn Thọ Khang_320");

        // click trả về interface
        holder.card_320.setOnClickListener(v -> {
            if (listener_320 != null) {
                listener_320.onItemClick(tree_320);
            }
        });
    }

    @Override
    public int getItemCount() {
        return treeList_320.size();
    }

    static class ViewHolder_320 extends RecyclerView.ViewHolder {
        CardView card_320;
        ImageView ivTree_320;
        TextView tvName_320, tvDesc_320, tvOwner_320;

        public ViewHolder_320(@NonNull View itemView) {
            super(itemView);
            card_320 = itemView.findViewById(R.id.card_320);
            ivTree_320 = itemView.findViewById(R.id.ivTree_320);
            tvName_320 = itemView.findViewById(R.id.tvName_320);
            tvDesc_320 = itemView.findViewById(R.id.tvDesc_320);
            tvOwner_320 = itemView.findViewById(R.id.tvOwner_320);
        }
    }
}
