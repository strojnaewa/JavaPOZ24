package Zajecia3.ZadaniaKozak;

import java.util.Scanner;

public class Zadania2Kozak4 {
 public static void main(String[] args){
//wczytuje liczby od użytkownika, sumuję je do momentu az nie bedzie wpisane 0

     Scanner czytnik=new Scanner(System.in);
     System.out.println("Wpisuj liczby do zsumowania, 0 kończy i pokaże się suma");
     int liczba=czytnik.nextInt();
     int suma=0;

     while (liczba!=0) {

         suma=suma+liczba;
         liczba=czytnik.nextInt();

     }

     System.out.println("podałeś 0, suma Twoich liczb to " + suma);

 }

}
