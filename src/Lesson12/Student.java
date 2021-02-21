package Lesson12;

public class Student {

    String name;
    int grade;
    String course;


    public Student(String name, int grade, String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
}

class StudentTest {

    public static void equals(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.grade == st2.grade && st1.course.equals(st2.course)) {
            System.out.println("The students are equaled.");
        } else {
            System.out.println("The students are not equaled.");
        }
    }

    public static void equalsNestedIf(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.grade == st2.grade) {
                if (st1.course.equals(st2.course)) {
                    System.out.println("The students are equaled.");
                } else {
                    System.out.println("They are not in the same course.");
                }
            } else {
                System.out.println("Their grade is not equal.");
            }
        } else {
            System.out.println("Their name is not equal.");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ani", 9, "IT");
        Student st2 = new Student("Ani", 9, "IT");

        equals(st1, st2);
        equalsNestedIf(st1, st2);
    }
}
