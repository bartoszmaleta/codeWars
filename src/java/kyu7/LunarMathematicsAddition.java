package java.kyu7;

public class LunarMathematicsAddition {
    public static long add(long number1, long number2) {
        long sum = 0;
        for (int i = 1; number1 > 0 || number2 > 0; number1 /= 10, number2 /= 10, i *= 10) {
            System.out.println("number1 = " + number1);
            System.out.println("number2 = " + number2);
            long numberToPrint = i * Math.max(number1 % 10, number2 % 10);
            System.out.println("number to add = " + numberToPrint + "\n");
            sum += numberToPrint;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(322, 4102));
        System.out.println("---------------------");
        System.out.println(add(4102, 322));
    }
}

//https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e/train/java         // this one here
//https://www.codewars.com/kata/56f7493f5d7c12d1690000b6/train/java
//        https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java