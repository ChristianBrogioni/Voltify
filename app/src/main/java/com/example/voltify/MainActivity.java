package com.example.voltify;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Button aggiungi;
Button visualizza;
EditText titolo;
EditText autore;
EditText durata;
Gestorebrani gb;
Spinner genere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aggiungi= (Button) findViewById(R.id.aggiungi);
        titolo= (EditText) findViewById(R.id.titolo);
        autore= (EditText) findViewById(R.id.autore);
        durata= (EditText) findViewById(R.id.durata);
        genere= (Spinner) findViewById(R.id.genere);
        gb= new Gestorebrani(); //istanza gestore brani

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gb.addBrano(titolo.getText().toString(), Integer.getInteger(durata.getText().toString()), autore.getText().toString(), genere.getSelectedItem().toString()); //ottengo il contenuto dell'edit text e lo trasformo in stringa


            }
        });
    }




}