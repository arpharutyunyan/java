package Lesson8;

public class NonAccessModifiers {

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void divide(int a, int b) {
        System.out.println("Chastnoe chislo:  " + a / b);
        System.out.println("Ostatok: " + a % b);
    }

}


class NonAccessModifiersTest {
    public static void main(String[] args) {
        NonAccessModifiers.divide(10, 3);
        System.out.println(NonAccessModifiers.multiply(1, 2, 3));
    }
}