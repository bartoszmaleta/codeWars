package kyu8;

import java.text.DecimalFormat;

public class AreaOfSquare {

    public static void main(String[] args) {
        squareArea(2);
        squareArea(14.05);
    }

    // circumference formula for circle ===> Ob = 2 * pi * r;
    // area formula for circle ===> P = pi * r * r
    public static double squareArea(double A) {
        double solution = Math.pow(2 * A / Math.PI, 2);
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(solution));
    }

    // DecimalFormat roundTwo = new DecimalFormat("##.OO");
    // System.out.println(roundTwo.format(areaOfSquare));

    // return areaOfSquare;
}