package Zajecia1;

public class OperatoryPorownania {
    public static void main (String[] args){
        int wiek=22;
        //wersja 1
        boolean czyPelnoletni = wiek>=18;

        System.out.println("Czy wiek wiekszy równy 18? "+czyPelnoletni);

        //wersja 2
        System.out.println("Czy wiek większy równy 18? "+(wiek>=18));

        //różne
        System.out.println("Czy wiek jest różny od 20? "+(wiek!=20));




    }
}
