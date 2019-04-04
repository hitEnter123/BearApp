package com.hitenter.bearapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.hitenter.bearapp.completed_bear.Bear;

public class MainActivity extends AppCompatActivity {




    //TODO 1 : **UNCOMMENT** Initialise component
//    ImageView   myBearHeadImageView,
//                myBearBodyImageView,
//                myBearRightArmImageView,
//                myBearLeftArmImageView,
//                myBearRightLegImageView,
//                myBearLeftLegImageView;
//
//
//    ImageView   myBearGoldChain,
//                myBearHat,
//                myBearLeftBoot,
//                myBearRightBoot;


    ImageView   bearHeadImageView,
                bearBodyImageView,
                bearLeftArmImageView,
                bearRightArmImageView,
                bearLeftLegImageView,
                bearRightLegImageView;


    ImageView   bearGoldChainImageView,
                bearHatImageView,
                bearLeftBootImageView,
                bearRightBootImageView;



//    Button copyButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding Views
        bindViews();




        //TODO 3: Build BearHeadClass & Construct BearHead & Test getting the string




        //TODO 4: Construct Parameterised BearHead

        //TODO 5: SetImageForBearHead



        //TODO 6: Construct Other Parts






        //COMPLETED BEAR
       final Bear completedBear=  new Bear(
               bearHeadImageView,
               bearBodyImageView,
               bearLeftArmImageView,
               bearRightArmImageView,
               bearLeftLegImageView,
               bearRightLegImageView,

               bearGoldChainImageView,
               bearHatImageView,
               bearLeftBootImageView,
               bearRightBootImageView
        );



       //TODO 7: copy the fashion! try to check with logd Look into What method calls are available in BearAccessories














        //TODO Extra : Add Button click to steal

//        final int copyBearHat= completedBear.bearAccessories.getBearHatResourceId();
//        final int copyBearGoldChain = completedBear.bearAccessories.getGoldChainResourceId();
//        final int copyBearLeftBoot = completedBear.bearAccessories.getBearLeftBootResourceId();
//        final int copyBearRightBoot = completedBear.bearAccessories.getBearRightBootResourceId();
//
//
//        copyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("bearHat", "onCreate:  " + copyBearHat);
//                myBearHat.setImageResource(copyBearHat);
//
//                myBearGoldChain.setImageResource(copyBearGoldChain);
//
//                myBearLeftBoot.setImageResource(copyBearLeftBoot);
//
//                myBearRightBoot.setImageResource(copyBearRightBoot);
//
//            }
//        });



    }


    void bindViews(){



        //TODO 2: **UNCOMMENT** bindViews to MyBear
//        myBearHeadImageView= findViewById(R.id.my_bear_head);
//        myBearBodyImageView= findViewById(R.id.my_bear_body);
//        myBearRightArmImageView = findViewById(R.id.my_bear_rightarm);
//        myBearLeftArmImageView =findViewById(R.id.my_bear_leftarm);
//        myBearLeftLegImageView = findViewById(R.id.my_bear_leftleg);
//        myBearRightLegImageView = findViewById(R.id.my_bear_rightleg);
//
//        myBearGoldChain = findViewById(R.id.my_bear_goldchain);
//        myBearHat = findViewById(R.id.my_bear_hat);
//        myBearRightBoot = findViewById(R.id.my_bear_rightboot);
//        myBearLeftBoot = findViewById(R.id.my_bear_leftboot);






//         COMPLETED BEAR HERE
        bearHeadImageView = findViewById(R.id.bear_head_imageview);
        bearBodyImageView = findViewById(R.id.bear_body_imageview);
        bearRightArmImageView = findViewById(R.id.bear_rightarm_imageview);
        bearLeftArmImageView = findViewById(R.id.bear_leftarm_imageview);
        bearLeftLegImageView = findViewById(R.id.bear_leftleg_imageview);
        bearRightLegImageView = findViewById(R.id.bear_rightleg_imageview);

        bearGoldChainImageView = findViewById(R.id.gold_chain);
        bearHatImageView = findViewById(R.id.hat);
        bearLeftBootImageView = findViewById(R.id.bear_leftboot);
        bearRightBootImageView = findViewById(R.id.bear_rightboot);





        //Button
//        copyButton = findViewById(R.id.copy_fashion);

    }



}


//todo homework : create a MyBear class and move necessary parts into the class so that u just need to construct it once in onCreate()