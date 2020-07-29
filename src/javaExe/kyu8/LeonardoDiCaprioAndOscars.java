package javaExe.kyu8;

public class LeonardoDiCaprioAndOscars {
    public static void main(String[] args) {
        System.out.println(leo(88));
    }
    public static String leo(final int oscar)
    {
        return oscar == 88 ? "Leo finally won the oscar! Leo is happy"
                : oscar == 86 ? "Not even for Wolf of wallstreet?!"
                : oscar < 88 ? "When will you give Leo an Oscar?"
                : "Leo got one already!";
    }
}
