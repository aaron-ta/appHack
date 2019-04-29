package com.example.apphack;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.Toast;


public class PetitionActivity extends AppCompatActivity {
    //public String[] keys = new String[3];
    public ArrayList<DonorInfo> donors = new ArrayList<>();
    //public Peticion peticion = (Peticion) getIntent().getSerializableExtra("Peticion");
    public Peticion peticion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);
        peticion = (Peticion) getIntent().getSerializableExtra("Peticion");

        Context context = getApplicationContext();

        String text = String.valueOf(peticion.getDescripcion());
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(adapter.getCount()-1);

        //asignar cada componente del layout
        TextView peopleTextView = findViewById(R.id.peopleTextView);
        TextView amountTextView = findViewById(R.id.amountTextView);
        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView iconImageView = findViewById(R.id.iconImageView);
        ProgressBar pb = findViewById(R.id.progressBar);


        //obtener valores para componentes del layout
        titleTextView.setText(peticion.getTitulo());
        peopleTextView.setText("Este proyecto ayuda a " +peticion.getNum_personas() + " personas");
        amountTextView.setText(peticion.getDinero_pRecaudar()+" MXN recaudados de " + peticion.getDinero_tRecaudar() + " MXN");
        int progress = (int) (1/(peticion.getDinero_pRecaudar() / peticion.getDinero_tRecaudar()));
        pb.setProgress((progress*100));

        //dummy text para donadores
        DonorInfo donor1 = new DonorInfo("Leonardo", R.drawable.logo);
        donors.add(donor1);

        DonorInfo donor2 = new DonorInfo("Miguel Angel", R.drawable.logo);
        donors.add(donor2);

        DonorInfo donor3 = new DonorInfo("Rafael", R.drawable.logo);
        donors.add(donor3);
        actualizar();

        DonorInfo donor4 = new DonorInfo("Donatello", R.drawable.logo);
        donors.add(donor4);
        actualizar();
    }

    public void actualizar(){
        setContentView(R.layout.activity_petition);

        final ListView listView = (ListView)findViewById(R.id.listViewIt);

        DonorAdapter adapter = new DonorAdapter(getApplicationContext(),R.layout.row_view_donor, donors);

        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                //callListing( position);
            }
        };
        listView.setOnItemClickListener(listener);
    }

}
