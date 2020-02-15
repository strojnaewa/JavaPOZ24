package Zajecia3;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        //podaj n-ty wyraz ciagu fibonacciego

        Scanner sc=new Scanner(System.in);
        System.out.println("Który element ciągu Fibonacciego chcesz uzyskać?");

        int n=sc.nextInt();
        int a=1;
        int b=1;
        int suma=0;

        for(int i=2;i<=n;i++) {
            suma=a+b;
            a=b;
            b=suma;
        }


        System.out.println(b);

    }
}
