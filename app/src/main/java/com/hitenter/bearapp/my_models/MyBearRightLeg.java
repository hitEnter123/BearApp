package com.hitenter.bearapp.my_models;

import android.widget.ImageView;

public class MyBearRightLeg {

    public String myBearRightLeg = "This is my BearHead";

    ImageView bearRightLegImageView;
    int bearRightLegResourceId;




    public MyBearRightLeg() {

    }


    public MyBearRightLeg(ImageView bearRightLegImageView, int bearRightLegResourceId) {
        this.bearRightLegImageView = bearRightLegImageView;
        this.bearRightLegResourceId = bearRightLegResourceId;
    }


    public void setImageForBearRightLeg(){
        bearRightLegImageView.setImageResource(bearRightLegResourceId);




    }
}
