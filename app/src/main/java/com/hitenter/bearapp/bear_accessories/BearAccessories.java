package com.hitenter.bearapp.bear_accessories;

import android.widget.ImageView;

import com.hitenter.bearapp.R;

public class BearAccessories {


    
    GoldChain goldChain;
    BearHat bearHat;
    LeftBoot leftBoot;
    RightBoot rightBoot;

   public int goldChainResourceId, bearHatResourceId, bearLeftBootResourceId, bearRightBootResourceId;

    public BearAccessories(ImageView goldChainImageView, ImageView bearHatImageView, ImageView bearLeftBootImageView, ImageView bearRightBootImageView) {
        goldChain = new GoldChain(goldChainImageView);
        bearHat = new BearHat(bearHatImageView);
        leftBoot = new LeftBoot(bearLeftBootImageView);
        rightBoot = new RightBoot(bearRightBootImageView);
    }



    public int getGoldChainResourceId() {
        return goldChain.getGoldChain();
    }

    public void setGoldChainResourceId(int goldChainResourceId) {
        this.goldChainResourceId = goldChainResourceId;
        goldChain.goldChainImageView.setImageResource(goldChainResourceId);
    }

    public int getBearHatResourceId() {
        return bearHat.getBearHat();
    }


    public void setBearHatResourceId(int bearHatResourceId) {
        this.bearHatResourceId = bearHatResourceId;
        bearHat.bearHatImageView.setImageResource(bearHatResourceId);
    }



    public int getBearLeftBootResourceId() {
        return leftBoot.getLeftBoot();
    }



    public void setBearLeftBootResourceId(int bearLeftBootResourceId) {
        this.bearLeftBootResourceId = bearLeftBootResourceId;
        leftBoot.leftBootImageView.setImageResource(bearLeftBootResourceId);
    }



    public int getBearRightBootResourceId() {
        return rightBoot.getRightBoot();
    }





    public void setBearRightBootResourceId(int bearRightBootResourceId) {
        this.bearRightBootResourceId = bearRightBootResourceId;
        rightBoot.rightBootImageView.setImageResource(bearRightBootResourceId);
    }


}
