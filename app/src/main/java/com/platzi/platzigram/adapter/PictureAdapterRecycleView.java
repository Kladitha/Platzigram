package com.platzi.platzigram.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by claud on 23-11-2016.
 */

public class PictureAdapterRecycleView {
    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likenumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
        }
    }
}
