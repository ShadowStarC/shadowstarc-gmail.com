package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class photogalleryActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView nature,pl,raspberries,space,technology;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photogallery);

        nature= findViewById(R.id.natureId);
        pl= findViewById(R.id.plId);
        raspberries= findViewById(R.id.raspberriesId);
        space= findViewById(R.id.spaceId);
        technology= findViewById(R.id. technologyId);

        button=findViewById(R.id.buttonId);

        nature.setOnClickListener(this);
       pl.setOnClickListener(this);
       raspberries.setOnClickListener(this);
        space.setOnClickListener(this);
        technology.setOnClickListener(this);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.natureId)
        {
            nature.setVisibility(View.GONE);
            pl.setVisibility(View.VISIBLE);
            raspberries.setVisibility(View.GONE);
            space.setVisibility(View.GONE);
            technology.setVisibility(View.GONE);

        }



        if(v.getId()==R.id.plId)
        {
            nature.setVisibility(View.GONE);
            pl.setVisibility(View.GONE);
            raspberries.setVisibility(View.VISIBLE);
            space.setVisibility(View.GONE);
            technology.setVisibility(View.GONE);

        }


        if(v.getId()==R.id.raspberriesId)
        {
            nature.setVisibility(View.GONE);
            pl.setVisibility(View.GONE);
            raspberries.setVisibility(View.GONE);
            space.setVisibility(View.VISIBLE);
            technology.setVisibility(View.GONE);

        }


        if(v.getId()==R.id.spaceId)
        {
            nature.setVisibility(View.GONE);
            pl.setVisibility(View.GONE);
            raspberries.setVisibility(View.GONE);
            space.setVisibility(View.GONE);
            technology.setVisibility(View.VISIBLE);

        }


        if(v.getId()==R.id.spaceId)
        {
            nature.setVisibility(View.VISIBLE);
            pl.setVisibility(View.GONE);
            raspberries.setVisibility(View.GONE);
            space.setVisibility(View.GONE);
            technology.setVisibility(View.GONE);

        }

        if(v.getId()==R.id.buttonId)
        {
            Intent intent=new Intent(photogalleryActivity.this,viewInfoActivity.class);
            startActivity(intent);

        }





    }
}
