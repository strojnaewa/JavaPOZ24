package Lessons6to9.Lesson8;

import java.time.LocalDate;
import java.time.Month;

public class DateLocalDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate specialDay=LocalDate.of(2022,3,11);
        LocalDate specialDay2=LocalDate.of(2022, Month.FEBRUARY,15);

        String myBirthday="1993-01-04";
        LocalDate myBirthdayLocalDate=LocalDate.parse(myBirthday);

        LocalDate tomorrow=LocalDate.now().plusDays(1);

        System.out.println(specialDay);
        System.out.println(specialDay2);
        System.out.println(tomorrow);

    }
}
