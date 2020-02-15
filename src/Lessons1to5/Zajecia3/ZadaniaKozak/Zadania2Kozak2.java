package Zajecia3.ZadaniaKozak;

import java.util.Scanner;

public class Zadania2Kozak2 {
     public static void main(String[] args) {
        //Zadanie 2
         // pobieram dwie liczby (A<B) i wyznaczam sumę ciągu A, A+1 ...B
         //Zrobić z while, do while i for

         Scanner czytnik=new Scanner(System.in);
         System.out.println("Podaj początek zakresu (A<B)");
         int a=czytnik.nextInt();
         System.out.println("Podaj koniec zakresu B>A");
         int b=czytnik.nextInt();
         while (a>b) {
             System.out.println("A nie może być większe od B. Spróbuj ponownie");
             System.out.println("Podaj początek zakresu (A<B)");
             a=czytnik.nextInt();
             System.out.println("Podaj koniec zakresu B>A");
             b=czytnik.nextInt();
         }
         int i=0;
                 int kolejna=0;
                 int suma=0;


                 System.out.println("While");
         while (i<(b-a+1)) {
             kolejna=(a+i);
             suma=suma+kolejna;
             i++;
         }
         System.out.println(suma);



         System.out.println("Do while");
        kolejna=0;
         do {
             suma=suma+kolejna;
             kolejna=(a+i);
             i++;

         } while (i<(b-a));
         System.out.println(suma);


         System.out.println("for");
         kolejna=0;
         for(i=0;i<(a-b+1);i++) {
             suma=suma+kolejna;
             kolejna=(a+i);
         }
         System.out.println(suma);

         //INACZEJ, KRÓCEJ

         suma=0;
         for ( i =a;i<=b;i++) {
             suma=suma+i;
         }

         System.out.println(suma);
    }
}
