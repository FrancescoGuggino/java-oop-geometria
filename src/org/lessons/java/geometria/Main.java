package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //costruzione elemento base
        System.out.println("Quanti centimetri è la base del rettangolo: ");
        int baseInput = scan.nextInt();

        //elemento altezza
        System.out.println("Quanti centimetri è l'altezza del rettangolo: ");
        int altezzaInput = scan.nextInt();

        //con questi dati creo oggetto rettangolo
        Rettangolo rettangolo = new Rettangolo(baseInput, altezzaInput);

        System.out.println("La base del rettangolo è: " + baseInput + " cm");
        System.out.println("L'altezza del rettangolo è: " + altezzaInput + " cm");
        System.out.println("L'area del tuo rettangolo è: " + rettangolo.calcoloArea() + " cm");
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcoloPerimetro() + " cm");

        rettangolo.disegna();


        scan.close();
    }
}
