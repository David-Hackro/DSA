package datastructures.list;

public class ConvertLinkedListToArray {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static Node fullLinkenlist(Node head) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        return head;
    }


    public static void showLinkedList(Node head) {

        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }


    public static int[] convertLinkedListToArray(Node head) {

        Node n = head;
        int size = 0;

        while (n != null) {
            size++;
            n = n.next;
        }

        int[] items = new int[size];

        Node nn = head;
        int i = 0;

        while (nn != null) {
            items[i] = nn.data;
            i++;
            nn = nn.next;
        }

        return items;
    }


    public static void main(String[] args) {
        ConvertLinkedListToArray list = new ConvertLinkedListToArray();
        Node head = new Node(0);
        head = fullLinkenlist(head);
        //showLinkedList(head);

        int[] convert = convertLinkedListToArray(head);

        for (int i = 0; i < convert.length; i++) {
            System.out.println(convert[i]);
        }

    }

}
