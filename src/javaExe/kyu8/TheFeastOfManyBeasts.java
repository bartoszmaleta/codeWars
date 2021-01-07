package javaExe.kyu8;

public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && dish.charAt(dish.length() - 1) == beast.charAt(beast.length() - 1);
    }
}
