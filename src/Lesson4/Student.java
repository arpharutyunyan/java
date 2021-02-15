package Lesson4;

public class Student {
    int number;
    String name;
    String surname;
    int year;
    double mathAverageRating;
    double economicAverageRating;
    double foreignLanguageAverageRating;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.number = 1;
        st1.name = "Anna";
        st1.surname = "Harutyunyan";
        st1.year = 2020;
        st1.mathAverageRating = 9.4;
        st1.economicAverageRating = 6.9;
        st1.foreignLanguageAverageRating = 8.5;

        Student st2 = new Student();
        st2.number = 2;
        st2.name = "Ani";
        st2.surname = "Harutyunyan";
        st2.year = 2020;
        st2.mathAverageRating = 5.8;
        st2.economicAverageRating = 8.9;
        st2.foreignLanguageAverageRating = 8.5;

        Student st3 = new Student();
        st3.number = 3;
        st3.name = "Anahit";
        st3.surname = "Harutyunyan";
        st3.year = 2021;
        st3.mathAverageRating = 8.3;
        st3.economicAverageRating = 9.9;
        st3.foreignLanguageAverageRating = 5.5;

        System.out.println("The average grade for " + st1.name + " is " + (st1.mathAverageRating + st1.economicAverageRating + st1.foreignLanguageAverageRating) / 3);
        System.out.println("The average grade for " + st2.name + " is " + (st2.mathAverageRating + st2.economicAverageRating + st2.foreignLanguageAverageRating) / 3);
        System.out.println("The average grade for " + st3.name + " is " + (st3.mathAverageRating + st3.economicAverageRating + st3.foreignLanguageAverageRating) / 3);

    }
}
