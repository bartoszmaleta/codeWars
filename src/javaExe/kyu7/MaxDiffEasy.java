package javaExe.kyu7;

import java.util.Arrays;

public class MaxDiffEasy {
    public static int maxDiff(int[] lst) {
        if (lst.length == 0 || lst.length == 1) {
            return 0;
        }
//        System.out.println(Arrays.toString(lst));
        int maxValueOfLst = Integer.MIN_VALUE;
//        int minValueOfList;
        for (int num : lst) {
            if (num > maxValueOfLst) {
                maxValueOfLst = num;
            }
        }
//        System.out.println(maxValueOfLst);

        int minValueOfLst = Integer.MAX_VALUE;
        for (int num : lst) {
            if (num < minValueOfLst) {
                minValueOfLst = num;
            }
        }
//        System.out.println(minValueOfLst);

        int result = maxValueOfLst - minValueOfLst;

//        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        maxDiff(new int[]{  1, 2, 3, 4, -5, 5, 4  });
    }
    // -------------------------


    public static int maxDiff2(int[] lst) {
        return lst.length == 0 ? 0 :
                Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
    }

    // -------------------------

    public static int maxDiff3(final int[] lst) {
//        return stream(lst).max().orElse(0) - stream(lst).min().orElse(0);
        return 1; // TO DELETE, ONLY ABOVE RETURN NEEDED!
    }



    // -------------------------

    public static int maxDiff4(int[] lst) {

        if(lst.length<=1){
            return 0;
        }
        else{
            Arrays.sort(lst);
            return lst[lst.length-1]-lst[0];
        }
    }

}
