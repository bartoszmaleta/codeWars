package javaExe.kyu8;

public class CSVRepresentationOfArray {
    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 } }));
    }

    public static String toCsvText(int[][] array2d){
        StringBuilder sb = new StringBuilder();
        for (int[] array1d : array2d) {
            for (int i = 0; i < array1d.length; i++) {
                sb.append(array1d[i]);
                if (i < array1d.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("\n");
        }

        return sb.toString().trim();
    }
}
