package javaExe.kyu7;

public class SumOfNumbersFrom0toN {
    public static String showSequence(int value){
        if (value < 0) {
            return value + "<0";
        } else if (value == 0) {
            return "0=0";
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i <= value; i++) {
          sum += i;
          if (i == value) {
              sb.append(i);
          } else {
              sb.append(i).append("+");
          }
        }
        return sb.append(" = ").append(sum).toString();
    }
}
