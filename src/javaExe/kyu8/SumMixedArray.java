package javaExe.kyu8;

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object elem : mixed) {
            sum += Integer.parseInt(String.valueOf(elem));
        }
        return mixed.size() > 0 ? sum : 0;
    }

    // SECOND OPTION
    public int sum2(List<?> mixed) {
        return mixed.stream().mapToInt(elem -> Integer.parseInt(String.valueOf(elem))).sum();
    }
}
