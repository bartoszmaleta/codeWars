package javaExe.kyu7;

import java.util.Arrays;

public class HelpSuzukiCompleteHisChoresTODO {
    public static int[] choreAssignments2(int[] chores) {
        int[] result = new int[chores.length / 2];

        for (int i = 0, j = chores.length - 1, k = result.length - 1
             ; i < result.length
                ; i++, j--, k--) {
            result[i] = chores[i] + chores[j];
        }
        Arrays.sort(result);
        return result;
    }


    public static int[] choreAssignments(int[] chores) {

        int[] array = new int[chores.length / 2];

        for (int i = 0, j = chores.length - 1, k = array.length - 1; i < array.length; i++, j--, k--) {
            array[i] = chores[i] + chores[j];
        }

        Arrays.sort(array);
        return array;
    }
}
