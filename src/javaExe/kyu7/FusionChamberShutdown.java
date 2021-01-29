package javaExe.kyu7;

import java.util.Arrays;

public class FusionChamberShutdown {
    public static int[] burner(int c, int h, int o) {
        int water = Math.min(h / 2, o);
        int carbonDioxide = Math.min(c, (o - water) / 2);
        int methane = Math.min(c - carbonDioxide, (h - water * 2) / 4);
        return new int[]{water, carbonDioxide, methane};
    }

    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println(Arrays.toString(burner(45, 11, 100)));
        System.out.println("**************************");
        System.out.println(Arrays.toString(burner(354, 1023230, 0)));
        System.out.println("**************************");
        System.out.println(Arrays.toString(burner(215, 41, 82100)));
        System.out.println("**************************");
        System.out.println(Arrays.toString(burner(939, 3, 694)));
        System.out.println("**************************");
    }
}
