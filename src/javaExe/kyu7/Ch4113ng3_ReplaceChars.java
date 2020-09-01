package javaExe.kyu7;

public class Ch4113ng3_ReplaceChars {
    public static String nerdify(String txt){
        return txt.replaceAll("a", "4")
                  .replaceAll("A", "4")
                  .replaceAll("e", "3")
                  .replaceAll("E", "3")
                  .replaceAll("l", "1");
    }

    public static void main(String[] args) {
        System.out.println(nerdify("Fund4m3nt41s"));
        System.out.println(nerdify("Seven"));
        System.out.println(nerdify("Los Angeles"));
        System.out.println(nerdify("Seoijselawuue"));
    }

    public static String nerdify2(String txt){
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
    }
}
