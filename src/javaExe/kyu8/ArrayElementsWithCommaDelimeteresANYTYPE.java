package javaExe.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    // SECOND OPTION
    public static String printArray2(Object[] array) {
        StringBuilder sb = new StringBuilder(7);
        int i = 0;
        for(; i < array.length - 1; i++){
            sb.append(array[i]);
            sb.append(",");
        }
        sb.append(array[i]);
        return sb.toString();
    }

    // THIRD OPTION
    public static String printArray3(Object[] array) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
