package com.hitenter.bearapp.my_models;

import android.widget.ImageView;

public class MyBearBody {
    public String myBearBody = "This is my BearHead";

    ImageView bearBodyImageView;
    int bearBodyResourceId;




    public MyBearBody() {

    }


    public MyBearBody(ImageView bearBodyImageView, int bearBodyResourceId) {
        this.bearBodyImageView = bearBodyImageView;
        this.bearBodyResourceId = bearBodyResourceId;
    }


    public void setImageForBearBody(){
        bearBodyImageView.setImageResource(bearBodyResourceId);




    }

}
