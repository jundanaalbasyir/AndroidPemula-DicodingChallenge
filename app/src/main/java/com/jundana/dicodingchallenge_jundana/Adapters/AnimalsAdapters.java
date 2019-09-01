package com.jundana.dicodingchallenge_jundana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.jundana.dicodingchallenge_jundana.AnimalDetailActivity;
import com.jundana.dicodingchallenge_jundana.Models.Animals;
import com.jundana.dicodingchallenge_jundana.R;

import java.util.ArrayList;

public class AnimalsAdapters extends RecyclerView.Adapter<AnimalsAdapters.ListViewHolder> {
    private Context mCtx;
    private ArrayList<Animals> listAnimal;

    public AnimalsAdapters(Context context, ArrayList<Animals> list){
        this.mCtx = context;
        this.listAnimal = list;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder listViewHolder, int position) {
        Animals animals = listAnimal.get(position);
        Glide.with(listViewHolder.itemView.getContext())
                .load(animals.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);
        listViewHolder.tvItemName.setText(animals.getAnimalsName());
        listViewHolder.tvItemDetail.setText(animals.getAnimalsDetail());
    }
    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvItemName, tvItemDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvItemName = itemView.findViewById(R.id.tv_item_name);
            tvItemDetail = itemView.findViewById(R.id.tv_item_detail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Animals animals = listAnimal.get(getAdapterPosition());
            Intent intent = new Intent(mCtx, AnimalDetailActivity.class);
            intent.putExtra("photoItem", animals.getPhoto());
            intent.putExtra("itemName", animals.getAnimalsName());
            intent.putExtra("itemNameDetail", animals.getAnimalsDetail());
            mCtx.startActivity(intent);
        }

    }
}