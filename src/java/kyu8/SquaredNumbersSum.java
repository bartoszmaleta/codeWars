package java.kyu8;

public class SquaredNumbersSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2};
        System.out.println(squareSum(numbers));
    }

    public static int squareSum (int[] n) {
        int result = 0;
        for (int number : n) {
            number *= number;
            result += number;
        }
        return result;
    }
}