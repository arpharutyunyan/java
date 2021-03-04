package Lesson19;

public class Array {

    public static String[] abc(String[]... array) {
        int length = 0;

        for (String[] stArray : array) {
            length += stArray.length;
        }

        String[] resultArray = new String[length];
        int index = 0;

        for (String[] stArray : array) {
            for (String st : stArray) {
                resultArray[index] = st;
                index += 1;
            }
        }

        return resultArray;
    }


    public static void main(String[] args) {
        String[] result = abc(new String[]{"privet", "poka"}, new String[]{"ok", "ona"});
        for (String st : args) {
            for (int i = 0; i < result.length; i++) {
                if (st.equals(result[i])) {
                    result[i] = null;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}

