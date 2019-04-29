package com.example.apphack;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                callListing(position);
            }
        };
        listNoticias.setOnItemClickListener(listener);
    }

    private void callListing(int position) {
        Context context = getApplicationContext();

        Intent intent = new Intent(this, PetitionActivity.class);

        String text = String.valueOf(listaPeticiones.get(position).getDescripcion());
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        intent.putExtra("Peticion", listaPeticiones.get(position));
        startActivity(intent);
    }

    private ArrayList<Peticion> getListaPeticiones ()
    {
        ArrayList<Peticion> listItems = new ArrayList<>();
        listItems.add(new Peticion("Titulo","Descripcion" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut vitae consequat leo. " +
                "Vestibulum blandit pharetra hendrerit. Nullam et libero sed leo vehicula placerat. " +
                "Morbi libero purus, ultricies at nisl eget, fermentum tristique tellus. Nam nunc nulla, " +
                "posuere vitae arcu sit amet, condimentum vestibulum elit. Curabitur eget ultricies libero," +
                " non mollis arcu. Orci varius natoque penatibus et magnis dis parturient montes, nascetur " +
                "ridiculus mus. Praesent vitae consequat leo. In laoreet consectetur mauris. Nunc pellentesque" +
                " ex sed lacus porta, at cursus est ultricies.",486,
                5600.0f, 5900));
        listItems.add(new Peticion("Titulo2","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo3","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo4","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo5","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo6","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo7","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Titulo8","Descripcion",1,1.0f, 1.0f));

        return listItems;
    }

}
