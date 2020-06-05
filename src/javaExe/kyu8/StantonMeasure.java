package javaExe.kyu8;

public class StantonMeasure {

    public static int stantonMeasure(int[] arr) {
        int c = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 1)
                c++;
        }
        int coun = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == c)
                coun++;
        }
        return coun;
    }
}
