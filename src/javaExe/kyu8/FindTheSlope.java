package javaExe.kyu8;

import java.util.Arrays;

public class FindTheSlope {
    public static String slope(int[] points) {
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        System.out.println(Arrays.toString(points));
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        System.out.println("delta x = " + deltaX);
        System.out.println("delta y = " + deltaY);
//        if (deltaX == 0 && deltaY == 0) {
//            return "undefined";
//        }

        if (deltaX == 0) {
            return "undefined";
        }
        if (deltaY == 0) {
            return "0";
        }



        System.out.println("result = " + deltaY / deltaX);

        return String.valueOf(deltaY / deltaX);
    }

    public static String slope2(int[] points) {
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        return deltaX == 0 ? "undefined"
                : deltaY == 0 ? "0"
                : String.valueOf(deltaY / deltaX);
    }

    public static void main(String[] args) {
        System.out.println(slope(new int[]{19,3,20,3}));
        System.out.println("================");
        System.out.println(slope(new int[]{-7,2,-7,4}));
        System.out.println("================");
        System.out.println(slope(new int[]{10,50,30,150}));
        System.out.println("================");
        System.out.println(slope(new int[]{15,45,12,60}));
        System.out.println("================");
        System.out.println(slope(new int[]{10,20,20,80}));
        System.out.println("================");
        System.out.println(slope(new int[]{-10,6,-10,3}));
    }
}
