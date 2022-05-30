package com.example.shayariapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.Application.Adapters;
import com.example.shayariapp.Application.Models;

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
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Models> arrayList = new ArrayList<>();
       // 1
        arrayList.add(new Models(R.drawable.friend_singles,"Friends Shayari",R.drawable.friend_singles));

        // 2
        arrayList.add(new Models(R.drawable.friendsingle,"Child Shayari",R.drawable.friendsingle));

        arrayList.add(new Models(R.drawable.make_main,"Make Up Shayari",R.drawable.make_main));

        arrayList.add(new Models(R.drawable.budde_main,"Budde Budiya Shayari",R.drawable.budde_main));

        arrayList.add(new Models(R.drawable.teacher_main,"Teachers Shayari",R.drawable.teacher_main));

        arrayList.add(new Models(R.drawable.hus_wife_main,"Pati Patni Shayari",R.drawable.hus_wife_main));

        arrayList.add(new Models(R.drawable.mom_main,"Mom Shayari",R.drawable.mom_main));
        arrayList.add(new Models(R.drawable.atti_main,"Attitude Shayari",R.drawable.atti_main));

        arrayList.add(new Models(R.drawable.birthday_main,"BirthDay Shayari",R.drawable.birthday_main));
        arrayList.add(new Models(R.drawable.des_man,"DeshBhakti Shayari",R.drawable.des_man));


        recyclerView.setAdapter(new Adapters(getApplicationContext(), arrayList));
    }

}