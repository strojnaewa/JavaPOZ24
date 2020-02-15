package Zajecia3.arrays;

import java.net.SocketOption;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        //na razie nie losujemy tylko wpisujemy z ręki
        //http://www.jkozak.pl/przedmioty/java/zadania3.pdf


        //tworzymy tablicę
        int[] liczby = new int[10];
        liczby[0] = 25;
        liczby[4]=100;

        //pobieramy dane z tablicy
        int wartosc = liczby[4];
        System.out.println(wartosc);
        System.out.println(liczby[0]);

        //sprawdzanie długości tablicy
        int dlugoscTablicy=liczby.length;
        System.out.println("tablica ma długość "+dlugoscTablicy);

        //wyświetlenie elementów tablicy
        for (int i=0;i<liczby.length;i++) {

            System.out.println(liczby[i]);
        }

        //Dynamiczne tworzenie tablicy
        System.out.println("Podaj rozmiar tablicy");
        Scanner scanner = new Scanner (System.in);
        int rozmiar = scanner.nextInt();
        int[] dynamicznaTablica= new int[rozmiar];

        System.out.println("Rozmiar dynamicznej tablicy "+dynamicznaTablica.length);


    }

}
