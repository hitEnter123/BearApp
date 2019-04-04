package com.hitenter.bearapp.my_models;

import android.widget.ImageView;

public class MyBearLeftArm {
    public String myBearLeftArm = "This is my BearHead";

    ImageView bearLeftArmImageView;
    int bearLeftArmResourceId;




    public MyBearLeftArm() {

    }


    public MyBearLeftArm(ImageView bearLeftArmImageView, int bearLeftArmResourceId) {
        this.bearLeftArmImageView = bearLeftArmImageView;
        this.bearLeftArmResourceId = bearLeftArmResourceId;
    }


    public void setImageForBearLeftArm(){
        bearLeftArmImageView.setImageResource(bearLeftArmResourceId);




    }
}
