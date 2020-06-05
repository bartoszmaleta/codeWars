package javaExe.kyu8;

public class OddNumbersBelowNCounter {

    public static int oddCount(int n){
        // int counter = 0;

        // option 1 ====> for loop
        // for (int i = 0; i < n; i++) {
            // if ((i % 2) != 0) {
                // counter++;
            // }
        // }
        // int x = 0;


        // option 2 ====> while loop
        // while (x < n) {
            // if ((x % 2) != 0) {
                // counter++;
            // }
            // x++;
        // }

        // return counter;


        // option 3 ====> one line algo
        int result = (n / 2);
        return result;

    }

    public static void main(String[] args ) {
        System.out.println(oddCount(7));
        System.out.println(oddCount(15));
        System.out.println(oddCount(15023));

    }
  
  }                     