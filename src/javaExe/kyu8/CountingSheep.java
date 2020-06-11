package javaExe.kyu8;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep == true) {
                result++;
            }
        }

        return result;
    }
}
