package Lessons6to9.Lesson8;

import java.util.Arrays;

public class DivideText {
    public static void main(String[] args) {


        //Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.

        String text= "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.";
        String [] array;
        array = text.split("[ .,:]+");
        System.out.println(array.length+"|"+ Arrays.toString(array) );


        System.out.println(text.replaceAll("a", "@"));

    }
}
