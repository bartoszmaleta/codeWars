package javaExe.kyu8;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[]{
                humanYears
                , humanYears == 1 ? 15 : humanYears == 2 ? 24 : 24 + (4 * (humanYears - 2))
                , humanYears == 1 ? 15 : humanYears == 2 ? 24 : 24 + (5 * (humanYears - 2))};
    }

    // SIMPLER VERSION
    public static int[] humanYearsCatYearsDogYears2(final int humanYears) {
        int[] years = new int[3];
        years[0] = humanYears;
        years[1] = humanYears == 1 ? 15 : humanYears == 2 ? 24 : 24 + (4 * (humanYears - 2));
        years[2] = humanYears == 1 ? 15 : humanYears == 2 ? 24 : 24 + (5 * (humanYears - 2));
//        return years;
    }
}
