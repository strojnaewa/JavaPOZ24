package Lessons6to9.Lesson8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.TimeZone;

public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime now= java.time.LocalTime.now();
        System.out.println(now);

        java.time.LocalTime meeting= java.time.LocalTime.of(11, 30);
        java.time.LocalTime meetingFinish=meeting.plusHours(3);

        System.out.println(meetingFinish.isAfter(meeting));

        String[] ids= TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));

        ZonedDateTime data=ZonedDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst=data.format(formatter);
        System.out.println(tekst);
    }
}
