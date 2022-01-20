package com.example.voltify;

import android.content.Intent;

import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani; //ogni oggetto della classe Brano sarà un elemento dell'arraylist
    public Gestorebrani(){ //costruttore gestorebrani
        listaBrani= new ArrayList<Brano>(); //istanzia l'arraylist
    }

    public void addBrano(String titolo, int durata, String autore, String genere){

        Brano br= new Brano(titolo, durata, autore, genere);
        listaBrani.add(br); //aggiungo all'arraylist il brano

    }

    public String visualizzaBrani(){ //questo metodo verrà richiamato al click del secondo bottone

        StringBuilder sbBrani= new StringBuilder();
        for(Brano brc : listaBrani){ //per ogni lista brani creo un oggetto di tipo brano
            sbBrani.append(brc.getTitolo().toString());
            sbBrani.append(brc.getAutore().toString());
            sbBrani.append(brc.getGenere().toString());
            sbBrani.append("\n");
        }
        return sbBrani.toString();

    }
}
