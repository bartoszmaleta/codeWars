package javaExe.kyu8;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(elem -> elem == x);
    }

    public static void main(String args[]) throws InterruptedException {
//        Instant start = Instant.now();
//        check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
//        Instant end = Instant.now();
//        System.out.println("stream = " + Duration.between(start, end)); // prints PT1M3.553S



        long startTime = System.nanoTime();
        check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
        long stopTime = System.nanoTime();
        System.out.println("stream = " + (stopTime - startTime));

        startTime = System.nanoTime();
        check2(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
        stopTime = System.nanoTime();
        System.out.println("new list = " + (stopTime - startTime));



//        start = Instant.now();
//        Thread.sleep(63553);
//        check2(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
//        end = Instant.now();
//        System.out.println("stream = " + Duration.between(start, end)); // prints PT1M3.553S
    }

    // SECOND OPTION
    public static boolean check2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
