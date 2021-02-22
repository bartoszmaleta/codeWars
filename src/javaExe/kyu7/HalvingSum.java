package javaExe.kyu7;

public class HalvingSum {
    static int halvingSum(int n) {
        if (n == 1) return 1;
        int sum = n;

        while (n / 2 >= 2) {
            n = n / 2;
            sum += n;
        }
        return sum + 1;
    }

    public static void main(String[] args) {
        System.out.println(halvingSum(25));
        System.out.println(halvingSum(127));
    }
}
