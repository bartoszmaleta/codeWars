package java.kyu7;

import java.util.Arrays;

import static java.util.Comparator.comparingInt;
import static java.util.function.Function.identity;
import static java.util.stream.Stream.of;

public class SuzukiNeedsHelpLiningUpHisStudents {
    public static String[] lineupStudents(String students)
    {

//        List<String> studentsList = Arrays.asList(studentsArray);
//        System.out.println("studentsList = " + studentsList);

//        Collections.sort(studentsList, Comparator.comparing(String::length).reversed());
//        System.out.println("studentsList sorted by length = " + studentsList);

        String[] studentsArray = of(students.split(" "))
                .sorted(comparingInt(String::length).thenComparing(identity()).reversed()).toArray(String[]::new);

        return studentsArray;
    }

    public static void main(String[] args) {
        lineupStudents("Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi");

        System.out.println(Arrays.toString(lineupStudents("Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi")));
    }
}
