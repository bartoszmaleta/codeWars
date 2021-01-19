package javaExe.kyu7.funWithListslastIndexOf;

import javaExe.kyu7.funWithListsLength.Node;

import java.util.ArrayList;
import java.util.List;

public class FunWithListsLastIndexOf {
    static int lastIndexOf(Node head, Object value) {
        if (head == null || head.data == null) return -1;
        if (head.data.equals(value)) return 0;

        int lastFoundIndex = 0;
        int counter = 1;
        Node next = head.next;

        while (next.data != null) {
            counter++;
            if (next.data.equals(value)) {
                lastFoundIndex = counter - 1;
            }
            next = next.next;
            if (next == null) break;
        }
        return lastFoundIndex == 0 ? -1 : lastFoundIndex;
    }

    // SECOND OPTION
    static int lastIndexOf2(Node head, Object value) {
        int index = -1;
        for (int i = 0; head != null; head = head.next, i++) {
            if (head.data.equals(value)) index = i;
        }
        return index;
    }
}
