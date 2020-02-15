package Zajecia3.ZadaniaKozak;

import java.util.Scanner;

public class Zadania2Kozak {
    public static void main(String[] args) {

        //Zadanie 1
        //liczbę dodatnią pobieramy i wyświetlamy nieparzyste nie większe niż pobrana

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią");
        float liczba = czytnik.nextInt();
                while (liczba<=0) {
                    System.out.println("Błędna liczba. Podaj liczbę ponownie");
                    liczba=czytnik.nextInt();
                }

                for (int i =1;i<=liczba;i++) {
                    if ((i%2) == 1) {
                        System.out.println(i);
                    }

                    //wersja alternatywna
                    for (i=1; i<=liczba;i+=2) {
                        System.out.println(i);
                    }
                }
    }
}
