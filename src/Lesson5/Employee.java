package Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    public Employee(String surname, double salary, String department) {
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public double doubleSalary() {
//        System.out.println(this.surname + "'s " + "salary before doubling is " + this.salary);
        this.salary *= 2;
//        System.out.println(this.surname + "'s " + "salary after doubling is " + this.salary);
        return this.salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Harutyunyan", 150000.0, "IT");
        System.out.println(employee1.surname + "'s " + "salary before doubling is " + employee1.doubleSalary());
        Employee employee2 = new Employee("Smith", 100.5, "Accounting");
        double newSalary = employee2.doubleSalary();
        System.out.println(employee2.surname + "'s " + "salary before doubling is " + newSalary);

    }
}
