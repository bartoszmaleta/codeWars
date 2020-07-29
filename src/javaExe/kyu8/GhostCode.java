package javaExe.kyu8;

public class GhostCode {
    public static void main(String[] args) {
        System.out.println(helloName("Javatlacati"));;
    }

    public static String helloName(String name) {
        if (name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }

}
