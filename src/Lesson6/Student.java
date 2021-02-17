package Lesson6;

public class Student {


    int number;
    String name;
    String surname;
    int year;
    double mathAverageRating;
    double economicAverageRating;
    double foreignLanguageAverageRating;

    public Student(int number, String name, String surname, int year, double mathAverageRating, double economicAverageRating, double foreignLanguageAverageRating) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mathAverageRating = mathAverageRating;
        this.economicAverageRating = economicAverageRating;
        this.foreignLanguageAverageRating = foreignLanguageAverageRating;
    }

    public Student(int number, String name, String surname, int year) {
//        this.number = number;
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
        this(number, name, surname, year, 0.0, 0.0, 0.0);
    }

    public Student() {

    }
}

class StudentTest {

    public double countAverageRatings(Student st) {
        double averageRating = (st.mathAverageRating + st.economicAverageRating + st.foreignLanguageAverageRating) / 3;
        System.out.println(st.name + "'s" + " the average grade is " + averageRating);
        return averageRating;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.number = 1;
        st1.name = "Anna";
        st1.surname = "Harutyunyan";
        st1.year = 2020;
        st1.mathAverageRating = 9.4;
        st1.economicAverageRating = 6.9;
        st1.foreignLanguageAverageRating = 8.5;


        Student st2 = new Student(2, "Ani", "Harutyunyan", 2020);
        st2.mathAverageRating = 5.6;
        st2.economicAverageRating = 8.2;
        st2.foreignLanguageAverageRating = 7.9;

        Student st3 = new Student(3, "Anahit", "Harutyunyan", 2021, 8.3, 9.9, 5.5);

        StudentTest sTest = new StudentTest();
        sTest.countAverageRatings(st1);
        sTest.countAverageRatings(st2);
        sTest.countAverageRatings(st3);


    }
}
