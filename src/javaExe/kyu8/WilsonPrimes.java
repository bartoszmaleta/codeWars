package javaExe.kyu8;

public class WilsonPrimes {

    public static boolean am_i_wilson(long n) {
        return n == 5 || n == 13 || n == 563;
    }

    // SECOND OPTION
    public static boolean am_i_wilson2(long n) {
        long modulus = n * n;
        long product = 1;
        for (long factor = 2; factor < n; factor++)
            product = (product * factor) % modulus;
        return product + 1 == modulus;
    }
}
