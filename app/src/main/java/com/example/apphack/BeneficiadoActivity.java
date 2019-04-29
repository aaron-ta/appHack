package com.example.apphack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BeneficiadoActivity extends AppCompatActivity {

    private Beneficiado beneficiado;
    private ArrayList<Peticion> lista_peticiones;
    private TextView txtNombre,txtTelfono,txtCorreo,txtEstado_Municipio,txtFechaFundacion;
    private ImageView imgBeneficiado;
    private ListView listaview_peticiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiado);
        beneficiado = (Beneficiado) getIntent().getSerializableExtra("Beneficiado");
        lista_peticiones = (ArrayList<Peticion>) getIntent().getSerializableExtra("lista_peticion");

        txtNombre = (TextView) findViewById(R.id.txtNombre_clinica);
        txtTelfono = (TextView) findViewById(R.id.txtTelefono);
        txtCorreo = (TextView) findViewById(R.id.txtCorreo);
        txtEstado_Municipio = (TextView) findViewById(R.id.txtEstado_Municipio);
        txtFechaFundacion = (TextView) findViewById(R.id.txtFecha);

        txtNombre.setText(beneficiado.getNombre_clinica());
        txtTelfono.setText(beneficiado.getTelefono());
        txtCorreo.setText(beneficiado.getCorreo());
        txtEstado_Municipio.setText(beneficiado.getEstado()+", "+beneficiado.getMunicipio());



    }


}
