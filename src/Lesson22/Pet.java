package Lesson22;

public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I am pet");
        this.eyes = 2;
    }

    protected void run() {
        System.out.println("Pet runs.");
    }

    protected void jump() {
        System.out.println("Pet jumps.");
    }

}
