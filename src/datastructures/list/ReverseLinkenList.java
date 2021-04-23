package datastructures.list;
import datastructures.list.LinkedList.Node;

class ReverseLinkenList {

    public static Node fullLinkenList(Node head) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node fourth = new Node(4);

        head.next = first;
        first.next = second;
        second.next = three;
        three.next = fourth;

        return head;
    }

    public static Node reverseLinkenList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node head = new Node(0);

        head = fullLinkenList(head);

        System.out.print("Reverse LinkenList");

        head = reverseLinkenList(head);

        Node node = head;
        System.out.println("");
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
