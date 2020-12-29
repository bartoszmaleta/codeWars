package javaExe.kyu8;

import java.text.DecimalFormat;

public class CirclesInPolygons {
    int sides;
    int sideLength;

    public CirclesInPolygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        double angle_in_radian =  Math.PI / sides;
        return sideLength / Math.tan(angle_in_radian);
    }

    public double circleDiameter2() {
        return sideLength/Math.tan(Math.PI/sides);
    }

}
