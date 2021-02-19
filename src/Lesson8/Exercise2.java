package Lesson8;

public class Exercise2 {
    static final double P = 3.14;

    public double countSquare(double radius) {
        return P * radius * radius;
    }

    public static double countCircumference(double radius) {
        return 2 * P * radius;
    }

    public void result(double radius) {
        System.out.println("The radius: " + radius);
        System.out.println("The square of circle: " + countSquare(radius));
        System.out.println("The Circumference: " + countCircumference(radius));
    }
}

class Exercise2Test {
    public static void main(String[] args) {
        System.out.println(Exercise2.countCircumference(2));
        Exercise2 ex = new Exercise2();
        System.out.println(ex.countSquare(2));
        ex.result(2);
    }
}
