package Zajecia4.Funkcje;

import java.util.Scanner;

public class Kozak4z5 {

    public static void main (String[] args ){

        System.out.println("Podaj działanie - sprawdzę czy nawiasy są poprawnie sparowane");
        Scanner scanner = new Scanner(System.in);
        String slowo= scanner.nextLine();
        int licznik=0;

        for (int i=0; i<slowo.length();i++){

            if (slowo.substring(i, i+1).equals("(")) {
                licznik++; }
                else if (slowo.substring(i, i+1).equals(")")) {
                    licznik--;
                }

            if (licznik<0) {

                break;
            }
        }
        if (licznik<0){
            System.out.println("Nawiasy nie są zgodne!");
        } else {
            System.out.println("Nawiasy są ok!");
        }
    }
}
