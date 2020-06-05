package javaExe.kyu7;

public class SquareDigit {
    public static void main(String[] args) {
        // squareDigits(9119);
        int numbers = 9;
       
        String numbersString = Integer.toString(numbers);
        System.out.println(numbersString);
       
        Character numbersStringChar = numbersString.charAt(0);
        System.out.println(numbersStringChar);

        Integer numbersStringCharInt = Integer.valueOf(numbersString);
        System.out.println(numbersStringCharInt);
        
        System.out.println("-----------");
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        // TODO Implement me
        String result = "";
        String nString = Integer.toString(n);
        // System.out.println(nString);
        for (int i = 0; i < nString.length(); i++) {
            Character characterFromNumbersString = nString.charAt(i);
            // System.out.println(characterFromNumbersString);
            int intFromCharacter = Character.getNumericValue(characterFromNumbersString);
            // System.out.println();
            // System.out.println(intFromCharacter);
            int squaredInt = intFromCharacter *intFromCharacter;
            String squaredIntString = Integer.toString(squaredInt);
            result += squaredIntString;
        }
        int resultInt = Integer.parseInt(result);

        return resultInt;
    }

}