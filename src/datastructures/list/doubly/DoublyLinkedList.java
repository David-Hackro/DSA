package datastructures.list.doubly;

public class DoublyLinkedList {

    Node head;

    static class Node {
        Node next;
        Node prev;
        int data;

        Node(int d) {
            data = d;
        }
    }

    static Node insertAtTheFront(Node head, int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        newNode.prev = null;


        head.prev = newNode;

        head = newNode;

        return head;
    }

    static Node insertAfter(Node head, int value, int position) {
        Node node = head;
        Node newNode = new Node(value);
        int counter = 0;

        while (node != null && position != counter) {
            counter++;
            node = node.next;
        }

        Node prevNode = node;
        newNode.next = prevNode.next;

        prevNode.next = newNode;

        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        return head;
    }

    static Node insertAtTheEnd(Node head, int value) {
        Node newNode = new Node(value);
        Node node = head;

        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
        newNode.prev = node;

        return head;
    }

    static void printLinkedList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        linkedList.head = head;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println("-------- Insert at the front ------------");
        head = insertAtTheFront(head, -1);
        printLinkedList(head);

        System.out.println("-------- Insert after ------------");
        head = insertAfter(head, 100, 3);
        printLinkedList(head);

        System.out.println("-------- Insert at the end------------");
        head = insertAtTheEnd(head, 7);
        printLinkedList(head);
    }
}
