package Lessons6to9.Lesson8.ExcercisesNtuEdu;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of items:");
        int arrayLength=scanner.nextInt();
        int[] array=new int[arrayLength];
        System.out.println("Enter value of items");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
            }

        for(int i=0; i<array.length;i++){
            System.out.println(i+":"+"*".repeat(array[i])+"("+array[i]+")");
        }

    }
}
