package com.example.voltify;

import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani; //ogni oggetto della classe Brano sarà un elemento dell'arraylist
    public Gestorebrani(){ //costruttore gestorebrani
        listaBrani= new ArrayList<Brano>(); //istanzia l'arraylist
    }

    public void addBrano(String titolo, int durata, String autore, String genere){

        Brano br= new Brano(titolo, durata, autore, genere); //creo un oggetto di tipo Brano
        listaBrani.add(br); //aggiungo all'arraylist il brano

    }

    public String visualizzaBrani(){ //questo metodo verrà richiamato al click del secondo bottone

        StringBuilder sbBrani= new StringBuilder(); //istanza string builder
        for(Brano brc : listaBrani){
            sbBrani.append(brc.getTitolo().toString()); //concateno titolo
            sbBrani.append(brc.getAutore().toString()); //concateno autore
            sbBrani.append(brc.getGenere().toString()); //concateno genere
            sbBrani.append(brc.getDurata().toString()); //concateno genere
            sbBrani.append("\n");
        }
        return sbBrani.toString();

    }
}
