package com.example.apphack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoticiasActivity extends AppCompatActivity {

    ListView listNoticias;
    ArrayList<Peticion> listaPeticiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
        listaPeticiones = getListaPeticiones();
        listNoticias = (ListView) findViewById(R.id.listNoticias);
        listNoticias.setAdapter(new Adaptador(this,listaPeticiones));
    }

    private ArrayList<Peticion> getListaPeticiones ()
    {
        ArrayList<Peticion> listItems = new ArrayList<>();
        listItems.add(new Peticion("Titulo","Descripcion" +
                "Lorem ipsum",1,
                1.0f));
        listItems.add(new Peticion("Titulo2","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo3","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo4","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo5","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo6","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo7","Descripcion",1,1.0f));
        listItems.add(new Peticion("Titulo8","Descripcion",1,1.0f));

        return listItems;
    }

}
