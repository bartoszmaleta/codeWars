package javaExe.kyu8;

import java.text.DecimalFormat;

public class FormattingDecimalPlaces {
    public static double TwoDecimalPlaces(double number)
    {
        return Double.parseDouble(new DecimalFormat("##.##").format(number));
    }
}
