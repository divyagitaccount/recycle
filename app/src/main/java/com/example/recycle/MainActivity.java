package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct", "nov", "dec"};

        // Find your RecyclerView by its ID
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Create an instance of your Recycleradapter and set it on the RecyclerView
        Recycleradapter adapter = new Recycleradapter(this, data);
        recyclerView.setAdapter(adapter);

        // Set a layout manager to position your items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
