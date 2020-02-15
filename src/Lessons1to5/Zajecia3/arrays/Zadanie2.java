package Zajecia3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main (String[] args){


        int[] wystapienia=new int[11];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj ile liczb wylosować");
        int rozmiar = scanner.nextInt();
        int[] liczby=new int[rozmiar];
        Random random = new Random();

        System.out.println("Wylosowane liczby to:");
        for (int i=0;i<liczby.length;i++){
            liczby[i]= random.nextInt(11);
            wystapienia[liczby[i]]++;
            System.out.print(liczby[i]+", ");
        }

        System.out.println("\n Liczba wystąpień każdej z liczb po losowaniu "+rozmiar+ " liczb z zakresu 0-10:");
        for (int i=0;i<10;i++){
            System.out.println("Wystąpienie liczby "+i+" - "+wystapienia[i]);
        }









    }
}
