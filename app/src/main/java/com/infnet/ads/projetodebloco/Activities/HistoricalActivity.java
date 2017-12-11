package com.infnet.ads.projetodebloco.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.infnet.ads.projetodebloco.Products.ProductOrdered;
import com.infnet.ads.projetodebloco.Products.ProductOrderedAdapter;
import com.infnet.ads.projetodebloco.R;

import java.util.ArrayList;
import java.util.List;

public class HistoricalActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public static List<ProductOrdered> productOrderedList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);

        recyclerView = findViewById(R.id.recycler_historical);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layout);
        recyclerView.setAdapter(new ProductOrderedAdapter(productOrderedList, this));

    }
}
