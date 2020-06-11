package javaExe.kyu8;

public class InterpretersHQ9 {
    public static String HQ9(char code) {
        int counter = 99;
        StringBuilder sb = new StringBuilder();

        while (counter > 2) {
            String oneVerse = String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
                    "Take one down and pass it around, %d bottles of beer on the wall.\n", counter, counter, counter - 1);
            sb.append(oneVerse);
            counter--;
        }
//        System.out.println(sb);
        String lastVerse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        sb.append(lastVerse);
        String result = sb.toString();
//        System.out.println(result);

        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return String.valueOf(code);
            case '9':
                return result;
            default: return null;
        }
    }

    public static void main(String[] args) {
        HQ9('9');
    }
}
