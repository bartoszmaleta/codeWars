package javaExe.kyu7;

public class SnailCrawlsUp {


    public static void main(String[] args) {
        System.out.println("____________________________________");
        System.out.println(snail(10, 3, 1));
        System.out.println(snail(3, 2, 1));
        System.out.println(snail(10, 3, 2));
    }

    public static int snail(int column, int day, int night) {
        boolean isDay = true;
        float daysNeeded = 0;
        int distanceCovered = 0;
        while (column > distanceCovered) {
            if (isDay) {
                distanceCovered += day;
                daysNeeded += 0.5;
                isDay = false;
            } else {
                distanceCovered -= night;
                daysNeeded += 0.5;
                isDay = true;
            }
        }
        return (int) Math.ceil(daysNeeded);
    }

    // SECOND OPTION
    public static int snail2(int column, int day, int night) {
        int days = 1;
        while(day < column){
            column -= (day - night);
            days++;
        }
        return days;
    }
}
