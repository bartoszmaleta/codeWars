package javaExe.kyu7;

public class MoneyMoneyMoney {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        // your code
        if (desired == principal) {
            return 0;
        }

        double actual = 0;
        int yearsCounter = 0;
        while (desired > principal) {
            principal = principal + principal * interest;
            System.out.println("principal after interest = " + principal);

            principal = principal - (principal * interest * tax);
            System.out.println("principal after tax = " + principal);
            yearsCounter++;
            System.out.println("yearsCounter = " + yearsCounter);
        }

        System.out.println("after while loop yearsCounter = " + yearsCounter);

        return yearsCounter;
    }

    public static void main(String[] args) {
        calculateYears(1000,0.05,0.18,1100);
        System.out.println("-------------------------------------");
    }

    public static int calculateYears2(double principal, double interest,  double tax, double desired) {
        int years = 0;

        while (principal < desired) {
            years++;
            principal += (principal * interest) - (principal * interest * tax);
        }

        return years;
    }

    public static int calculateYears3(double principal, double interest,  double tax, double desired) {
        return (int) Math.ceil(Math.log(desired / principal) / Math.log(1 + interest * (1 - tax)));
    }
}
