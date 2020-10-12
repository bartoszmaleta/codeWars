package javaExe.kyu8;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return Math.max(0, on + wait - cap);
    }
}
