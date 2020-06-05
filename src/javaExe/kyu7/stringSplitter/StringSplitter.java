package javaExe.kyu7.stringSplitter;

public class StringSplitter {
    public static void main(String[] args) {
        String content = "Thequickbrownfoxjumps";
        String contentCreated = "";
        while (content.length() > 4) {
            System.out.print(content.substring(0, 4) + " ");
            contentCreated += content.substring(0, 4) + " ";
            content = content.substring(4);
        }

        System.out.println(content);

        contentCreated += content;
        System.out.println("contentCreated = " + contentCreated);

        // EXERCISE EXAMPLE
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }

    public static String splitInParts(String s, int partLength) {
        String content = s;
        String contentCreated = "";
        while (content.length() > partLength) {
            // System.out.print(content.substring(0, 4) + " ");
            contentCreated += content.substring(0, partLength) + " ";
            content = content.substring(partLength);
        }
        // System.out.println(content);

        contentCreated += content;
        // System.out.println("contentCreated = " + contentCreated);
        return contentCreated;
    }
}