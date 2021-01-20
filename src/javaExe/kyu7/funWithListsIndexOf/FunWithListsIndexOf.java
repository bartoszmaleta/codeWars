package javaExe.kyu7.funWithListsIndexOf;

public class FunWithListsIndexOf {
    static int indexOf(Node head, Object value) {
        if (head == null || head.data == null) return -1;
        if (head.data.equals(value)) return 0;

        int firstIndexOf = 0;
        int counter = 1;
        Node next = head.next;

        while (next.data != null) {
            counter++;
            if (next.data.equals(value)) {
                firstIndexOf = counter - 1;
                break;
            }
            next = next.next;
            if (next == null) break;
        }
        return firstIndexOf == 0 ? -1 : firstIndexOf;
    }

    // SECOND OPTION
    static int indexOf2(Node head, Object value) {
        int index = -1;
        for (int i = 0; head != null; head = head.next, i++) {
            if (head.data.equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // THIRD OPTION
    static int indexOf3(Node head, Object value) {
        for (int i = 0; head != null; head = head.next, i++) {
            if (head.data.equals(value)) return i;
        }
        return -1;
    }
}
