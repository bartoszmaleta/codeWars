package javaExe.kyu8;

public class Watermelon {
    public static boolean divide(int weight) {
        return weight >= 3 && (weight % 2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(divide(4));
        System.out.println(divide(2));
        System.out.println(divide(5));
        System.out.println(divide(88));
        System.out.println(divide(100));
        System.out.println(divide(67));
        System.out.println(divide(90));
    }
}
