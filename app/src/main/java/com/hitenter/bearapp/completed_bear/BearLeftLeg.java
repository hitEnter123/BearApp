package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

public class BearLeftLeg {


    private final String bearBodyString = "This is bear body";
    private int bearLeftLegResourceId;
    private ImageView bearLeftLegImageHolder;



    public BearLeftLeg( int bearLeftLegResourceId ,ImageView bearLeftLegImageHolder) {
        this.bearLeftLegImageHolder = bearLeftLegImageHolder;
        this.bearLeftLegResourceId = bearLeftLegResourceId;
    }





    public void placeBearLeftLegImageToImageHolder(){

        bearLeftLegImageHolder.setImageResource(bearLeftLegResourceId);

    }



}
