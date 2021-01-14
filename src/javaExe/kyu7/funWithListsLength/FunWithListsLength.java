package javaExe.kyu7.funWithListsLength;

// LINK: https://www.codewars.com/kata/581e476d5f59408553000a4b/train/java

import java.util.Optional;

public class FunWithListsLength {
    static int length(Node head) {
        if (head == null || head.data == null) return 0;

        int counter = 1;
        Node next = head.next;

        while (next.data != null) {
            counter++;
            next = next.next;
            if (next == null) break;
        }
        return counter;
    }

    // SECOND OPTION
    static int length2(Node head) {
        if(head == null) return 0;
        return length(head.next) + 1;
    }

    // THIRD OPTION
    static int length3(Node head) {
        return head == null ? 0 : 1 + length(head.next);
    }

    // FOURTH OPTION
    static int length4(Node head) {
        return Optional
                .ofNullable(head)
                .map(node -> 1 + length(node.next))
                .orElse(0);
    }
}
