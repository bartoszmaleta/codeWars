package javaExe.kyu8;

public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        return String.format("%dx^%d", coefficient / (exponent + 1), exponent + 1);
    }
}
