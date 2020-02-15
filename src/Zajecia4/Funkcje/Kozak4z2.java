package Zajecia4.Funkcje;

import java.util.Scanner;

public class Kozak4z2 {

    public static String stringWspak(String slowo) {
        int dlugosc = slowo.length();
        String wspak="";
        for (int i = (dlugosc-1); i>=0 ; i--) {
            wspak=wspak+slowo.charAt(i);
        }

        return wspak;
    }

    public static void main(String[] args) {


        System.out.println("Podaj słowo, a podam Ci je napisane wspak");
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();
        System.out.println(stringWspak(slowo));


    }


}
