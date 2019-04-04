package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class BearHead {

   private final String bearHeadString = "This is bear head";
   private int bearHeadResourceId;
   private ImageView bearHeadImageHolder;



    public BearHead( int bearHeadResourceId , ImageView bearHeadImageHolder) {
        this.bearHeadImageHolder = bearHeadImageHolder;
        this.bearHeadResourceId = bearHeadResourceId;
    }




    public void placeBearHeadImageToImageHolder(){

        bearHeadImageHolder.setImageResource(bearHeadResourceId);

    }
}
