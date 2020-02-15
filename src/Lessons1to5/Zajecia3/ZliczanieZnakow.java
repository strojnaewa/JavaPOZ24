package Zajecia3;

import java.util.Scanner;

public class ZliczanieZnakow {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj tekst do zliczenia znaków");
        String tekst=scanner.nextLine();
        //zliczanie ze spacjami
        int dlugosc=tekst.length();
        System.out.println("Tekst: "+tekst);
        System.out.println("Ilość znaków (ze spacjami)= "+dlugosc);

        // Zliczanie bez spacji
        int licznikSpacji=0;
        for(int i=0;i<dlugosc;i++){
            char znak=tekst.charAt(i);
                    if (znak==' '){
                        licznikSpacji++;
                    }

        }
                System.out.println("Ilość znaków (bez spacji) = "+(dlugosc-licznikSpacji));
            //napisa małymi literami i dużymi
        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.toUpperCase());


    }
}

