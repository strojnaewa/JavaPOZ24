package Lessons6to9.Lesson6;

import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę poziomów choinki:");
        int poziomy = (Integer.valueOf(scanner.nextLine()));

        //choinka nr 1

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();
        //choinka nr2 - jedna pętla


        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j <= poziomy - 1 - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        //choinka nr3

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy; j++) {
                if (j >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //choinka nr 4



                for (int i = 0; i < poziomy; i++) {
                    for (int j = 0; j<poziomy; j++) {
                        if ((i + j) > poziomy) {
                            System.out.print("# ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

            }
        }





