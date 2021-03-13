package Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.*;

public class DateTime {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:ss");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:ss, dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.print("Rabotayem c " + ldt.format(dtf1));
            ldt = ldt.plus(p);
            System.out.println(" Do " + ldt.format(dtf1));
            System.out.print("Odikhayem c " + ldt.format(dtf2));
            ldt = ldt.plus(d);
            System.out.println(" Do: " + ldt.format(dtf2));
        }
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime();
        LocalDateTime ldtStart = LocalDateTime.of(2021, 3, 11, 18, 20);
        LocalDateTime ldtEnd = LocalDateTime.of(2022, 5, 20, 18, 20);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(60);
        dt.smena(ldtStart, ldtEnd, p, d);


    }
}


