package javaExe.kyu8;

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;

//        return n * (n % 2 + 8);
    }
}
