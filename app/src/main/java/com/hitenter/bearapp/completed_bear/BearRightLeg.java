package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

public class BearRightLeg {

    private final String bearBodyString = "This is bear body";
    private int bearRightLegResourceId;
    private ImageView bearRightLegImageHolder;



    public BearRightLeg( int bearRightLegResourceId ,ImageView bearRightLegImageHolder) {
        this.bearRightLegImageHolder = bearRightLegImageHolder;
        this.bearRightLegResourceId = bearRightLegResourceId;
    }





    public void placeBearRightLegImageToImageHolder(){

        bearRightLegImageHolder.setImageResource(bearRightLegResourceId);

    }

}
