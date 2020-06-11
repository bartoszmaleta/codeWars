package javaExe.kyu8;

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && vacation) {
            return false;
        } else if (!employed && vacation) {
            return false;
        } else if (!employed && !vacation) {
            return false;
        } else  {
            return true;
        }
    }
}
