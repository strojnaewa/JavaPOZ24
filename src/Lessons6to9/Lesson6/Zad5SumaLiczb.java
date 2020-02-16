package Lessons6to9.Lesson6;

import java.util.Scanner;

public class Zad5SumaLiczb {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, podam sumę cyfr które je tworzą  ");

        Scanner scanner=new Scanner(System.in);
        String liczba=scanner.nextLine();

        int suma=0;

        for(int i=0;liczba.length()>i;i++){

            char c=liczba.charAt(i);

            suma+= Integer.valueOf(String.valueOf(c));


        }
        System.out.println(suma);





    }
}
