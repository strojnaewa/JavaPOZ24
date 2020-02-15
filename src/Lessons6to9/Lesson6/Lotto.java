package Lessons6to9.Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String args[]) {

        int[] tab = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.println("Podaj liczbę");
            int a = scanner.nextInt();
            for (int j = 0; j <= 5; j++) {
                if (a == tab[j]) {
                    System.out.println("Liczby się powtarzają!");
                    i--;
                    break;
                } else {
                    tab[j] = a;
                }
            }
        }
        Random liczbaLos = new Random();

        int[] los = new int[6];
        for (int i = 0; i < 6; i++) {
            int losA = liczbaLos.nextInt(48) + 1;
            System.out.print(losA+",");
            for (int j = 0; j <= 5; j++) {
                if (losA == los[j]) {
                    System.out.println("Liczby się powtarzają!");
                    i--;
                    break;
                } else {
                    los[j] = losA;
                }
            }

        }
        int licznik=0;
        for (int i=0;i<6;i++){
            for(int j=0;j<6;i++){

                if(tab[i]==tab[j]){
                    licznik++;

                }

            }

        }

        System.out.println("wystąpienia "+licznik);
    }
}
