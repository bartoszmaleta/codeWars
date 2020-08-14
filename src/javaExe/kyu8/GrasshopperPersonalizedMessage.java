package javaExe.kyu8;

public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
