package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ProgrammingAdapter adapter;

    ArrayList<ListItem> itemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addStuff();
        initRecyclerView();
    }
    private void initRecyclerView()
    {
        RecyclerView r=findViewById(R.id.menu_rv);
        adapter=new ProgrammingAdapter(itemList,this);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(adapter);
    }
    private  void addStuff()
    {
        String[] hostels={"AH1","AH2","AH3","AH4","AH5","AH6","AH7","AH8","AH9","CH1","CH2"};
        for(int i=0;i<hostels.length;i++)
        {
            itemList.add(new ListItem(hostels[i]));
        }
    }

}
