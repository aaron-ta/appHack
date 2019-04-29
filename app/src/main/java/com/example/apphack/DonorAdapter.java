package com.example.apphack;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DonorAdapter extends ArrayAdapter<DonorInfo>{
    Context context;
    int resource;
    ArrayList<DonorInfo> donors = null;

    public DonorAdapter(@NonNull Context context, int resource, ArrayList<DonorInfo> donors) {
        super(context, resource, donors);
        this.context = context;
        this.resource = resource;
        this.donors = donors;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DonorInfo donor = donors.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_view_donor, parent, false);
        }

        TextView userTextView = (TextView)convertView.findViewById(R.id.userTextView);
        ImageView bgImageView = (ImageView)convertView.findViewById(R.id.bgImageView);
        ImageView iconImageView = (ImageView)convertView.findViewById(R.id.iconImageView);

        userTextView.setText(donor.username + " ha donado!");
        userTextView.setTextColor(Color.parseColor("#000000"));
        iconImageView.setImageResource(donor.imageId);
        bgImageView.setImageResource(R.drawable.layer_1);

        return convertView;
    }
}