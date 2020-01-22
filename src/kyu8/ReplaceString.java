package kyu8;

public class ReplaceString {
    public static void main(String[] args) {
        dnaToRna("GCAT");
    }
    
    public static String dnaToRna(String dna) {
        dna = dna.replaceAll("T", "U");
        System.out.println(dna);

        return dna;
    }
}