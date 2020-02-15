package Zajecia1;

import java.util.Scanner;

public class CelsjuszFr {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double celsjusz = 0;
        double fahrenheit = 0;

        System.out.println("Podaj temperaturę w stopniach Celsjusza:");
        celsjusz = czytnik.nextDouble();
        System.out.println("To będzie " + ((celsjusz * 1.8) + 32) + " stopni Fahrenheita");

        System.out.println("A teraz podaj temperaturę w stopniach Fahrenheita");
        fahrenheit = czytnik.nextDouble();
        System.out.println("To będzie " + ((fahrenheit - 32) / 1.8) + " stopni Celsjusza.");


    }
}
