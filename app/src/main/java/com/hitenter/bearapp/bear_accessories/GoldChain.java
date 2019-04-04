package com.hitenter.bearapp.bear_accessories;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class GoldChain {
    ImageView goldChainImageView;
    int  goldChain = R.drawable.gold_chain;


    public GoldChain(ImageView goldChainImageView){

        this.goldChainImageView = goldChainImageView;
        goldChainImageView.setImageResource(goldChain);



    }


    public int getGoldChain() {
        return goldChain;
    }





}
