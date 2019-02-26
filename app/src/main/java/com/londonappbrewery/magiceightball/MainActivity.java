package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign a variable for the ImageView control, where we show the eight ball images
        final ImageView eightBall = findViewById(R.id.image_EightBall);

        //Assign a variable for the button so we can create an event handler for it
        Button myButton = findViewById(R.id.button_Ask);

        //Create an int array to store the identifiers of the 8 ball Images we will use
        final int[] images = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        //Create the event handler (listener) for the button click:
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);
                int resourceID = images[number];
                eightBall.setImageResource(resourceID);
                Log.d("magiceightball", "The number for the image is: " + number);
            }
        });



    }

}
