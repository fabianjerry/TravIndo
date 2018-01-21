package com.guefabian.travelerindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buttonlogin(View view){
        Intent login = new Intent(com.guefabian.travelerindonesia.login.this,MainActivity. class);
        startActivity(login);
    }
}