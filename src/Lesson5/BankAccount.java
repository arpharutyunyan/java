package Lesson5;

public class BankAccount {
    String name = "Petr";
    double balance = 100;

    public void addBalance(double sum) {
        System.out.println("Balance before refilling is " + balance);
        balance += sum;
        System.out.println("Balance after refilling is " + balance);
        System.out.println();
    }

    public void minusBalance(double sum) {
        System.out.println("Balance before withdrawing is " + balance);
        balance -= sum;
        System.out.println("Balance after withdrawing is " + balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.addBalance(30.5);
        MyAccount.minusBalance(10.5);
    }
}
