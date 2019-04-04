package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

public class BearBody {

    private final String bearBodyString = "This is bear body";
    private int bearBodyResourceId;
    private ImageView bearBodyImageHolder;



    public BearBody( int bearBodyResourceId ,ImageView bearBodyImageHolder) {
        this.bearBodyImageHolder = bearBodyImageHolder;
        this.bearBodyResourceId = bearBodyResourceId;
    }




    public void placeBearBodyImageToImageHolder(){

        bearBodyImageHolder.setImageResource(bearBodyResourceId);

    }

}
