package java.kyu7;

import java.util.Arrays;

public class CalculateMeanAndConcatenateString {
    public static Object[] mean(char[] lst) {
        String lstString = "";
        for (char ch : lst) {
            lstString += ch;
        }
//        System.out.println("lst array in String = " + lstString);

        String resultWord = "";
       double sum = 0;

        for (int i = 0; i < lstString.length(); i++) {
            Boolean flag = Character.isDigit((lstString.charAt(i)));
//            System.out.print(lstString.charAt(i) + " ");

            if (flag) {
//                System.out.println("in flag = " + lstString.charAt(i));
                sum += Double.parseDouble((String.valueOf(lstString.charAt(i))));
//                System.out.println("sum after addition = " + sum);
            } else {
                resultWord += lstString.charAt(i);
            }
        }

//        System.out.println("\nresult word = " + resultWord);
//        System.out.println("sum = " + sum);

        double avg = sum / 10;
//        System.out.println("avg = " + avg);

        Object[] result = new Object[] {avg, resultWord};

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mean(new char[]{'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'})));
    }

}


