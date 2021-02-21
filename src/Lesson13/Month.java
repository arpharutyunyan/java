package Lesson13;

public class Month {
    public static void daysCount(int month) {
        switch (month) {
            case 2:
                System.out.println("The days: 28");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The days: 30");
                break;
            default:
                System.out.println("Is not correct.");
        }
    }
}

class MonthTest {
    public static void main(String[] args) {
        Month.daysCount(13);
    }
}
