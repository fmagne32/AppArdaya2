package com.fmagne.ardayasrl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Arrays;

public class ActividadUno extends AppCompatActivity {
    //SearchableSpinner spcountries;
    ArrayList arraycountires;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_uno);/*
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] letra = {"A","B","C","D","E"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)
            {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });*/


        /*spcountries=(SearchableSpinner) findViewById(R.id.spcountries);
        arraycountires=new ArrayList<String>(Arrays.asList("India", "Pakistan", "US", "China", "UK", "Itely", "France"));
        adapter=new ArrayAdapter(ActividadUno.this,android.R.layout.simple_list_item_1,arraycountires);
        spcountries.setAdapter(adapter);
        spcountries.setTitle("Select Countries");
        spcountries.setPositiveButton("Done");*/
    }
}
