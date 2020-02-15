package Zajecia4.Funkcje;

import java.util.Scanner;

public class Kozak4z3 {

    public static boolean palindromTest(String slowo) {
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                return false;
            }


        }
        return true;
    }
        public static void main (String[] args ){

            System.out.println("Podaj słowo, sprawdzę czy jest palindromem");
            Scanner scanner = new Scanner(System.in);
            String slowo = scanner.nextLine();
            System.out.println(palindromTest(slowo));


        }

    }
