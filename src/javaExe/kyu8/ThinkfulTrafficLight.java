package javaExe.kyu8;

public class ThinkfulTrafficLight {
    public static String updateLight(String current) {
        return current.equals("yellow") ? "red" : current.equals("green") ? "yellow" : "green";
    }
}
