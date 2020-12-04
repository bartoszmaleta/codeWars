package javaExe.kyu8;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        int result;

        for (int i = 1; i < 11; i++) {
            result = i * num;
            sb.append(i).append(" * ").append(num).append(" = ").append(result).append("\n");
        }
        return sb.toString().trim();
    }
}
