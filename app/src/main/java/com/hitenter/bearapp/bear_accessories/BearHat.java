package com.hitenter.bearapp.bear_accessories;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class BearHat {

    ImageView bearHatImageView;
    int  bearHat = R.drawable.hat;


    public BearHat(ImageView bearHatImageView){

        this.bearHatImageView = bearHatImageView;
        bearHatImageView.setImageResource(bearHat);



    }


    public int getBearHat() {
        return bearHat;
    }



}
