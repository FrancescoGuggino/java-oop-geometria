package org.lessons.java.geometria;

public class Rettangolo {

    // CAMPI
    int base;
    int altezza;

    // COSTRUTTORI

    Rettangolo(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }
    // METODI

    int calcoloArea () {
        int calcoloArea = base * altezza;

        return calcoloArea;
    }

    int calcoloPerimetro () {
        int calcoloPerimetro = base * 2 + altezza * 2;

        return calcoloPerimetro;
    }

}
