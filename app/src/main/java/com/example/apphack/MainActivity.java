package com.example.apphack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean logo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View v) {
        ImageView img = (ImageView) findViewById(R.id.logoV);
        if (logo) {
            img.setVisibility(View.INVISIBLE);
            logo = false;
        }else{
            img.setVisibility(View.VISIBLE);
            logo = true;
        }
        Intent intent = new Intent(this, NoticiasActivity.class);
        Intent intent = new Intent(this, BeneficiadoActivity.class);
        startActivity(intent);
    }

    public void callRegistro(View view) {
        Intent intent = new Intent(this, PetitionActivity.class);
        startActivity(intent);
    }

}
