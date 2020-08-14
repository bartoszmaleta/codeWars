package javaExe.kyu8;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0);

        // SECOND OPTION
//        return flower1 % 2 != flower2 % 2;
    }
}
