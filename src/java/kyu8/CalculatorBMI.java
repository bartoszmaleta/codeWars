package java.kyu8;

public class CalculatorBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        String outputMessage = "";
        if (bmi > 30) {
            outputMessage = "Obese";
        } else if (bmi > 25) {
            outputMessage = "Overweight";
        } else if (bmi > 18.5) {
            outputMessage = "Normal";
        } else if (bmi <= 18.5) {
            outputMessage = "Underweight";
        }
        return outputMessage;
      }
}