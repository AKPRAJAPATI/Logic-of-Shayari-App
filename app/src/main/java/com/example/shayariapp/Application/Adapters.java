package com.example.shayariapp.Application;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.Classes.FriendActivity;
import com.example.shayariapp.Classes.attitudeActivity;
import com.example.shayariapp.Classes.birthDayActivity;
import com.example.shayariapp.Classes.buddeActivity;
import com.example.shayariapp.Classes.childActivity;
import com.example.shayariapp.Classes.deshBhaktiActivity;
import com.example.shayariapp.Classes.makeUpActivity;
import com.example.shayariapp.Classes.momActivity;
import com.example.shayariapp.Classes.pati_patniActivity;
import com.example.shayariapp.Classes.teacherActivity;
import com.example.shayariapp.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapters extends RecyclerView.Adapter<Adapters.myViewHolder> {

    Context context;
    ArrayList<Models> arrayList;

    public Adapters(Context context, ArrayList<Models> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Models models = arrayList.get(position);
        holder.profileImage.setImageResource(models.getImageResource());
        holder.shayariName.setText(models.getShayariname());
        holder.constraintLayout.setBackgroundResource(models.getBACKGROUND());

        //GET ITEM POSITION
        int itemPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (itemPosition) {
                    case 0:
                        Intent intent = new Intent(context, FriendActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intentC = new Intent(context, childActivity.class);
                        intentC.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intentC.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intentC);
                        break;
                    case 2:
                        Intent make_up = new Intent(context, makeUpActivity.class);
                        make_up.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        make_up.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(make_up);
                        break;
                    case 3:
                        Intent budde = new Intent(context, buddeActivity.class);
                        budde.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        budde.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(budde);
                        break;
                    case 4:
                        Intent teacher = new Intent(context, teacherActivity.class);
                        teacher.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        teacher.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(teacher);
                        break;

                    case 5:
                        Intent husband_wife = new Intent(context, pati_patniActivity.class);
                        husband_wife.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        husband_wife.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(husband_wife);
                        break;

                    case 6:
                        Intent mom = new Intent(context, momActivity.class);
                        mom.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        mom.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(mom);
                        break;

                    case 7:
                        Intent attitude = new Intent(context, attitudeActivity.class);
                        attitude.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        attitude.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(attitude);
                        break;

                    case 8:
                        Intent birthday = new Intent(context, birthDayActivity.class);
                        birthday.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        birthday.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(birthday);
                        break;

                    case 9:
                        Intent deshbhakati = new Intent(context, deshBhaktiActivity.class);
                        deshbhakati.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        deshbhakati.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(deshbhakati);
                        break;


                }


            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView shayariName;
        CircleImageView profileImage;
        ConstraintLayout constraintLayout;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            shayariName = itemView.findViewById(R.id.textView);
            profileImage = itemView.findViewById(R.id.profileImage);
            constraintLayout = itemView.findViewById(R.id.backgroundConstraintLayout);
        }
    }
}
