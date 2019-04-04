package com.hitenter.bearapp.bear_accessories;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class LeftBoot {
    ImageView leftBootImageView;
    int  leftBoot = R.drawable.bear_left_boot;


    public LeftBoot(ImageView leftBootImageView){

        this.leftBootImageView = leftBootImageView;
        leftBootImageView.setImageResource(leftBoot);



    }


    public int getLeftBoot() {
        return leftBoot;
    }



}
