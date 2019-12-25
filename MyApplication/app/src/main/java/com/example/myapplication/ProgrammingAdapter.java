package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

import static com.example.myapplication.R.layout.content_list_item;

public class ProgrammingAdapter extends RecyclerView.Adapter<MenuViewHolder> {
    ArrayList<ListItem> itemList;
    MainActivity mainActivity;

   /* private String[] data;
    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }
*/
    public ProgrammingAdapter(ArrayList<ListItem> itemList, MainActivity mainActivity) {
        this.itemList=itemList;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
`*/
        View view = LayoutInflater.from(parent.getContext()).inflate(content_list_item, parent, false);
        MenuViewHolder viewHolder = new MenuViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
       /* String title=data[position];
        holder.textView.setText(title);
        */
        holder.textView.setText(itemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

   /* public class ProgrammingViewHolder extends ViewHolder{

        TextView textView;
        Button button;

        public ProgrammingViewHolder(@NonNull View itemView) {


            super(itemView);
            button=itemView.findViewById(R.id.btn);
            textView=itemView.findViewById(R.id.tv);
        }
    }

    */
}
