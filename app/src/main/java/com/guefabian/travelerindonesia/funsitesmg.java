package com.guefabian.travelerindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class funsitesmg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funsitesmg);
    }

    public void buttonwbsmg (View view) {
        Intent waterb = new Intent(funsitesmg.this, waterblaster.class);
        startActivity(waterb);
    }

    public void buttonparcysmg (View view){
        Toast.makeText(this, "still on process", Toast.LENGTH_SHORT).show();
    }

    public void buttoneplaza(View view){
        Toast.makeText(this, "Still on process", Toast.LENGTH_SHORT).show();
    }

    public void buttontransmartsmg (View view){
        Toast.makeText(this, "Still on process", Toast.LENGTH_SHORT).show();
    }

    public void buttonwonderia(View view){
        Toast.makeText(this, "Still on process", Toast.LENGTH_SHORT).show();
    }

}
