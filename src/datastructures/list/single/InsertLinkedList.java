package datastructures.list.single;

import static datastructures.list.single.LinkedList.*;

public class InsertLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);

        Node head = list.head;
        //full linkenlist insert at the beginning
        head = fullLinkenList(head);
        //Insert node at the end
        head = insertNodeAtTheEnd(head, new Node(1000));
        //Insert node at the specific position
        head = insertNodeAtTheSpecificPosition(head, new Node(90000), 2);

        //Insert list inside another list, specify the position
        LinkedList list2 = new LinkedList();
        list2.head = new Node(-1);
        Node head2 = list2.head;
        Node node2 = new Node(-2);
        list2.head.next = node2;

        head = insertListAtTheSpecificPosition(head, head2, 3);

        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static Node fullLinkenList(Node head) {
        head = insertNodeAtTheBeginning(head, new Node(100));
        head = insertNodeAtTheBeginning(head, new Node(200));
        head = insertNodeAtTheBeginning(head, new Node(300));
        head = insertNodeAtTheBeginning(head, new Node(400));

        return head;
    }

    public static Node insertNodeAtTheBeginning(Node head, Node newNode) {
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertNodeAtTheEnd(Node head, Node newNode) {
        Node n = head;

        while (n.next != null) {
            n = n.next;
        }

        n.next = newNode;

        return head;
    }

    public static Node insertNodeAtTheSpecificPosition(Node head, Node newNode, int position) {
        Node n = head;
        int count = 1;

        for (int i = 0; i <= position; i++) {
            if (n.next != null) {
                n = n.next;
            }
        }

        newNode.next = n.next;
        n.next = newNode;

        return head;
    }

    public static Node insertListAtTheSpecificPosition(Node head, Node head2, int position) {

        Node n = head;

        for (int i = 0; i < position; i++) {
            if (n != null) {
                n = n.next;
            }
        }

        Node tempList = n.next;
        n.next = head2;

        while (n.next != null) {
            n = n.next;
        }

        n.next = tempList;

        return head;
    }


    public static int getSize(Node head) {

        if (head == null) {
            return 0;
        }

        return 1 + getSize(head.next);
    }
}
