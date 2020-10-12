package javaExe.kyu8;

public class IfElseAndTernaryOperator {
    public static int saleHotdogs(final int n){
        return n < 5 ? n * 100 : n >= 5 && n < 10 ?  n * 95 : n * 90;

    }
}
