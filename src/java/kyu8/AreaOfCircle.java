package java.kyu8;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaOfCircle {

    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }

        double area = PI * pow(radius, 2);
        return area;
    }
}
