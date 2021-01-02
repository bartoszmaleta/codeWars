package javaExe.kyu8;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {

        int totalCost = 0;
        totalCost = d * 40;
        if (d < 3) {
            totalCost = d * 40;
        } else if (d < 7) {
            totalCost -= 20;
        } else if (d >= 7) {
            totalCost -= 50;
        }

        return totalCost;
    }

    public static int rentalCarCost2(int d) {
        int totalCost = d * 40;

        return d < 3 ? totalCost
                : d < 7
                ? totalCost -= 20
                : (totalCost -= 50);
    }
}
