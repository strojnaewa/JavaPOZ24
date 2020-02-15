package Zajecia1;

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args ){
        Scanner czytnik = new Scanner(System.in);

        float masa=0;
        float wzrost=0;

        System.out.println("Podaj swoją wagę w kg:");
        masa=czytnik.nextFloat();
        System.out.println("Podaj swój wzrost w cm:");
        wzrost=czytnik.nextFloat();

        wzrost=wzrost/100;



        System.out.println("Twoje BMI wynosi:"+(masa/Math.pow(wzrost,2)));



    }
}
