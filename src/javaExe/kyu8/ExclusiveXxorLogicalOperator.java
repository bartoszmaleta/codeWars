package javaExe.kyu8;

public class ExclusiveXxorLogicalOperator {
    public static boolean xor(boolean a, boolean b) {
        return (!a && b) || (a && !b);
    }
}
