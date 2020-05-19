package java.kyu8;

public class FuelCalc {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (mpg * fuelLeft < distanceToPump) {
            return false;
        }
        return true;
    }
}