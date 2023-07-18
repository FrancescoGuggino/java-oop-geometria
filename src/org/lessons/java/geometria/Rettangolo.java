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

    void disegna() {

        int base=this.base;
        int altezza=this.altezza;

        for (int i = 0; i < base -1; i++) {
            System.out.print("o");
        }


        for (int i = 0; i < altezza -1; i++) {
            System.out.println("o");
        }
        for (int j = base; j < base-1; j++) {
            System.out.println("i");
        }


        for (int i = 0; i < base; i++) {
            System.out.print("o");

        }

    }

}
