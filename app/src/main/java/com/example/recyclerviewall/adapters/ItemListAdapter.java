package com.example.recyclerviewall.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewall.R;
import com.example.recyclerviewall.models.Resort;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder>{

    private Context context;
    private ArrayList<Resort> listResort;

    public ItemListAdapter(Context context) {
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
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListResort().get(position).getName());
        holder.tvElevation.setText(getListResort().get(position).getElevation());
        Glide.with(context).load(getListResort().get(position).getPhoto()).into(holder.imgList);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,getListResort().get(position).getName()+" clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListResort().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvElevation;
        ImageView imgList;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name_list);
            tvElevation = itemView.findViewById(R.id.tv_elevation_list);
            imgList = itemView.findViewById(R.id.img_list);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}
