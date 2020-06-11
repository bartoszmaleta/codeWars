package javaExe.kyu8;

import java.util.Arrays;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n){
        int[] monkeys = new int[n];
//        System.out.println(Arrays.toString(monkeys));
//        System.out.println(monkeys.length);

        for (int i = 0; i < monkeys.length; i++) {
            monkeys[i] = i + 1;
        }

//        System.out.println(Arrays.toString(monkeys));

        return monkeys;

    }

    public static void main(String[] args) {
        monkeyCount(5);
    }
}
