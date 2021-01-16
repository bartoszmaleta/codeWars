package javaExe.kyu7;

import java.util.List;

public class DescribeALlist {
    public static String describeList(final List list) {
        return list.size() < 1 ? "empty" : list.size() < 2 ? "singleton" : "longer";
    }
}
