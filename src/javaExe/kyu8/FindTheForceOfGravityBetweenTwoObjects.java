package javaExe.kyu8;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class FindTheForceOfGravityBetweenTwoObjects {

    public static double solution(double[] arrVal, String[] arrUnit) {

        double G = 6.67*Math.pow(10,-11);

        double massObjFirst = arrVal[0];
        double massObjSecond = arrVal[1];
        double distanceBetweenCenters = arrVal[2];

        String unitMassObjFirst = arrUnit[0];
        String unitMassObjSecond = arrUnit[1];
        String unitDistanceBetweenCenters = arrUnit[2];

        double massObjFirstInKilograms = convertObjMassToKilograms(massObjFirst, unitMassObjFirst);
        double massObjSecondInKilograms = convertObjMassToKilograms(massObjSecond, unitMassObjSecond);
        double distanceBetweenCentersInMeters = convertDistanceToMeters(distanceBetweenCenters, unitDistanceBetweenCenters);

        return G * ((massObjFirstInKilograms * massObjSecondInKilograms) / Math.pow(distanceBetweenCentersInMeters, 2));
    }

    private static double convertDistanceToMeters(double distanceBetweenCenters, String unitDistanceBetweenCenters) {
        double calculated;
        switch(unitDistanceBetweenCenters) {
            case "m":
                calculated = distanceBetweenCenters;
                break;
            case "cm":
                calculated = distanceBetweenCenters / 100;
                break;
            case "mm":
                calculated = distanceBetweenCenters / 1000;
                break;
            case "μm":
                calculated = distanceBetweenCenters / 1000000;
                break;
            case "ft":
                calculated = distanceBetweenCenters * 0.3048;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + unitDistanceBetweenCenters);
        }
        return calculated;
    }

    private static double convertObjMassToKilograms(double massObjFirst, String unitMassObjFirst) {
        double calculated;
        switch(unitMassObjFirst) {
            case "kg":
                calculated = massObjFirst;
                break;
            case "g":
                calculated = massObjFirst / 1000;
                break;
            case "mg":
                calculated = massObjFirst / 1000000;
                break;
            case "μg":
                calculated = massObjFirst / 1000000000;
                break;
            case "lb":
                calculated = massObjFirst * 0.453592;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + unitMassObjFirst);
        }
        return calculated;
    }

    public static double solution2(double[] arrVal, String[] arrUnit) {

        double massObjFirst = arrVal[0];
        double massObjSecond = arrVal[1];
        double distanceBetweenCenters = arrVal[2];

        String unitMassObjFirst = arrUnit[0];
        String unitMassObjSecond = arrUnit[1];
        String unitDistanceBetweenCenters = arrUnit[2];

        double massObjFirstInKilograms = convertObjMassToKilograms(massObjFirst, unitMassObjFirst);
        double massObjSecondInKilograms = convertObjMassToKilograms(massObjSecond, unitMassObjSecond);
        double distanceBetweenCentersInMeters = convertDistanceToMeters(distanceBetweenCenters, unitDistanceBetweenCenters);

        System.out.println("massObjFirstInKilograms = " + massObjFirstInKilograms);
        System.out.println("massObjSecondInKilograms = " + massObjSecondInKilograms);
        System.out.println("distanceBetweenCentersInMeters = " + distanceBetweenCentersInMeters);

        double G = 6.67*Math.pow(10,-11);
        System.out.println("G = " + G);


        double result = G * ((massObjFirstInKilograms * massObjSecondInKilograms) / Math.pow(distanceBetweenCentersInMeters, 2));
        System.out.println("result = " + result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"}));
        System.out.println("==================================================");
        System.out.println(solution(new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"}));
        System.out.println("==================================================");
        System.out.println(solution(new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"}));
        System.out.println("==================================================");
    }

    // SECOND OPTION
    private final static Double G = 6.67e-11;

    public static double solution3(double[] arrVal, String[] arrUnit) {
        Map<String, Double> convertions = new HashMap<>();
        convertions.put("kg", 1.0);
        convertions.put("g", 1e-3);
        convertions.put("mg", 1e-6);
        convertions.put("μg", 1e-9);
        convertions.put("lb", 0.453592);
        convertions.put("m", 1.0);
        convertions.put("cm", 1e-2);
        convertions.put("mm", 1e-3);
        convertions.put("μm", 1e-6);
        convertions.put("ft", 0.3048);

        double m1 = arrVal[0] * convertions.get(arrUnit[0]);
        double m2 = arrVal[1] * convertions.get(arrUnit[1]);
        double r = arrVal[2] * convertions.get(arrUnit[2]);

        return G * m1 * m2 / r / r;
    }

}
