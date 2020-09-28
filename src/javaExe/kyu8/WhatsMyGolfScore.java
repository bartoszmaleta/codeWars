package javaExe.kyu8;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.IntStream.range;

public class WhatsMyGolfScore {

    public static void main(String[] args) {
        System.out.println(golfScoreCalculator("443454444344544443", "353445334534445344"));
    }

    public static int golfScoreCalculator(String parList, String scoreList) {
        int sum = 0;
        for (int i = 0; i < parList.length(); i++) {
            int parNum = Character.getNumericValue(parList.charAt(i));
            int scoreNum = Character.getNumericValue(scoreList.charAt(i));
            sum += scoreNum - parNum;
        }
        return sum;
    }

    // SECOND OPTION
    static int golfScoreCalculator2(String parList, String scoreList) {
        return range(0, 18).map(i -> scoreList.charAt(i) - parList.charAt(i)).sum();
    }
}
