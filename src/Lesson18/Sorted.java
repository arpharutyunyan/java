package Lesson18;

public class Sorted {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println(array[i]);
        }
    }
}

class SortedTest {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 48, 21, 5, 7, 125};
        Sorted.sort(array);
    }
}
