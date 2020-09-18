package javaExe.kyu8;

import java.util.HashMap;
import java.util.Map;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        int tip;
        switch (rating.toUpperCase()) {
            case "TERRIBLE":
                tip = 0;
                break;
            case "POOR":
                tip = (int) (Math.ceil(amount * 0.05));
                break;
            case "GOOD":
                tip = (int) (Math.ceil(amount * 0.1));
                break;
            case "GREAT":
                tip = (int) (Math.ceil(amount * 0.15));
                break;
            case "EXCELLENT":
                tip = (int) (Math.ceil(amount * 0.2));
                break;
            default:
                return null;
        }
        return tip;
    }

    // SECOND OPTION
    // Enumerated types helps with readability, reliability, and modifiability - CC2E Chapter 12.6
    private enum ServiceRating {
        TERRIBLE,
        POOR,
        GOOD,
        GREAT,
        EXCELLENT
    }

    // Using Named Constants helps with Maintainability and Readability - CC2E Chapter 12.7
    static final Integer Terrible_Tip = 0;
    static final Double POOR_PERCENTAGE_MULTIPLIER = 0.05;
    static final Double GOOD_PERCENTAGE_MULTIPLIER = 0.10;
    static final Double GREAT_PERCENTAGE_MULTIPLIER = 0.15;
    static final Double EXCELLENT_PERCENTAGE_MULTIPLIER = 0.20;
    public static Integer calculateTip2(double amount, String rating) {

        // We have to wrap this in a try catch because valueOf will throw an InvalidArgumentException if the Enum does not exist
        try {
            var ratingEnum = ServiceRating.valueOf(rating.toUpperCase());
            switch(ratingEnum){
                case TERRIBLE:
                    return Terrible_Tip;
                case POOR:

                    // Possible refacoring here is removing the duplicationby creating a private method and passing
                    // in the amount and - TDD Chapter 1
                    return (int)Math.ceil(amount * POOR_PERCENTAGE_MULTIPLIER);
                case GOOD:
                    return (int)Math.ceil(amount * GOOD_PERCENTAGE_MULTIPLIER);
                case GREAT:
                    return (int)Math.ceil(amount * GREAT_PERCENTAGE_MULTIPLIER);
                case EXCELLENT:
                    return (int)Math.ceil(amount * EXCELLENT_PERCENTAGE_MULTIPLIER);

                // You should use the default only for error detection unless every possible input is valid. - CC2E Chapter 15.2
                default:

                    //The code will technically never get here but I left it in for demonstration purposes, please read below.
                    throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e){

       /*
         Here you could log your exceptions but we don't want the program to crash, so we return a null value.
         You could argue that we should just return NULL from default, but I wanted to show this as a possible implementation
         and it is required because of how we implemented the name checking using valueOf on the enum
       */
            return null;
        }
    }

    // THIRD OPTION
    private static Map<String, Integer> tips = new HashMap<>();

    static {
        tips.put("terrible", 0);
        tips.put("poor", 5);
        tips.put("good", 10);
        tips.put("great", 15);
        tips.put("excellent", 20);
    }

    public static Integer calculateTip3(double amount, String rating) {
        Integer tipRating = tips.get(rating.toLowerCase());
        if (tipRating == null) return null;
        return (int) Math.ceil(tipRating * amount / 100);
    }
}
