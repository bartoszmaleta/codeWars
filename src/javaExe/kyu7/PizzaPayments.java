package javaExe.kyu7;


public class PizzaPayments {
    public static double michaelPays(double cost) {
        return cost < 5
                ? (double) Math.round(cost * 100) / 100
                : (cost / 3) <= 10
                ? (double) Math.round((cost - (cost / 3)) * 100) / 100
                : (double) Math.round((cost - 10) * 100) / 100;
    }

    // SECOND OPTION
    public static double michaelPays2(double cost) {
        return Math.round((cost < 5 ? cost : cost - Math.min(cost / 3, 10)) * 100.0) / 100.0;
    }
}
