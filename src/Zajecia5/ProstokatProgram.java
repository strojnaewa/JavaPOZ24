package Zajecia5;

import java.util.Scanner;

/*Napisz program do obliczania pola prostokąta.
W tym celu stwórz klasę prostokąt i dodaj jej pola bokA
oraz bokB. Utwórz konstruktor dla tych parametrów
(tylko jeden, dwu parametrowy) oraz dodaj metody obliczPole
 oraz obliczObwod
        Utwórz klasę ProstokatProgram,
        w której utworzysz 3 prostokąty i obliczysz ich pola i
        obwody. Wymiary prostokątów powinny pochodzić od użytkownika
         (z klawiatury)*/
public class ProstokatProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok A");
        int bokA = scanner.nextInt();
        System.out.println("Podaj bok B");
        int bokB = scanner.nextInt();
        Prostokat prostokat = new Prostokat(bokA, bokB);
        System.out.println("Pole prostokąta to " + prostokat.pole());
        System.out.println("obwód prostokąta to " + prostokat.obwod());
    prostokat.setBokA(5);
    prostokat.getBokA();

    }
}
