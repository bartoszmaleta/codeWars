package javaExe.kyu7;

public class GrowingPlantTODO {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        //coding and coding..
        int numDay = 0;
        int actualHeight = 0;
        boolean isRunning = true;


        while (isRunning) {
            numDay++;
            actualHeight += upSpeed;
            if (actualHeight >= desiredHeight) {
                return numDay + 1;
            } else {
                actualHeight += downSpeed;
            }
        }




        return 0;
    }

    public static void main(String[] args) {
        int result = growingPlant(100, 10, 910);
        System.out.println(result);
    }
}

