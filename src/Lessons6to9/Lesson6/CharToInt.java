package Lessons6to9.Lesson6;

public class CharToInt {

    public static void main(String[] args) {

        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('b'));
        System.out.println(Character.getNumericValue('c'));
        System.out.println(Character.getNumericValue('e'));
        System.out.println(Character.getNumericValue('E'));

String tekst="AaBbCc";
for(int i=0;i<tekst.length();i++){
    int kod=tekst.charAt(i);
    System.out.println(kod);


}


    }
}
