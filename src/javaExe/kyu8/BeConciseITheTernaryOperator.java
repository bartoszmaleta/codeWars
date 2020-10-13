package javaExe.kyu8;

public class BeConciseITheTernaryOperator {
    public static String describeAge(int a) {
        return "You're a(n) " + (a <= 12 ? "kid"
                : a <= 17 ? "teenager"
                : a <= 64 ? "adult"
                : "elderly");
    }
    public static String describeAge2(int a) {return"You're a(n) "+(a<13?"kid":a<18?"teenager":a<65?"adult":"elderly");}
}
