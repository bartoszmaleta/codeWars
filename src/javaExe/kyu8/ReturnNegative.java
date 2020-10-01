package javaExe.kyu8;

public class ReturnNegative {

    public static int makeNegative(final int x) {
        return x <= 0 ? x : Math.negateExact(x);
    }

    // SECOND OPTION
    public static int makeNegative2(final int x) {
        return x <= 0 ? x : Math.negateExact(x);
    }
}
