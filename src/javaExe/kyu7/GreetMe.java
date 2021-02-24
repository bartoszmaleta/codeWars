package javaExe.kyu7;


public class GreetMe {
    public static String greet(String name){
        return String.format("Hello %s %s!", name.substring(0,1).toUpperCase(), name.substring(1).toLowerCase());
//        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
