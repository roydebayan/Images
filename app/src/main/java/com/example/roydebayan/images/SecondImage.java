package com.example.roydebayan.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.roydebayan.images.R.id.imageView2;

public class SecondImage extends AppCompatActivity {


    public void clickAgain(View view){
        ImageView sticker =(ImageView) findViewById(imageView2);
           sticker.setImageResource(R.drawable.newsticker);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_image);
    }
}
