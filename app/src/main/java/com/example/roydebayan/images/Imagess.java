package com.example.roydebayan.images;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Imagess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagess);
    }
    public void changeImage(View view){
     Log.i("you clicked","you clicked this image");
        Intent i = new Intent(Imagess.this,SecondImage.class);
        startActivity(i);
    }


}



