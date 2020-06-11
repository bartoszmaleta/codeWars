package javaExe.kyu7;

import java.util.Arrays;

public class PredictYourAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = {age1, age2, age3, age4, age5, age6, age7, age8};

        System.out.println(Arrays.toString(ages));

        int[] agesMultiplied = new int[ages.length];
        for (int i = 0; i < ages.length; i++) {
            agesMultiplied[i] = ages[i] * ages[i];
        }
        System.out.println(Arrays.toString(agesMultiplied));

        int sum = 0;
        for (int age : agesMultiplied) {
            sum += age;
        }
        System.out.println(sum);
        int ageSquareRoot = (int) Math.sqrt(sum);
        System.out.println(ageSquareRoot);
        int dividedAge = ageSquareRoot / 2;
        System.out.println(dividedAge);

        return dividedAge;

    }

    public static int predictAge2(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = { age1, age2, age3, age4, age5, age6, age7, age8 };
        int sum = Arrays.stream(ages).map(age -> age * age).sum();
        double sqrt = Math.sqrt(sum);
        return (int) (sqrt / 2);
    }

    public static void main(String[] args) {
        predictAge(65, 60, 75, 55, 60, 63, 64, 45);
    }
}
