package com.example.apphack;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PetitionActivity extends AppCompatActivity {
    //public String[] keys = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(adapter.getCount()-1);
        Listado listado = (Listado) getIntent().getSerializableExtra("listado");


        TextView userTextView = findViewById(R.id.userTextView);
        TextView scoreTextView = findViewById(R.id.scoreTextView);
       /* TextView key1TextView = findViewById(R.id.key1TextView);
        TextView key2TextView = findViewById(R.id.key2TextView);
        TextView key3TextView = findViewById(R.id.key3TextView);*/
        TextView titleTextView = findViewById(R.id.titleTextView);
        //TextView bodyTextView = findViewById(R.id.bodyTextView);
        //TextView idTextView = findViewById(R.id.idTextView);
        ImageView iconImageView = findViewById(R.id.iconImageView);
       // ImageView fondo1ImageView = findViewById(R.id.fondo1ImageView);
       // ImageView fondo2ImageView = findViewById(R.id.fondo2ImageView);


        /*userTextView.setText(listado.username);
        scoreTextView.setText("Calificación: " + listado.score + "%");
        key1TextView.setText(listado.keywords[0]);

        if (listado.keywords[1] != null) {
            key2TextView.setText(listado.keywords[1]);
            if (listado.keywords[2] != null)
                key3TextView.setText(listado.keywords[2]);
        }

        titleTextView.setText(listado.title);
       // bodyTextView.setText(listado.text);
       // idTextView.setText(String.valueOf(listado.id));
        iconImageView.setImageResource(listado.imageId);
       // fondo1ImageView.setImageResource(listado.imageF1);
       // fondo2ImageView.setImageResource(listado.imageF2);
        */



    }


}
