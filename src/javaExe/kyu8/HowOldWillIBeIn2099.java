package javaExe.kyu8;

public class HowOldWillIBeIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
//        int year = 34;
//        birth = year;
        int year;
        if (birth > yearTo) {
            year = birth - yearTo;
            String inFutureBirth = "";
            if (year == 1) {
                inFutureBirth = String.format("You will be born in %d year.", year);
            } else {
                inFutureBirth = String.format("You will be born in %d years.", year);
            }
            return inFutureBirth;
        } else if (birth == yearTo) {
            String thisYearBirth = "You were born this very year!";
            return thisYearBirth;
        } else if (birth < yearTo) {
            if (yearTo - birth == 1) {
                year = 1;
                String oneYearOld = String.format("You are %d year old.", year);
                return oneYearOld;
            } else {
                year = yearTo - birth;
                String inFutureYear = String.format("You are %d years old.", year);
                return inFutureYear;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        CalculateAge(2011, 22);
    }

    public static String CalculateAge2(int birth, int year) {
        final int age = year - birth;
        return
                age == 0 ? "You were born this very year!" :
                        age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
                                String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
    }

}


