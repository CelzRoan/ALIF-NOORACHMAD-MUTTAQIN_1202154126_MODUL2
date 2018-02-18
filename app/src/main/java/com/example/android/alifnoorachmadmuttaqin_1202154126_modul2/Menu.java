package com.example.android.alifnoorachmadmuttaqin_1202154126_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Ayam Bakar");
            foods.add("Soto");
            foods.add("Pecel");

            priceses.add(14000);
            priceses.add(12000);
            priceses.add(11000);

            photos.add(R.drawable.ayam);
            photos.add(R.drawable.soto);
            photos.add(R.drawable.pecel);
        }
    }
}
