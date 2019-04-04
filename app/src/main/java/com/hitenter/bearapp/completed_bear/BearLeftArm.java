package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

public class BearLeftArm {

    private final String bearBodyString = "This is bear body";
    private int bearLeftArmResourceId;
    private ImageView bearLeftArmImageHolder;



    public BearLeftArm( int bearLeftArmResourceId ,ImageView bearLeftArmImageHolder) {
        this.bearLeftArmImageHolder = bearLeftArmImageHolder;
        this.bearLeftArmResourceId = bearLeftArmResourceId;
    }

    



    public void placeBearLeftArmImageToImageHolder(){

        bearLeftArmImageHolder.setImageResource(bearLeftArmResourceId);

    }

}
