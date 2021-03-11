package Lesson24;

public class Lesson24 {

    public static void main(String[] args) {
//        Mechenosec m = new Mechenosec("Mec");
//        System.out.println(m.name);
//        m.sleep();
//        m.eat();
//        m.swim();
//
//        System.out.println();
//
//        Speakable sp = new Pingvin("Pin");
//        sp.speak();
//
//        System.out.println();
//
//        Animal an = new Lev("Lev");
////        Lev le= new Lev("A");
////        le.speak();
////        le.run();
//        System.out.println(an.name);
//        an.eat();
//        an.sleep();
//
//        System.out.println();
//
//        Mammal mam = new Lev("LevMammal");
//        System.out.println(mam.name);
//        mam.eat();
//        mam.sleep();
//        mam.speak();
//        mam.run();


//        Lesson25

        Animal an1 = new Mechenosec("Mech");
        Animal an2 = new Pingvin("Pin");
        Animal an3 = new Lev("Lev");

        Fish f = new Mechenosec("MechFish");

        Bird b1 = new Pingvin("PinBird");

        Mammal m1 = new Lev("LevMammal");

        Mechenosec mech = new Mechenosec("MechMech");
        Pingvin pin = new Pingvin("PinPin");
        Lev lev = new Lev("LevLev");

        Speakable sp1 = new Pingvin("PinSpeak");
        Speakable sp2 = new Lev("LevSpeak");

        Speakable[] array1 = {sp1, sp2, pin, lev, b1, m1};
        Animal[] array2 = {an1, an2, an3, f, b1, m1, mech, pin, lev};

        for (Animal a : array2) {
            if ((a instanceof Mechenosec)) {
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Mechenosec) a).swim();
            } else if (a instanceof Pingvin) {
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Pingvin) a).fly();
                ((Pingvin) a).speak();
            } else if (a instanceof Lev) {
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Lev) a).run();
                ((Lev) a).speak();
            }
            System.out.println("----------------------------------");
        }

        for (Speakable s : array1) {
            if (s instanceof Pingvin) {
                System.out.println(((Pingvin) s).name);
                ((Pingvin) s).eat();
                ((Pingvin) s).sleep();
                s.speak();
                ((Pingvin) s).fly();
            } else if (s instanceof Lev) {
                System.out.println(((Lev) s).name);
                ((Lev) s).eat();
                ((Lev) s).sleep();
                s.speak();
                ((Lev) s).run();
            }

        }
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


