package Zajecia2;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);


        int wiek = czytnik.nextInt();

        if (wiek > 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }

    }
}
