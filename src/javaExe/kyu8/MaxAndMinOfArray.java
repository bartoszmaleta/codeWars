package javaExe.kyu8;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

public class MaxAndMinOfArray {
    public int min(int[] list) {
        return Arrays.stream(list).min().orElse(0);
    }

    public int max(int[] list) throws InvalidAlgorithmParameterException {
        return Arrays.stream(list).max().orElse(0);
    }



    // SECOND OPTION
    public int min2(int[] list) throws InvalidAlgorithmParameterException {
        return Arrays.stream(list).min().orElseThrow(InvalidAlgorithmParameterException::new);
    }

    public int max2(int[] list) throws InvalidAlgorithmParameterException {
        return Arrays.stream(list).max().orElseThrow(InvalidAlgorithmParameterException::new);
    }
}
