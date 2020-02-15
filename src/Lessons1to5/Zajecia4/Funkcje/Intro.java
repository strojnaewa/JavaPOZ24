package Zajecia4.Funkcje;

import java.sql.SQLOutput;

public class Intro {
    //funckja pobierająca dwa argumenty i zwracająca sumę
    //funkcje piszemy małymi literami i przyjęło się, że jako czasownik

    public static int dodaj(int a, int b) {
        return a + b;
    }

    //funkcja która nic nie zwraca ale wypisze zawartość tablicy
    public static void wypiszTablice(String[] tablica) {
        for (String i : tablica) {
            System.out.print(i + ", ");

        }
        System.out.print("\b");
        System.out.print("\b");

    }

    //funkcja Fibonacci
    public static int fibonacci(int n) {

        int a = 1;
        int b = 1;
        int suma = 0;

        for (int i = 2; i <= n; i++) {
            suma = a + b;
            a = b;
            b = suma;
        }


        return b;

    }

    public static void main(String[] args) {

        int pierwszaLiczba = 10;
        int drugaLiczba = 20;
        int wynik = dodaj(pierwszaLiczba, drugaLiczba);
        System.out.print(wynik);
        System.out.println();

        String[] imiona = {"Jan", "Ola", "Tomek"};
        wypiszTablice(imiona);
        System.out.println();

        int fib = fibonacci(5);
        System.out.println(fib);
    }
}
