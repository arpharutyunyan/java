package Lesson15;

public class TimeWithWhile {
    public static void time() {

        int hour = 0;

        OUTER:
        while (hour <= 6) {

            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute < 10) {
                    break OUTER;
                }

                int second = 0;
                INNER:
                while (second <= 59) {

                    if (second * hour > minute) {
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;

                }
            } while (minute < 59);
            hour++;
        }
    }
}


class TimeWithWhileTest {
    public static void main(String[] args) {
        TimeWithWhile.time();
    }
}
