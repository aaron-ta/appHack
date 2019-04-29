package com.example.apphack;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context contexto;
    private ArrayList<Peticion> listItems;

    public Adaptador(Context contexto, ArrayList<Peticion> listItems) {
        this.contexto = contexto;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Peticion item = (Peticion) getItem(position);
        convertView = LayoutInflater.from(contexto).inflate(R.layout.elemento_lista,null);
        TextView txtTitulo = (TextView) convertView.findViewById(R.id.txtTitulo);
        TextView txtDescripcion = (TextView) convertView.findViewById(R.id.txtDescripcion);
        ImageView image = (ImageView) convertView.findViewById(R.id.ivImagen);
        image.setImageResource(R.drawable.user_ico);
        txtTitulo.setText(item.getTitulo());
        txtDescripcion.setText(item.getDescripcion());
        return convertView;
    }
}
