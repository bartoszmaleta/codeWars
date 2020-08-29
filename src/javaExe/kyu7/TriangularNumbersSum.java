package javaExe.kyu7;

public class TriangularNumbersSum {
    public static int sumTriangularNumbers(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += (i * (i + 1)) / 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));
//        System.out.println(sumTriangularNumbers(34));
        System.out.println(sumTriangularNumbers(-291));
//        System.out.println(sumTriangularNumbers(943));
    }

}
