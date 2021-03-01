package Lesson17;

public class ExerciseStringBuilder {
    public static boolean equals(StringBuilder sb1, StringBuilder sb2) {

        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(equals(sb1, sb2));

    }
}
