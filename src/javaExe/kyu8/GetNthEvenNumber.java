package javaExe.kyu8;

public class GetNthEvenNumber {
    public static int nthEven(int n) {
        int counter = 0;
        int evenNum = Integer.MIN_VALUE;
        for (int i = 0; counter < n; i++) {
            if (i % 2 == 0) {
                counter++;
                evenNum = i;
            }
        }
        return evenNum;
    }
}
