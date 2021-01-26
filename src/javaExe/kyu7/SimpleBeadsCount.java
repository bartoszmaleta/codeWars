package javaExe.kyu7;

public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        System.out.println(nBlue);
        return nBlue > 1
                ? (2 * nBlue) - 4
                : 0;
    }
}
