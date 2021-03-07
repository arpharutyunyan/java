package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static ArrayList<String> abs(String... args) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s : args) {
            if (!aL.contains(s)) {
                aL.add(s);
            }

        }
        Collections.sort(aL);
        return aL;
    }

    public static void main(String[] args) {
        ArrayList<String> result = abs("privet", "hello", "poka", "poka", "ok", "a");
        System.out.println(result);
    }
}
