package javaExe.kyu8;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
        int area = l * w;
        int perimeter = l + l + w + w;

        if (l == w) {
            return area;
        } else {
            return perimeter;
        }
    }
}
