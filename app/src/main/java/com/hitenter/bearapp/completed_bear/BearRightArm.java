package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

public class BearRightArm {

    private final String bearBodyString = "This is bear body";
    private int bearRightArmResourceId;
    private ImageView bearRightArmImageHolder;



    public BearRightArm( int bearRightArmResourceId ,ImageView bearRightArmImageHolder) {
        this.bearRightArmImageHolder = bearRightArmImageHolder;
        this.bearRightArmResourceId = bearRightArmResourceId;
    }





    public void placeBearRightArmImageToImageHolder(){

        bearRightArmImageHolder.setImageResource(bearRightArmResourceId);

    }

}
