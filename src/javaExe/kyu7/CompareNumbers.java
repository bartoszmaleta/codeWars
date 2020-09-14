package javaExe.kyu7;

public class CompareNumbers {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (x <= 0) break;
            if ((Integer) p[0] % x == 0) return (String)p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
