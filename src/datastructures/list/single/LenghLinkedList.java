package datastructures.list.single;

public class LenghLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static void printLinkedList(Node node) {

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static int getSizeLinkedList(Node node) {
        int counter = 0;
        while (node != null) {
            node = node.next;
            counter++;
        }

        return counter;
    }

    static int getRecursiveSizeLinkedList(Node node, int counter) {
        if (node == null) {
            return counter;
        }

        return getRecursiveSizeLinkedList(node.next, counter + 1);
    }

    public static void main(String[] args) {
        LenghLinkedList linkedList = new LenghLinkedList();

        linkedList.head = new Node(0);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        linkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node head = linkedList.head;

        System.out.println(getSizeLinkedList(head));
        System.out.println(getRecursiveSizeLinkedList(head, 0));
    }
}
