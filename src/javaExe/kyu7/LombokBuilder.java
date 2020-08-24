package javaExe.kyu7;


import lombok.Getter;
import lombok.Builder;

@Getter
@Builder
public class LombokBuilder {
    private final int age;
    private final String name;
    private final String lastName;
    private final String city;
    private final String job;

    private static final String GREET = "hello";

    public String greet() {
        return GREET + " my name is " + name;
    }
}