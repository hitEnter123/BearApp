package com.hitenter.bearapp.my_models;

import android.widget.ImageView;

public class MyBearLeftLeg {

    public String myBearLeftLeg = "This is my BearHead";

    ImageView bearLeftLegImageView;
    int bearLeftLegResourceId;




    public MyBearLeftLeg() {

    }


    public MyBearLeftLeg(ImageView bearLeftLegImageView, int bearLeftLegResourceId) {
        this.bearLeftLegImageView = bearLeftLegImageView;
        this.bearLeftLegResourceId = bearLeftLegResourceId;
    }


    public void setImageForBearLeftLeg(){
        bearLeftLegImageView.setImageResource(bearLeftLegResourceId);




    }
}
