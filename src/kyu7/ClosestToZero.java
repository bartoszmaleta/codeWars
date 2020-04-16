package kyu7;

public class ClosestToZero {
    public static Integer find(int[] arr) {

        int closestPositive = Integer.MAX_VALUE;
        int closestPositive2 = Integer.MAX_VALUE;
        int closestNegative = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number == 0) {
                return number;
            } else if (number > 0) {
                if (number < closestPositive) {
                    closestPositive = number;
                }
            } else if (number < 0) {
                number *= -1;
                if (number < closestPositive2) {
                    closestPositive2 = number;
                }
            }
        }

        int resultPositive = closestPositive;
        int resultNegativeButPositive = closestPositive2;

        int smallerNumber = 0;
        if (resultPositive < resultNegativeButPositive) {
            smallerNumber = resultPositive;
        } else if (resultPositive == resultNegativeButPositive) {
            return null;
        } else {
            smallerNumber = resultNegativeButPositive * (-1);
        }
        return smallerNumber;

    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{10, 3, 9, 1}));
        System.out.println(find(new int[]{2, 4, -1, -3}));
        System.out.println(find(new int[]{13, 0, -6}));
    }

    public static Integer find2(final int[] arr) {
        int n = Integer.MIN_VALUE, p = Integer.MAX_VALUE;
        for (final int i : arr)
            if (i < 0) {
                n = Math.max(n, i);
            }else {
                p = Math.min(p, i);
            }
        return n + p == 0 ? null : n + p < 0 ? p : n;
    }
}
