package Zajecia2;

import java.util.function.ToDoubleBiFunction;

public class PetleZadania {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("Zadanie2");
        while (i < 500) {
            if (i % 7 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Zadanie3");
        int suma = 0;
        for (i = 1; i <= 100; i++) {
            suma = suma + i;
            //suma+=i

        }
        System.out.println("suma: " + suma);

        System.out.println("Zadanie4");




        System.out.println("zadanie5");
        i=1;
        suma=0;
        do {
            if(i%2==1) {
                suma=suma+i;}
                        i++;
            } while (i<=100);

        System.out.println("Suma nieparzystych wynosi "+suma);

        System.out.println("wypisane 1-100");
        for (i=99;i>0;i-=2){
            System.out.print(i+", ");
        }




    }
}
