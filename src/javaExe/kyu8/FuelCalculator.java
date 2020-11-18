package javaExe.kyu8;

public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLitre) {
        if (litres < 2) {
            return litres * pricePerLitre;
        } else if (litres < 4) {
            return (litres * pricePerLitre) - litres * 0.05;
        } else if (litres < 6) {
            return (litres * pricePerLitre) - litres * 0.10;
        } else if (litres < 8) {
            return (litres * pricePerLitre) - litres * 0.15;
        } else if (litres < 10) {
            return (litres * pricePerLitre) - litres * 0.20;
        } else  {
            return (litres * pricePerLitre) - litres * 0.25;
        }
    }

    // SECOND SOLUTION
    public static double fuelPrice2(int litres, double price) {
        return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
    }

    // THIRD SOLUTION
    public static double fuelPrice3(int litres, double pricePerLiter) {
        if (litres < 12) return litres * (pricePerLiter- litres/2 * 0.05);
        return litres * (pricePerLiter - 0.25);
    }
}
