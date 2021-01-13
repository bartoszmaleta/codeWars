package javaExe.kyu8;

public class HolidayDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) Math.floor(hol / (normPrice * ((float) discount / 100)));
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(12,50,1000));
        System.out.println("================================");
        System.out.println(dutyFree(17, 10, 500));
        System.out.println("================================");
        System.out.println(dutyFree(24,35,3000));
        System.out.println("================================");
        System.out.println(dutyFree(1400,35,10000));
    }

    // SECOND OPTION
    public static int dutyFree2(int normPrice, int discount, int hol) {
        return hol*100/(normPrice*discount);
    }
}
