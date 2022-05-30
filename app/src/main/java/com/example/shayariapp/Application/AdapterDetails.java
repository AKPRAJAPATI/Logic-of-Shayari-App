package com.example.shayariapp.Application;

import static android.content.Context.CLIPBOARD_SERVICE;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.R;

import java.util.ArrayList;


public class AdapterDetails extends RecyclerView.Adapter<AdapterDetails.myViewHolders> {

    Context context;
    ArrayList<ModelDetail> arrayList;

    public AdapterDetails(Context context, ArrayList<ModelDetail> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public myViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_detail,parent,false);
        return new myViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolders holder, int position) {
        ModelDetail model = arrayList.get(position);

        holder.shayriya.setText(model.getShayariya());
        holder.whichTypeofShayri.setText(model.getWhichTipeOfShayary());
        holder.constraintLayout.setBackgroundResource(model.getBackgroundImage());

        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager)holder.itemView.getContext().getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(Intent.EXTRA_TEXT, model.getShayariya());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(holder.itemView.getContext(), "Shayari Copied", Toast.LENGTH_SHORT).show();
            }
        });

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,model.getShayariya());
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(shareIntent);

            }
        });
        holder.whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                shareIntent.putExtra(Intent.EXTRA_TEXT,model.getShayariya());
                shareIntent.setPackage("com.whatsapp");
                context.startActivity(shareIntent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewHolders extends RecyclerView.ViewHolder {
        TextView shayriya, whichTypeofShayri;
        ImageView copy, share, whatsapp;
        ConstraintLayout constraintLayout;
        public myViewHolders(@NonNull View itemView) {
            super(itemView);
            shayriya = itemView.findViewById(R.id.myShayari);
            whichTypeofShayri = itemView.findViewById(R.id.whichtypeShayari);
            copy = itemView.findViewById(R.id.copyBtn);
            share = itemView.findViewById(R.id.sharebtn);
            whatsapp = itemView.findViewById(R.id.whatsappbtn);
            constraintLayout = itemView.findViewById(R.id.constraintLayoutDetailActvity);

        }
    }
}
