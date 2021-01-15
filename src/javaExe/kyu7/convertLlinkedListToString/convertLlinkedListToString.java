package javaExe.kyu7.convertLlinkedListToString;

public class convertLlinkedListToString {

    public static String stringify(Node head) {
        if (head == null) return "null";

        StringBuilder sb = new StringBuilder();

        sb.append(head.getData()).append(" -> ");
        Node next = head.getNext();

        while (next != null) {
            sb.append(next.getData()).append(" -> ");
            next = next.getNext();
        }
        return sb.append("null").toString();
    }

    // SECOND OPTION
    public static String stringify2(Node list) {
        return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
    }

    // THIRD OPTION
    static String stringify3(Node node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getData()).append(" -> ");
            node = node.getNext();
        }
        return sb.append("null").toString();
    }

    // HELPER VERSION
    public static String stringify_HELPER(Node head) {
        if (head == null) return "null";

        StringBuilder sb = new StringBuilder();

        Node next = head.getNext();
        System.out.println("here1");
        int data = head.getData();
        System.out.println("here2");
        sb.append(data).append(" -> ");
        System.out.println("here3");
        while (next != null) {
            System.out.println("here4");

            sb.append(next.getData()).append(" -> ");
            System.out.println("here5");
            next = next.getNext();
            System.out.println("here6");



            System.out.println("after loop");
        }
        System.out.println("here7");
        sb.append("null");
        System.out.println("here8");

        System.out.println(sb.toString());


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringify(new Node(1, new Node(2, new Node(3)))));
    }
}
