package javaExe.kyu7.linkedListsGetNthNode;

public class LinkedListsGetNthNode {
//    public int data;
//    public Node next = null;

    public static int getNth(Node n, int index) throws Exception{
        if(index==0) return n.data;
        else return getNth(n.next,index-1);
    }

    // SECOND OPTION
    public static int getNth2(Node n, int index) throws Exception{
        if(index < 0) {
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.data;
    }


    // WRONG
    public static int getNth3(Node head, int index) throws Exception{
//         if (head == null || head.data == null) return 0;


            if (index < 0 || head == null || head.next == null) {
                throw new IllegalArgumentException("IAE");
            }


            System.out.println("=================");
            System.out.println("head.data = " + head.data);
            System.out.println("index = " + index);

            int counter = 0;
            if (counter == index) {
                System.out.println("Go");
                return (int) head.data;

            }
            Node next = head.next;
            System.out.println("counter before loop = " + counter);


            while (next != null) {
                System.out.println("next.data = " + next.data);


                counter++;
                System.out.println("counter in loop = " + counter);

                if (counter == index) return (int) next.data;
                next = next.next;
                System.out.println("next" + next);

                if (next == null) {
                    System.out.println("next = null");
                    throw new IllegalArgumentException("IAE");
//                    break;
                }
            }


        throw new AssertionError("AE");

//            assert (false);

//        return counter;
    }
}
