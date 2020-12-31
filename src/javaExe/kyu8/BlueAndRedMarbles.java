package javaExe.kyu8;

import java.text.DecimalFormat;

public class BlueAndRedMarbles {
    public static double guessBlue2(int blueStart, int redStart, int bluePulled, int redPulled) {
//        float probability = restBlue / totalInBag;
//        double newResult = Double.parseDouble(new DecimalFormat("##.#").format(probability));
//        System.out.println("rwerew " + newResult);

        float restBlue = blueStart - bluePulled;
        float restRed = redStart - redPulled;
        float totalInBag = restBlue + restRed;
        double ret = restBlue / totalInBag;


        return ret;
    }

    public static void main(String[] args) {
        System.out.println(guessBlue(5, 5, 2, 3));
        System.out.println("==================================");
        System.out.println(guessBlue(5, 7, 4, 3));
    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double) (((float) (blueStart - bluePulled)) / (((float)((blueStart - bluePulled))) + ((float)(redStart - redPulled))));
    }
}
