package javaExe.kyu8;

import java.util.Arrays;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(elem -> elem == x);
    }
}
