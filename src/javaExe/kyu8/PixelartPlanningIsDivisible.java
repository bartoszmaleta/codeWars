package javaExe.kyu8;

public class PixelartPlanningIsDivisible {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
