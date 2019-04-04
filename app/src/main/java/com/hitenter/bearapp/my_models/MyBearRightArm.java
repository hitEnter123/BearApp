package com.hitenter.bearapp.my_models;

import android.widget.ImageView;

public class MyBearRightArm {
    public String myBearRightArm = "This is my BearHead";

    ImageView bearRightArmImageView;
    int bearRightArmResourceId;




    public MyBearRightArm() {

    }


    public MyBearRightArm(ImageView bearRightArmImageView, int bearRightArmResourceId) {
        this.bearRightArmImageView = bearRightArmImageView;
        this.bearRightArmResourceId = bearRightArmResourceId;
    }


    public void setImageForBearRightArm(){
        bearRightArmImageView.setImageResource(bearRightArmResourceId);




    }
}
