package Zajecia2;

public class LoopsIntro {
    public static void main(String[] args) {

        int i=0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
//to wyżej można zapisać jako Ststem.out.println(i++)

        //post vs preinrtementacja
        int liczba=0;
                System.out.println(liczba++);
        System.out.println(liczba);

        liczba=0;
        System.out.println(++liczba);
        System.out.println(liczba);

        //do...while
        i=0;
        do {
            System.out.print(i++ + ", ");
        } while (i<10);




    }
}
