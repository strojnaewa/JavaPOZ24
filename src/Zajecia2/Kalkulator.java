package Zajecia2;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        float a;
        float b;
        String dzialanie;
        String koniec;

        System.out.println("No dzień dobry, to jest taki super kalkulator");
        System.out.println("Podaj pierwszą liczbę w działaniu");
        a = czytnik.nextFloat();
        System.out.println("Podaj symbol działania (");
        System.out.println("+  dodawanie");
        System.out.println("-  odejmowanie");
        System.out.println("* mnożenie");
        System.out.println("/ dzielenie");

        dzialanie = czytnik.next();

        if (dzialanie.equals("+") || dzialanie.equals("-") || dzialanie.equals("*") || dzialanie.equals("/")) {
            System.out.println("Podaj drugą liczbę:");
            b = czytnik.nextFloat();

            if (b == 0 && dzialanie.equals("/")) {
                System.out.println("Pamiętaj cholero, nie dziel przez zero!");

            } else if (dzialanie.equals("+")) {
                System.out.println("Wynik to " + (a + b));
            } else if (dzialanie.equals("-")) {
                System.out.println("Wynik to " + (a - b));
            } else if (dzialanie.equals("*")) {
                System.out.println("Wynik to " + (a * b));
            } else {
                System.out.println("Wynik to " + (a / b));
            }
        } else {
            System.out.println("Nie ma takiego działania! ");

        }
System.out.println("Wciścnij dowolny znak i zatwierdź enterem aby zakończyć");
koniec=czytnik.nextLine();

    }


}
