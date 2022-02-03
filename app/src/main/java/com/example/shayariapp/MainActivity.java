package com.example.shayariapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.widget.Toast;

import com.example.shayariapp.Application.Adapter;
import com.example.shayariapp.Application.MainModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<MainModel> arrayList = new ArrayList<>();
        arrayList.add(new MainModel("Comedy Shayari","30",R.drawable.boy1));
        arrayList.add(new MainModel("Desh Bhakti Shayarii","13",R.drawable.copy));
        arrayList.add(new MainModel("Girls Shayari","11",R.drawable.girl2));
        arrayList.add(new MainModel("Friendship Shayari","12",R.drawable.boy4));
        arrayList.add(new MainModel("Love Sharayi","13",R.drawable.copy));
        arrayList.add(new MainModel("Sorry Shayari","15",R.drawable.girl4));
        arrayList.add(new MainModel("Bevafa Shayari","14",R.drawable.share));
        arrayList.add(new MainModel("Pati Patni","13",R.drawable.copy));
        arrayList.add(new MainModel("Shas Bahu","12",R.drawable.whatsapp));
        arrayList.add(new MainModel("Status","11",R.drawable.share));
        arrayList.add(new MainModel("Teacher","11",R.drawable.share));

        recyclerView.setAdapter(new Adapter(getApplicationContext(),arrayList));
    }
 
}