package javaExe.kyu8;

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        switch (op.toCharArray()[0]) {
            case '+':
                result = v1 + v2;
                break;
            case '-':
                result = v1 - v2;
                break;
            case '*':
                result = v1 * v2;
                break;
            case '/':
                result = v1 / v2;
                break;
        }
        return result;
    }
}
