package Lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() < 3) {
            System.out.println("Try another name!");
        } else {
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Input the correct course!");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("The grade must be in interval 1-10");
        }
    }

    public StringBuilder getName() {
        StringBuilder nameCopy = new StringBuilder(name);
        return nameCopy;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        StringBuilder name = getName();
        int course = getCourse();
        int grade = getGrade();
        System.out.println("Student " + name + " from course " + course + " get " + grade);

    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Arpine"));
        st1.setCourse(4);
        st1.setGrade(9);
        st1.showInfo();
    }
}
