package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    Button button;

    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.tv);
        button=itemView.findViewById(R.id.btn);
    }
}
