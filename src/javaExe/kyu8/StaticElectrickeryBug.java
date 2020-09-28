package javaExe.kyu8;

public class StaticElectrickeryBug {
    public static final StaticElectrickeryBug INST = new StaticElectrickeryBug();

    private static int ONE_HUNDRED = 100;

    public static int value = ONE_HUNDRED;

    private StaticElectrickeryBug() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
