package Lessons6to9.Lesson8;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj datę w formacie rrrr-mm-dd");
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data=LocalDate.parse(scanner.nextLine(),formatter2);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");

       String tekst=data.format(formatter);
        System.out.println(tekst);
    }
}
