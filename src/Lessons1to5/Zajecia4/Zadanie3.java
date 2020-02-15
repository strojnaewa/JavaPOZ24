package Zajecia4;

import java.util.Random;

public class Zadanie3 {

    public static void main(String[] args) {
        int macierz[][] = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = random.nextInt(10);
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }


        //minimum i maximum
        int[] mintab = new int[5];
        int[] maxtab = new int[5];

        for (int j = 0; j < 5; j++) {
            int min = macierz[0][j];    //zeruję max przed każdą nową kolumną
            int max = macierz[0][j];
            for (int i = 0; i < 5; i++) {
                if (max < macierz[i][j]) {    //wyszukuję max po całej kolumnie (w każdym wierszu)
                    max = macierz[i][j];
                }
                if (min > macierz[i][j]) {
                    min = macierz[i][j];

                }

            }
            mintab[j] = min;
            maxtab[j] = max;

        }
        System.out.println("Maximum z każdej kolumny wynosi ");
        for (int i = 0; i < 5; i++) {
            System.out.print(maxtab[i] + ", ");
        }
        System.out.println();
        System.out.println("Minimum z każdej kolumny wynosi ");


        for (int i = 0; i < 5; i++) {
            System.out.print(mintab[i] + ", ");

        }

    }


}

