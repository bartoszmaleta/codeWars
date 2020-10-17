package javaExe.kyu8;

public class WilsonPrimes {

    // TODO:
    public static boolean am_i_wilson2(double n) {
        double number = (factorial((long) (n - 1)) + 1) / (n * n);
        System.out.println(number);
        return true;
    }

    public static boolean am_i_wilson(double n) {
        return (factorial((long) (n - 1)) + 1) / (n * n) % 1 == 0;
    }

    public static long factorial(long number) {
        return number <= 1 ? 1 : number * factorial(number - 1);
    }

    public static void main(String[] args) {
        am_i_wilson2(0);
        am_i_wilson2(1);
        am_i_wilson2(5);

        am_i_wilson(0);
        am_i_wilson(1);
        am_i_wilson(5);
    }
}
