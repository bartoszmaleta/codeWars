package java.kyu8;

public class AddingArrays {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        // int[] sumOfArrays = new int[arr1.length + arr2.length];
        // sumOfArrays = Arrays.copyOf(arr1, arr1.length + arr2.length);
        // System.arraycopy(arr2, 0, sumOfArrays, arr1.length, arr2.length);
        // return sumOfArrays;
    
        int totalSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            totalSum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            totalSum += arr2[i];
        }
        return totalSum;        
        
      }
    
}