package javaExe.kyu8;

public class ArrayElementsWithCommaDelimeteresANYTYPE {
    public static String printArray(Object array[]) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String elem = String.valueOf(array[i]);
            if (i == array.length - 1) {
                result += elem;
            } else {
                result += elem + ",";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(printArray(new Integer[]{2, 4, 5, 2}));

    }
}
