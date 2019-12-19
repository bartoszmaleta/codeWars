package apps;

public class MyUtilities{

    public static boolean isDigit(String s)
    {
        // if (.isDigit(s)):
        //return true or false

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
            return true;
    }

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        // System.out.println(sum(a, b));
        String text = "zero";
        int text2 = 1;

        System.out.println(isDigit(text));
        // System.out.println(isDigit(text2));
    }
  }