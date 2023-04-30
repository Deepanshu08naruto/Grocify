package com.example.grocify.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocify.R;
import com.example.grocify.models.TeaCoffeeModels;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TeaCoffeeAdapter extends RecyclerView.Adapter<TeaCoffeeAdapter.ViewHolder> {

    List<TeaCoffeeModels> list;

    public TeaCoffeeAdapter(List<TeaCoffeeModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tea_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.circleImageView.setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView circleImageView;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            circleImageView = itemView.findViewById(R.id.circleImageView2);
        }
    }
}
