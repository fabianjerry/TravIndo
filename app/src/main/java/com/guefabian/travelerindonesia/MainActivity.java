package com.guefabian.travelerindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonsemarang(View view){
        Intent semarang = new Intent(MainActivity. this, com.guefabian.travelerindonesia.semarang. class);
        startActivity(semarang);

    }

    public void buttonbandung(View view){
        Toast.makeText(this, "COMING SOON", Toast.LENGTH_SHORT).show();
    }
    public void buttonjogja(View view){
        Toast.makeText(this, "COMING SOON", Toast.LENGTH_SHORT).show();
    }
    public void buttonsolo(View view){
        Toast.makeText(this, "COMING SOON", Toast.LENGTH_SHORT).show();
    }
    public void buttontentang(View view){
        Intent tentang = new Intent(MainActivity. this, com.guefabian.travelerindonesia.tentang. class);
        startActivity(tentang);
    }




}
