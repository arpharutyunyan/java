package Lesson6;

public class MethodOverloading {


    public int sum() {
        return 0;
    }

    public int sum(int a) {
        return a;
    }

    public int sum(int b, int c) {
        return b + c;
    }

    public int sum(int d, int f, int g) {
        return sum(d, f) + g;
    }

    public int sum(int h, int i, int j, int k) {
        return sum(h, i, j) + k;
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.sum());
        System.out.println(mo.sum(1));
        System.out.println(mo.sum(1,2));
        System.out.println(mo.sum(1,2,3));
        System.out.println(mo.sum(1,2,3,4));
    }
}