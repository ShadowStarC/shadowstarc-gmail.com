package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressbarId);

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {

                progressWork();
                startApp();

            }
        });

        thread.start();

    }



    void progressWork()
    {
        for(prog=20;prog<=100;prog=prog+40)
        {

            try {
                Thread.sleep(500);
                progressBar.setProgress(prog);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    void startApp()
    {


        Intent intent= new Intent(MainActivity.this,loginLogoutActivity.class);
        startActivity(intent);
        finish();

    }



}
