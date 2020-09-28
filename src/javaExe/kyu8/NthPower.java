package javaExe.kyu8;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        return (n > array.length - 1) ? -1 : (int) Math.pow(array[n], n);
    }
}