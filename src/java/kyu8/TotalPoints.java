package java.kyu8;

public class TotalPoints {
    public static int points(String[] games) {
        int total = 0;
        for (String s : games) {
            int x = Integer.parseInt(s.split(":", 2)[0], 10);
            int y = Integer.parseInt(s.split(":", 2)[1], 10);
            if (x > y) {
                total += 3;
            }
            if (x == y) {
                total += 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        String[] gamesPoints = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(gamesPoints));
    }
}