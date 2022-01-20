package com.example.voltify;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button aggiungi;
Button visualizza;
EditText titolo;
EditText autore;
EditText durata;
Gestorebrani gb;
Spinner genere;
String[] elencoGeneri={"Trap","Pop","Hip Hop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualizza= (Button) findViewById(R.id.visualizza);
        aggiungi= (Button) findViewById(R.id.aggiungi);
        titolo= (EditText) findViewById(R.id.titolo);
        autore= (EditText) findViewById(R.id.autore);
        durata= (EditText) findViewById(R.id.durata);
        genere= (Spinner) findViewById(R.id.genere); //estraggo la view con id "genere" dal mio xml
        gb= new Gestorebrani(); //istanza gestore brani

        ArrayAdapter<String> spGen= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);//associo lo spinner all'array utilizzando l'array adapter. L'array adapter fa da ponte
        genere.setAdapter(spGen);

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo= genere.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, testo, Toast.LENGTH_LONG).show();
                gb.addBrano(titolo.getText().toString(), Integer.getInteger(durata.getText().toString()), autore.getText().toString(), genere.getSelectedItem().toString()); //ottengo il contenuto dell'edit text e lo trasformo in stringa
            }
        });

        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("autore", autore.getText().toString());
                startActivity(i);

            }
        });
    }




}