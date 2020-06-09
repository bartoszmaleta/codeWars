package javaExe.kyu8;

public class TEEEEESTalgo {
    public static void main(String[] args) {
        first_tree(5);
        boolToWord(false);
    }

    public static void first_tree(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println('*');
            }
            System.out.println("\n");
        }

    }

    public static String boolToWord(boolean b) {
        String msg = b == true ? "Yes" : "No";
//        System.out.println(msg);
        return msg;
    }
}
