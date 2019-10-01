package com.example.dhananjay.burger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBarVar;
    TextView textViewVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBarVar = findViewById(R.id.ratingBar);
        textViewVar = findViewById(R.id.textView);

    }
    public  void submit(View view){

        float ratingValue = ratingBarVar.getRating();

        if(ratingValue < 2){
            textViewVar.setText("Rating: "+ ratingValue + "\n We will try better next time");
        }
        else if(ratingValue <= 3 && ratingValue >=2){
            textViewVar.setText("Rating: "+ ratingValue + "\n We will try to improve it");
        }
        else if(ratingValue <= 4 && ratingValue > 3){
            textViewVar.setText("Rating: "+ ratingValue + "\n Nice");
        }
        else if(ratingValue <= 5 && ratingValue > 4 ){
            textViewVar.setText("Rating: "+ ratingValue + "\n You Motivate me");
        }



    }
}
