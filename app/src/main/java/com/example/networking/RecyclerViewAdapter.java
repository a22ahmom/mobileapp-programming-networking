package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private ArrayList<Mountain> mountainArrayList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView id_text, name_text;
        public ViewHolder(View view) {
            super(view);
            name_text = (TextView) view.findViewById(R.id.nameText);
        }
    }

    public RecyclerViewAdapter(ArrayList<Mountain> mountainArrayList) {
        this.mountainArrayList = mountainArrayList;
    }

    @Override
    @NonNull
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        String name = mountainArrayList.get(position).getName();
        holder.name_text.setText(name);
    }

    @Override
    public int getItemCount() {
        return mountainArrayList.size();
    }
}
