package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Intent i;
    TextView listaBrani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i= getIntent(); //ottengo l'intent che ha avviato la seconda activity
        listaBrani= (TextView) findViewById(R.id.listaBrani);
        String valorericevuto= i.getStringExtra("brano"); //ottengo i dati che ho passato dall'altra activity
        Toast.makeText(getApplicationContext(), valorericevuto, Toast.LENGTH_LONG).show();
    }
}