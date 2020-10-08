package javaExe.kyu8;

public class BasicVariableAssignment {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;

    public static void main(String[] args) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

}

// PLUS TEST CASE

//import org.junit.Test;
//        import static org.junit.Assert.assertEquals;
//
//public class ExampleTest {
//    @Test
//    public void Test() {
//        Kata kata = new Kata();
//        assertEquals("codewa.rs", kata.getName());
//    }
//}