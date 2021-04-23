package datastructures.list;

import datastructures.list.LinkedList.Node;

public class PalindromeLinkenList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        list.head = head;

        Node node2 = new Node(0);
        Node node3 = new Node(0);
        Node node4 = new Node(1);

        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;

        printLinkenList(list.head);

        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(isPalindrome(list.head));

    }

    public static void printLinkenList(Node node) {

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static boolean isPalindrome(Node node) {
        Node n = node;
        int size = getSizeLinkenList(n);
        int middle = size/2;

        for(int i = 0; i < middle - 2; i++) {
            n = n.next;
        }

        //here are in the middle linkenlist
        //reverLinkenList

        Node secondPart = n;
        Node prev = secondPart;
        Node current = secondPart.next;
        Node next = null;

        while(current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondPart = prev;

        printLinkenList(secondPart);

        return false;
    }

    public static int getSizeLinkenList(Node node) {

        if (node.next != null) {
            return 0;
        }

        return 1 + getSizeLinkenList(node.next);
    }
}
