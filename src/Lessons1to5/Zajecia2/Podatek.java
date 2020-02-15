package Zajecia2;

import java.util.Scanner;

public class Podatek {
    public static void main (String[] args){

        double dochod;
        Scanner czytnik = new Scanner (System.in);
       final double PROG = 85528;


        System.out.println("Podaj wartość swojego dochodu a powiem Ci jaki podatek zapłacisz");
        dochod=czytnik.nextDouble();

        if (dochod<=556.02) {
            System.out.println("Nie płacisz podatku");
        } else if  (dochod<= PROG) {
            System.out.println("Podatek do zapłacenia to "+((dochod*0.18 )- 556.02)+" zł");
        } else {
            System.out.println("Podatek do zapłacenia to "+((14839.02+(dochod-PROG)*0.32))+" zł");
        }

    }
}
