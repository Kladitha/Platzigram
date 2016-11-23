package com.platzi.platzigram.adapter;


import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.platzi.platzigram.R;
import com.platzi.platzigram.model.Picture;


import java.util.ArrayList;

/**
 * Created by claud on 23-11-2016.
 */

public class PictureAdapterRecycleView  extends RecyclerView.Adapter<PictureAdapterRecycleView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resources;
    private Activity activity;

    public PictureAdapterRecycleView(ArrayList<Picture> pictures, int resources, Activity activity) {
        this.pictures = pictures;
        this.resources = resources;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.usernameCard.setText(picture.getUsername());
        holder.timeCard.setText(picture.getTime());
        holder.likenumberCard.setText(picture.getLike_number());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likenumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard_);
            usernameCard = (TextView) itemView.findViewById(R.id.usernameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likenumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);
        }
    }
}
