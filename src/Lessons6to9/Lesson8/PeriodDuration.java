package Lessons6to9.Lesson8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {
    public static void main(String[] args) {
        LocalDateTime mumBirthday=LocalDateTime.of(1973, Month.JUNE,15,10,34);
        LocalDateTime myBirthday=LocalDateTime.of(1993,Month.JANUARY,4,9,22);

        Duration duration = Duration.between(mumBirthday, myBirthday);
        System.out.println(duration);

        Period period= Period.between(mumBirthday.toLocalDate(), myBirthday.toLocalDate());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


        long years= ChronoUnit.YEARS.between(mumBirthday, myBirthday);
        System.out.println(years);





    }
}
