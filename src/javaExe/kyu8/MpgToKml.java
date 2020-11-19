package javaExe.kyu8;

public class MpgToKml {

    public static float mpgToKPM(final float mpg) {
        return (float) (Math.round(((mpg * 1.609344) / 4.54609188) * 100.0) / 100.0);
    }

    // SECOND OPTION
    public static float mpgToKPM2(final float mpg) {
        return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;
    }

    public static void main(String[] args) {
        System.out.println(mpgToKPM(10));
        System.out.println(mpgToKPM(20));
        System.out.println(mpgToKPM(30));
        System.out.println(mpgToKPM(32));
        System.out.println(mpgToKPM(223));
        System.out.println(mpgToKPM(43));
    }
}
