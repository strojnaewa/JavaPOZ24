package Zajecia4.Funkcje;

import java.util.Scanner;

public class Kozak4z1 {
    public static int wystapienieOstatniejLitery(String slowo) {
        char ostatnia = slowo.charAt(slowo.length() - 1);
        int licznik = 0;
        slowo=slowo.toLowerCase();
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i) == ostatnia) {
                licznik++;
            }

        }

        return licznik;


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String slowo = scanner.nextLine();
        System.out.println(wystapienieOstatniejLitery(slowo));
    }
}
