package com.enset;

import com.enset.util.Utilitaire;
import com.enset.util.UtilitaireImpl1;
import com.enset.util.UtilitaireImpl2;

public class Main {
    public static void main(String[] args) {
        Utilitaire utilitaire = new UtilitaireImpl1();
        System.out.println(utilitaire.compute("test1"));
        utilitaire = new UtilitaireImpl2();
        System.out.println(utilitaire.compute("test1"));

    }
}