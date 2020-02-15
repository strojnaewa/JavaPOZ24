package Zajecia3.ZadaniaKozak;

import java.util.Scanner;

public class Zadania2Kozak3 {
    static public void main(String[] args){

        Scanner czytnik=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=czytnik.nextInt();

        for(int i=1;Math.pow(2,i)<=liczba;i++) {
            System.out.println(Math.pow(2,i));
        }

        //rozwiązanie 2
        System.out.println("\n2 rozwiązanie");
        for (int i=1; i<=liczba; i=i*2) {
            System.out.println(i);
        }


    }
}
