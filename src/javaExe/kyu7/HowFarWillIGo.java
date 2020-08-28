package javaExe.kyu7;

public class HowFarWillIGo {
    public static int travel(int totalTime, int runTime, int restTime, int speed) {

        int totaltDistance = 0;
        boolean isRunning = true;


        while (totalTime > 0) {
            if (isRunning) {
                if (totalTime > runTime) {
                    totaltDistance += runTime * speed;
                    totalTime -= runTime;
                } else {
                    totaltDistance += totalTime * speed;
                    totalTime = 0;
                }
                isRunning = false;
            } else {
                if (totalTime > restTime) {
                    totalTime -= restTime;
                } else {
                    totalTime = 0;
                }
                isRunning = true;
            }
//            System.out.println("totalTime = " + totalTime);
//            System.out.println("totalDistance = " + totaltDistance);
        }

//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println("final totalTime = " + totalTime);
//        System.out.println("final totalDistance = " + totaltDistance);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//

        return totaltDistance;
    }

    public static void main(String[] args) {
        System.out.println(travel(1000, 10, 127, 14)); // 1120
        System.out.println(travel(100, 10, 0, 10)); // 1000
        System.out.println(travel(100, 10, 0, 10)); // 1000
        System.out.println(travel(25, 50, 120, 18)); // 450
    }

    // SECOND OPTION
    public static int travel2(int totalTime, int runTime, int restTime, int speed) {
        return (totalTime / (runTime + restTime) * runTime * speed) + (Math.min(totalTime % (runTime + restTime), runTime) * speed);
    }
    // THIRD OPTION
    public static int travel3(int totalTime, int runTime, int restTime, int speed) {
        // todo...
        int distance = 0;
        while(totalTime > 0)
        {
            distance += totalTime >= runTime ? runTime*speed : totalTime*speed;
            totalTime-=runTime;
            totalTime-=restTime;

        }
        return distance;
    }



}
