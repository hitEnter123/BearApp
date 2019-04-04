package com.hitenter.bearapp.completed_bear;

import android.widget.ImageView;

import com.hitenter.bearapp.bear_accessories.BearAccessories;
import com.hitenter.bearapp.completed_bear.image_files.ImageFiles;

public class Bear {



    public BearHead bearHead;
    public BearBody bearBody;
    public BearLeftArm bearLeftArm;
    public BearRightArm bearRightArm;
    public BearLeftLeg bearLeftLeg;
    public BearRightLeg bearRightLeg;
    public BearAccessories bearAccessories;


    public Bear(
             ImageView bearHeadImageView,
             ImageView bearbodyImageView,
             ImageView bearLeftArmImageView,
             ImageView bearRightArmImageView,
             ImageView bearLeftLegImageView,
             ImageView bearRightLegImageView,
             ImageView goldChainImageView,
             ImageView bearHatImageView,
             ImageView leftBootImageView,
             ImageView rightBootImageView




                    ) {



        bearAccessories = new BearAccessories(goldChainImageView,bearHatImageView,leftBootImageView,rightBootImageView);





        ImageFiles imageFiles= new ImageFiles();
        int bearHeadId = imageFiles.getBearHeadDrawableId();
        int bearBodyId = imageFiles.getBearBodyDrawableId();
        int bearLeftArmId = imageFiles.getBearLeftArmDrawableId();
        int bearRightArmId = imageFiles.getBearRightArmDrawableId();
        int bearLeftLegId = imageFiles.getBearLeftLegDrawableId();
        int bearRightLegId = imageFiles.getBearRightLegDrawableId();




        //Creating BearHead
        bearHead = new BearHead(bearHeadId,bearHeadImageView);
        bearHead.placeBearHeadImageToImageHolder();

        //Creating BearBody
        bearBody = new BearBody(bearBodyId, bearbodyImageView);
        bearBody.placeBearBodyImageToImageHolder();

        //Creating BearLeftArm
        bearLeftArm = new BearLeftArm(bearLeftArmId,bearLeftArmImageView);
        bearLeftArm.placeBearLeftArmImageToImageHolder();

        //Creating BearRightArm
        bearRightArm = new BearRightArm(bearRightArmId, bearRightArmImageView);
        bearRightArm.placeBearRightArmImageToImageHolder();



        //Creating BearLeftLeg
        bearLeftLeg = new BearLeftLeg(bearLeftLegId,bearLeftLegImageView);
        bearLeftLeg.placeBearLeftLegImageToImageHolder();


        //Creating BearRightLeg
        bearRightLeg = new BearRightLeg(bearRightLegId,bearRightLegImageView);
        bearRightLeg.placeBearRightLegImageToImageHolder();


    }







}
