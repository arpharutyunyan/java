package Lesson3;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a =5;
        int result_a = a-- - --a + ++a + a++ +a;
        System.out.println(result_a);

        int b =8;
        int result_b = ++b - b++ + ++b - --b;
        System.out.println(result_b);
    }
}
