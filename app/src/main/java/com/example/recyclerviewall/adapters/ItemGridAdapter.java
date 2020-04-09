package com.example.recyclerviewall.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewall.R;
import com.example.recyclerviewall.models.Resort;

import java.util.ArrayList;

public class ItemGridAdapter extends RecyclerView.Adapter<ItemGridAdapter.GridViewHoslder> {
    private Context context;
    private ArrayList<Resort> listResort;

    public ItemGridAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Resort> getListResort() {
        return listResort;
    }

    public void setListResort(ArrayList<Resort> listResort) {
        this.listResort = listResort;
    }

    @NonNull
    @Override
    public GridViewHoslder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid,parent,false);
        return new GridViewHoslder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHoslder holder, final int position) {
        Glide.with(context).load(getListResort().get(position).getPhoto()).into(holder.gridImage);
        holder.gridImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,getListResort().get(position).getName()+" Selected",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListResort().size();
    }

    public class GridViewHoslder extends RecyclerView.ViewHolder {

        ImageView gridImage;

        public GridViewHoslder(@NonNull View itemView) {
            super(itemView);

            gridImage = itemView.findViewById(R.id.img_grid);
        }
    }
}
