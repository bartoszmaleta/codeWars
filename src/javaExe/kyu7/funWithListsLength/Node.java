package javaExe.kyu7.funWithListsLength;

public class Node {
    public Object data;
    public Node next;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) {
        this(data, null);
    }
}