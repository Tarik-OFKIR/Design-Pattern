package com.enset.util;


public class UtilitaireImpl1 extends Utilitaire {
    @Override
    protected double filtre1(String str) {
        return Math.pow(str.length(),4);
    }

    @Override
    protected double filtre2(double x) {
        return x*2;
    }
}
