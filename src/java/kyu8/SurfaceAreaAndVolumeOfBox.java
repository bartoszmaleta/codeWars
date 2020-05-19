package java.kyu8;

import java.util.Arrays;

public class SurfaceAreaAndVolumeOfBox {
    public static void main(String[] args) {
        getSize(4, 2, 6);
        Arrays.toString(getSize(4, 2, 6));
    }
    public static int[] getSize(int w, int h, int d) {
        int area = (w *h) * 2 + (w * d) * 2 + (h * d) * 2;
        int volume = w * h * d;
        System.out.println(area);
        System.out.println(volume);

        int[] stats = {area, volume};
        return stats;
    }
}
