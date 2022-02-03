package com.example.shayariapp.Application;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.Activity.GhamndiActivity;
import com.example.shayariapp.Activity.desh_bhakti;
import com.example.shayariapp.Activity.best_friends;
import com.example.shayariapp.Activity.bhai_bahan;
import com.example.shayariapp.Activity.budde_budiya;
import com.example.shayariapp.Activity.girls;
import com.example.shayariapp.Activity.jokes;
import com.example.shayariapp.Activity.pati_patni;
import com.example.shayariapp.Activity.sas_bahu;
import com.example.shayariapp.Activity.comedy_sharyi;
import com.example.shayariapp.Activity.teacher;
import com.example.shayariapp.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewholder> {

    Context context;
    ArrayList<MainModel> arrayList;

    public Adapter(Context context, ArrayList<MainModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }



    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewholder(LayoutInflater.from(context).inflate(R.layout.main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position) {
        MainModel model = arrayList.get(position);
        holder.shayariCount.setText(model.getShayriCount());
        holder.shayariTitle.setText(model.getShayriTitle());
        holder.shayriLogo.setImageResource(model.getShayariLogo());

        int myColor = context.getResources().getColor(R.color.mycolors);
        int myColor2 = context.getResources().getColor(R.color.purple_500);
        int positions = holder.getAdapterPosition();
        if (positions % 2 == 0) {
            holder.cardView.setCardBackgroundColor(myColor);
        }else{
            holder.cardView.setCardBackgroundColor(myColor2);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch (positions) {
                    case 0:
                        context.startActivity(new Intent(context,comedy_sharyi.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 1:
                        context.startActivity(new Intent(context,jokes.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 2:
                        context.startActivity(new Intent(context, girls.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 3:
                        context.startActivity(new Intent(context, desh_bhakti.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 4:
                        context.startActivity(new Intent(context, best_friends.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 5:
                        context.startActivity(new Intent(context, bhai_bahan.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 6:
                        context.startActivity(new Intent(context, budde_budiya.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 7:
                        context.startActivity(new Intent(context, pati_patni.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 8:
                        context.startActivity(new Intent(context, sas_bahu.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 9:
                        context.startActivity(new Intent(context, comedy_sharyi.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 10:
                        context.startActivity(new Intent(context, teacher.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewholder extends RecyclerView.ViewHolder {
        ImageView shayriLogo;
        TextView shayariTitle, shayariCount;
        CardView cardView;

        public myViewholder(@NonNull View itemView) {
            super(itemView);
            shayriLogo = itemView.findViewById(R.id.shayariLogo);
            shayariTitle = itemView.findViewById(R.id.shayriTitle);
            shayariCount = itemView.findViewById(R.id.shayriTotalCount);
            cardView = itemView.findViewById(R.id.cardview);

        }
    }
}
