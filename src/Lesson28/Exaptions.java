package Lesson28;

public class Exaptions {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {

    public NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {

    public NeVodaException(String message) {
        super(message);
    }
}

class Tiger {
    public void eat(String st) {
        if (!st.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + st);
        }
        System.out.println("Tigr est myaso");
    }

    public void drink(String st) throws NeVodaException {

        if (!st.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + st);
        }
        System.out.println("Tigr pyet vodu");
    }

}
