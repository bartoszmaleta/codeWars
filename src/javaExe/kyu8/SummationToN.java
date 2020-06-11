package javaExe.kyu8;

public class SummationToN {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
