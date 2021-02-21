package Lesson10.P4;
import Lesson10.P1.*;
import Lesson10.P1.P2.B;
import Lesson10.P1.P2.P3.*;
import Lesson10.P4.P5.E;


public class D {

    public static void main(String[] args) {
        A exA = new A();
        System.out.println(exA.a);

        System.out.println(B.sum());

        C exC = new C();
        System.out.println(exC.c);

        E exE = new E();
        System.out.println(exE.e);

    }

}
