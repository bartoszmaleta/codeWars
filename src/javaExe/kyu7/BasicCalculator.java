package javaExe.kyu7;

public class BasicCalculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        switch (operation){
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return (numberOne * numberTwo + 0.0);
            case "/":
                return numberTwo == 0 ? null : numberOne / numberTwo;
            default: return null;
        }
    }
}
