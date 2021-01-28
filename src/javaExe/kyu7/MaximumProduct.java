package javaExe.kyu7;

public class MaximumProduct {
    public static int adjacentElementsProduct2(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < array.length;i++) {
            if (i + 1 == array.length) {
                return maxProduct;
            }
            int newProduct = array[i] * array[i + 1];
            if (newProduct > maxProduct) {
                maxProduct = newProduct;
            }
        }
        return maxProduct;
    }

    public static int adjacentElementsProduct(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < array.length;i++) {
            if (i + 1 == array.length) return maxProduct;
            maxProduct = Math.max(array[i] * array[i + 1], maxProduct);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println(adjacentElementsProduct(new int[] {5, 8}));
        System.out.println("============================");
        System.out.println(adjacentElementsProduct(new int[] {1, 2, 3}));
        System.out.println("============================");
        System.out.println(adjacentElementsProduct(new int[] {1, 5, 10, 9}));
        System.out.println("============================");
        System.out.println(adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
        System.out.println("============================");
        System.out.println(adjacentElementsProduct(new int[] {1, 2, 3, 0}));
        System.out.println("============================");
    }
}
