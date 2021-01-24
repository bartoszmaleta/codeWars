package javaExe.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestUnusedID {

    // CLEANER VERSION
    public static int nextId(int[] ids) {
        Arrays.sort(ids);
        if (ids.length == 0 || ids[0] != 0) return 0;

        for (int i = 0; i < ids.length; i++) {
            if (i + 1 > ids.length - 1) return ids[ids.length - 1] + 1;
            if (ids[i + 1] != ids[i] + 1 && ids[i + 1] != ids[i]) return ids[i] + 1;
        }
        return 0;
    }

    public static int nextId2(int[] ids) {
        System.out.println(Arrays.toString(ids));

        Arrays.sort(ids);
        System.out.println(Arrays.toString(ids));


        if (ids.length == 0 || ids[0] != 0) return 0;

        for (int i = 0; i < ids.length; i++) {
            if (i + 1 > ids.length - 1) {
                return ids[ids.length - 1] + 1;
            }
            int number = ids[i];
            int nextNumber = ids[i + 1];
            if (nextNumber != number + 1 && nextNumber != number) {
                return number + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3 }));
        System.out.println(nextId(new int[] { 0, 2, 1, 5, 3}));
        System.out.println(nextId(new int[] { 0, 2, 1, 5, 3}));
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        System.out.println(nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }

    // SECOND VERSION
    public static int nextId3(int[] ids) {
        return IntStream.range(0, ids.length + 1).filter(id -> !IntStream.of(ids).anyMatch(x -> x == id)).findFirst().getAsInt();
    }
}
