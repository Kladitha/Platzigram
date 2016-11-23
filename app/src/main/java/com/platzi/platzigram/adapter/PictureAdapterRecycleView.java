package com.platzi.platzigram.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.platzi.platzigram.R;

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
            pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard_);
            usernameCard = (TextView) itemView.findViewById(R.id.usernameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likenumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);
        }
    }
}
