package Zajecia2;

import java.util.Scanner;

public class BMIIfElse {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        float masa = 0;
        float wzrost = 0;

        System.out.println("Podaj swoją wagę w kg:");
        masa = czytnik.nextFloat();
        System.out.println("Podaj swój wzrost w cm:");
        wzrost = czytnik.nextFloat();

        wzrost = wzrost / 100;
        double bmi = (masa / Math.pow(wzrost, 2));

        System.out.println("Twoje BMI wynosi " + bmi);

        if (bmi < 18.5) {
            System.out.println("Masz za niskie BMI - niedowaga");
        } else if (bmi < 25) {
            System.out.println("Twoja waga jest prawidłowa");
        } else if (bmi < 30) {
            System.out.println("Masz nadwagę");
        } else {
            System.out.println("jesteś otyły");
        }


    }
}
