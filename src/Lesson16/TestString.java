package Lesson16;

public class TestString {

    public static void email(String email) {
        int indexOfShnik = 0;
        int indexOfKet = 0;
        int index = 0;

        while (index < email.length() - 1) {

            indexOfShnik = email.indexOf("@", index);
            indexOfKet = email.indexOf(".", index);
            index = email.indexOf(";", (index + 1));

            System.out.println(email.substring(indexOfShnik + 1, indexOfKet));

        }
    }

    public static void main(String[] args) {
        TestString.email("arpine@mail.am; sjfhdf@gmail.com; ya@yahoo.com;");
    }
}
