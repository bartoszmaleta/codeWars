package javaExe.kyu8;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {
        int counter = 0;
        if (sonYears == 0) {
            counter = incrementingProcedure(dadYears, sonYears, counter);
        } else {
            int newDadYears = dadYears;
            int newSonYears = sonYears;
            while (newDadYears != newSonYears * 2) {
                newDadYears--;
                newSonYears--;
                counter++;
                if (newDadYears == 0 || newSonYears == 0) {
                    counter = 0;
                    counter = incrementingProcedure(dadYears, sonYears, counter);
                    break;
                }
            }
        }
        return counter;
    }

    private static int incrementingProcedure(int dadYears, int sonYears, int counter) {
        while (dadYears != sonYears * 2) {
            dadYears++;
            sonYears++;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("================");
        TwiceAsOld(30, 0);
        System.out.println("================");
        TwiceAsOld(30, 7);
        System.out.println("================");
        TwiceAsOld(45, 30);
    }

    // SECOND SOLUTION
    public static int TwiceAsOld2(int dadYears, int sonYears){
        return Math.abs(dadYears - sonYears * 2);
    }
}
