package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username,password;
    Button login;
    UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.username_field);
        password=findViewById(R.id.password_field);
        login=findViewById(R.id.login_button);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.login_button){
            userDatabase=new UserDatabase(this);

            String u=username.getText().toString();
            String p=password.getText().toString();
            Boolean res=userDatabase.check(u,p);

            if(res==true){
                Intent intent=new Intent(loginActivity.this,photogalleryActivity.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Please Enter Correct User Id/Password", Toast.LENGTH_LONG).show();
        }
    }
}
