package Lessons6to9.Lesson8.ExcercisesNtuEdu;

import java.util.Random;

public class CountNumbers {

    public static void main(String[] args) {
        int [] randomNumbers=new int[100];
        int [] count = new int[31];
        Random random=new Random();
        for (int i=0; i<randomNumbers.length;i++){
            randomNumbers[i]=random.nextInt(20)+10;
            System.out.print(randomNumbers[i]+", ");
            count[randomNumbers[i]]++;
            }
        System.out.println();
        for (int i=10; i<=30; i++){
            System.out.println(i+":"+"*".repeat(count[i])+"("+count[i]+")");
        }
    }
}


