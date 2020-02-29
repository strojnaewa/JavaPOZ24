package Lessons6to9.Lesson8;

import java.time.Duration;
import java.time.Instant;

public class DateInstant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("instant"+instant);

        Instant instant1=Instant.parse("2019-11-25T09:28:10.179Z");
        instant1=instant1.minus(Duration.ofDays(5));
        System.out.println("instant1"+instant1);

        Instant instant2=instant1.plus(Duration.ofHours(8));
        System.out.println("instant2"+instant2);

        boolean check = instant1.isBefore(instant2);
        System.out.println(check);
    }
}
