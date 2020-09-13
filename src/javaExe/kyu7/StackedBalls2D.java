package javaExe.kyu7;

public class StackedBalls2D {
    public static double stackHeight2d(int layers) {
//        if (layers != 0) {
//            return ((layers - 1) * Math.sqrt(3) / 2 + 1);
//        }
//        return 0d;

        return layers != 0 ? ((layers - 1) * Math.sqrt(3) / 2 + 1) : 0d;
    }
}
