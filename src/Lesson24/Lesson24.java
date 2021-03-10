package Lesson24;

public class Lesson24 {

    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Mec");
        System.out.println(m.name);
        m.sleep();
        m.eat();
        m.swim();

        System.out.println();

        Speakable sp = new Pingvin("Pin");
        sp.speak();

        System.out.println();

        Animal an = new Lev("Lev");
//        Lev le= new Lev("A");
//        le.speak();
//        le.run();
        System.out.println(an.name);
        an.eat();
        an.sleep();

        System.out.println();

        Mammal mam = new Lev("LevMammal");
        System.out.println(mam.name);
        mam.eat();
        mam.sleep();
        mam.speak();
        mam.run();
    }
}

abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal {

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}


