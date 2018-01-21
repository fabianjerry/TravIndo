package com.guefabian.travelerindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class semarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semarang);
    }

    public void buttonfunsite (View view){
        Intent fssmg = new Intent(semarang.this, funsitesmg.class);
        startActivity(fssmg);
    }

    public void buttonphoto (View view){
        Toast.makeText(this, "NEXT UPDATE", Toast.LENGTH_SHORT).show();
    }

    public void buttonresto (View view){
        Toast.makeText(this, "NEXT UPDATE", Toast.LENGTH_SHORT).show();
    }

    public void buttonhotel (View view){
        Toast.makeText(this, "NEXT UPDATE", Toast.LENGTH_SHORT).show();
    }

    public void buttonbandara (View view){
        Toast.makeText(this, "NEXT UPDATE", Toast.LENGTH_SHORT).show();
    }

    public void buttonstasiun (View view){
        Toast.makeText(this, "NEXT UPDATE", Toast.LENGTH_SHORT).show();

    }

}

