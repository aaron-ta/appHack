package com.example.apphack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class BeneficiadoActivity extends AppCompatActivity {

    private Beneficiado beneficiado;
    private ArrayList<Peticion> lista_peticiones;
    private TextView txtNombre,txtTelfono,txtCorreo,txtEstado_Municipio,txtFechaFundacion;
    private ImageView imgBeneficiado;
    private ListView listview_peticiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiado);

        //beneficiado = (Beneficiado) getIntent().getSerializableExtra("Beneficiado");
        //lista_peticiones = (ArrayList<Peticion>) getIntent().getSerializableExtra("lista_peticion");
        beneficiado = new Beneficiado("eqwe","Clinica ninos heroes",
                "asdasda","6647897460", "carlitos@gmail.com",
                "Baja California","Tijuana",
                "AHE654ASRACC",new Date(1995,03,9));
        lista_peticiones = getListaPeticiones();
        imgBeneficiado = (ImageView) findViewById(R.id.imgBeneficado);
        txtNombre = (TextView) findViewById(R.id.txtNombre_clinica);
        txtTelfono = (TextView) findViewById(R.id.txtTelefono);
        txtCorreo = (TextView) findViewById(R.id.txtCorreo);
        txtEstado_Municipio = (TextView) findViewById(R.id.txtEstado_Municipio);
        txtFechaFundacion = (TextView) findViewById(R.id.txtFecha);
        listview_peticiones = (ListView) findViewById(R.id.list_beneficiado_has_peticiones);

        imgBeneficiado.setImageResource(R.drawable.logo);
        txtNombre.setText(beneficiado.getNombre_clinica());
        txtTelfono.setText(beneficiado.getTelefono());
        txtCorreo.setText(beneficiado.getCorreo());
        txtEstado_Municipio.setText(beneficiado.getEstado()+", "+beneficiado.getMunicipio());
        txtFechaFundacion.setText(beneficiado.getFecha_nacimiento().toString());

        listview_peticiones.setAdapter(new Adaptador(this,lista_peticiones));
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intentPeticion = new Intent(getApplicationContext(),PetitionActivity.class);
                intentPeticion.putExtra("Peticion",lista_peticiones.get(position));
                startActivity(intentPeticion);
            }
        };
        listview_peticiones.setOnItemClickListener(listener);
    }

    private ArrayList<Peticion> getListaPeticiones ()
    {
        ArrayList<Peticion> listItems = new ArrayList<>();
        listItems.add(new Peticion("Peticion1","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion2","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion3","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion4","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion5","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion6","Descripcion",1,1.0f, 1.0f));
        listItems.add(new Peticion("Peticion7","Descripcion",1,1.0f, 1.0f));

        return listItems;
    }
}
