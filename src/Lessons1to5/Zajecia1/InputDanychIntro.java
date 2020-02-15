package Zajecia1;

import java.util.Scanner;

public class InputDanychIntro {
    public static void main(String[] args) {

        //Aby czytać dane od użytkownika tworzymy obiekt typu scanner
        //wg. następującej składni
        Scanner czytnik = new Scanner(System.in);

        //Czytnik to zmienna / obiekt typu scanner
        //wiek to zmienna typu int
        //w momencie pisania kodu nie wiemy ile użytkownik ma lat (to jest dobra praktyka żeby zerować)
        String imie;
        double wiek = 0;
        System.out.println("Podaj swoje imię: ");
        //czytnik.next pozwala na odczytanie pierszego słowa
        imie = czytnik.nextLine();
        System.out.println("Powiedz ile masz lat: ");
        wiek = czytnik.nextDouble();
        System.out.println("Witaj " + imie + ". Masz " + wiek + " lat.");


    }
}
