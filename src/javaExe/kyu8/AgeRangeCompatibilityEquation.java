package javaExe.kyu8;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {

        int min, max;

        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        } else {
            min = (age / 2) + 7;
            max = (age - 7) * 2;

        }
        System.out.println(min);
        System.out.println(max);

        return min + "-" + max;

    }

    public static void main(String[] args) {
        System.out.println(datingRange(17));
        System.out.println("================");
        System.out.println(datingRange(40));
        System.out.println("================");
        System.out.println(datingRange(15));
        System.out.println("================");
        System.out.println(datingRange(35));
        System.out.println("================");
        System.out.println(datingRange(10));

    }

    // SECOND OPTION
    public static String datingRange2(int age) {
        return age <= 14
                ? (int) (age - 0.10 * age) + "-" + (int) (age + 0.10 * age)
                : (age / 2) + 7 + "-" + (age - 7) * 2;
    }

}
