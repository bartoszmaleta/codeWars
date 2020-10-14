package javaExe.kyu8;

import java.util.List;
import java.util.stream.Collectors;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        if (n == 0) return 0;

        List<Character> nList = String.valueOf(n).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for (int i = nList.size() - 1; i >= 0; i--) {
            if (Character.getNumericValue(nList.get(i)) == 0) {
                nList.remove(i);
            } else {
                break;
            }
        }
        //        String str = nList.stream().map(elem -> elem.toString()).collect(Collectors.joining());
        return Integer.parseInt(nList.stream().map(Object::toString).collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
        noBoringZeros(96);
        noBoringZeros(105);
    }

    // SECOND OPTION
    public static int noBoringZeros2(int n) {
        if (n == 0)
            return n;

        while (n % 10 == 0)
            n /= 10;

        return n;
    }

    // THIRD OPTION
    public static int noBoringZeros3(int n) {
        if (n == 0) return 0;
        if (n % 10 != 0) return n;
        else return noBoringZeros (n / 10);
    }

    // FOURTH OPTION
    public static int noBoringZeros4(int n) {
        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n/10);
    }

}
