package javaExe.kyu7;

import java.util.Arrays;

public class SplitThisJoint {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("a.b.c.")));
    }

    public static String[] split(final String joint) {
        return joint.isEmpty() ? new String[0] : joint.split("\\.",-1);
    }
}
