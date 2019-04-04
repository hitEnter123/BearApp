package com.hitenter.bearapp.bear_accessories;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class RightBoot {
    ImageView rightBootImageView;
    int  rightBoot = R.drawable.bear_right_boot;


    public RightBoot(ImageView rightBootImageView){

        this.rightBootImageView = rightBootImageView;
        rightBootImageView.setImageResource(rightBoot);



    }


    public int getRightBoot() {
        return rightBoot;
    }



}
