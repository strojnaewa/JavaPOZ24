package Zajecia2;

import java.util.Scanner;

public class Raty {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double kwota;
        int raty;

        System.out.println("Podaj cenę zakupionego towaru");
        kwota = czytnik.nextDouble();

        if (kwota < 100 || kwota>10000) {
            System.out.println("Dla zakupów poniżej 100 zł i powyżej 10 000 zł nie są udzielane raty. Spróbuj ponownie");
            kwota = czytnik.nextDouble();
        }


        System.out.println("Podaj liczbę rat (od 6-48)");
        raty = czytnik.nextInt();

        if (raty < 6 || raty > 48) {
            System.out.println("No przecież podałam ile może być rat... Spróbuj ponownie");
            raty = czytnik.nextInt();
        }

        if (raty <= 12) {
            System.out.println("Raty wyniosą " + ((kwota * 0.025/12) +(kwota/raty) )+ " zł");
        } else if (raty <= 24) {
            System.out.println("Raty wyniosą " + ((kwota * 0.05/12) +(kwota/raty)) + " zł");
        } else {
            System.out.println("Raty wyniosą " + ((kwota * 0.1/12) +(kwota/raty))+" zł");
        }

    }

}





