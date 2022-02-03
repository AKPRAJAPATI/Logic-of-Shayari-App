package com.example.shayariapp.Application;

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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.R;

import java.util.ArrayList;

public class Adapterr extends RecyclerView.Adapter<Adapterr.myAdViewHolder> {
    Context context;
    ArrayList<Model>  arrayList;

    public Adapterr(Context context, ArrayList<Model>  arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public myAdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myAdViewHolder(LayoutInflater.from(context).inflate(R.layout.items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myAdViewHolder holder, int position) {

        Model model =arrayList.get(position);
        holder.shayariya.setText(model.getShayari());
        int myColor = context.getResources().getColor(R.color.mycolors);
        int positions = holder.getAdapterPosition();
        holder.copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("msg",model.getShayari());
                assert clipboard != null;
                clipboard.setPrimaryClip(clip);
                Toast.makeText(context.getApplicationContext(), "Copied To Clipboard !",Toast.LENGTH_SHORT).show();
            }
        });
        holder.whatsappBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT,model.getShayari());
                try {
                    context.startActivity(whatsappIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(context.getApplicationContext(),"Whatsapp Not Installed",Toast.LENGTH_SHORT).show();
                }

            }
        });
        holder.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");

                sharingIntent.putExtra(Intent.EXTRA_TEXT,model.getShayari().indexOf(position));

                context.startActivity(Intent.createChooser(sharingIntent, "Share via"));



            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myAdViewHolder extends RecyclerView.ViewHolder {
        TextView shayariya;
        ImageView copyBtn,shareBtn,whatsappBtn;

        public myAdViewHolder(@NonNull View itemView) {
            super(itemView);
            shayariya = itemView.findViewById(R.id.myItemsShayari);
            copyBtn = itemView.findViewById(R.id.copyBtn);
            shareBtn = itemView.findViewById(R.id.shareBtn);
            whatsappBtn = itemView.findViewById(R.id.whatsappBtn);
        }
    }
}
