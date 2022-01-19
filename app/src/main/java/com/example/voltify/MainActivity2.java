package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Intent i;
    ListView listaBrani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i= getIntent();
        listaBrani= (ListView)findViewById(R.id.listaBrani);
        String valorericevuto= i.getStringExtra("autore");
        Toast.makeText(getApplicationContext(), valorericevuto, Toast.LENGTH_LONG).show();
    }
}