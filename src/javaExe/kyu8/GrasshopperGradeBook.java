package javaExe.kyu8;

public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int mean = (s1 + s2 + s3) / 3;
        return mean >= 90 ? 'A'
                : mean >= 80 ? 'B'
                : mean >= 70 ? 'C'
                : mean >= 60 ? 'D'
                : 'F';
    }
}
