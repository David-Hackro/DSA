package datastructures.list;

public class GetNthLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }


    static void printlLinkedList(Node node) {

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static int getNth(Node node, int position) {
        int counter = 0;

        while (node != null && counter != position) {
            counter++;
            node = node.next;
        }


        return node.data;
    }


    static int getNthRecursive(Node node, int position, int index) {
        if (position == index) {
            return node.data;
        }

        return getNthRecursive(node.next, position, index + 1);
    }


    public static void main(String[] args) {
        GetNthLinkedList linkedList = new GetNthLinkedList();

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

        System.out.println(getNth(head, 3));
        System.out.println(getNthRecursive(head, 3, 0));
    }

}
