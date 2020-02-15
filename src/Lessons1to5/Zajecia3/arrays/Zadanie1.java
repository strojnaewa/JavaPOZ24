package Zajecia3.arrays;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak duża ma być tablica");
        int rozmiar = scanner.nextInt();

        int[] liczby = new int[rozmiar];
        System.out.println("podaj liczby do tablicy");
        for (int i = 0; i < rozmiar; i++) {
            System.out.println("liczby[" + i + "]");
            liczby[i] = scanner.nextInt();
        }
        System.out.println("Twoja tablica zawiera następujące elementy:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.print(liczby[i] + ", ");
        }
        int max = liczby[0];
        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] > max) {
                max = liczby[i];
            }

        }

        //Można inaczej
        for(int i=0;i<liczby.length;i++){
            if(max>liczby[i]) {
                //nic nie robimy, nie wchodzimy w pętlę, jedziemy dalej
                //wracamy do początku, nic co poniżej się nie wykona
                continue;
            }
            //skoro nie weszlismy w if (liczba>max to zwiększamy max
            max=liczby[i];
        }

        System.out.println("");
        System.out.println("Max to " + max);


        int min = liczby[0];
        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] < min) {
                min = liczby[i];
            }

        }
        System.out.println("Min to " + min);

        float suma = 0;
        for (int i = 0; i < rozmiar; i++) {
            suma = suma + liczby[i];
        }
        float avg = suma / liczby.length;
        System.out.println("Srednia wynosi " + avg);

        //mniejsze i wieksze od średniej

        int mniej = 0;
        int wiecej = 0;

        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] > avg) {
                wiecej++;
            } else {
                mniej++;
            }
        }

        System.out.println("Większych od średniej jest " + wiecej + " elementów");
        System.out.println("Mniejszych od średniej jest " + mniej + " elementów");

        //wypisanie elementów odwrotnie

        System.out.println("Wypisanie elementów odwrotnie");
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.print(liczby[i] + ", ");
        }

    }
}
