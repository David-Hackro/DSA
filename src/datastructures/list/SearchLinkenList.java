package datastructures.list;

import datastructures.list.LinkedList.Node;

public class SearchLinkenList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        list.head = head;
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        Node node5 = new Node(8);

        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(findNodeRecursive(head, 8));

    }

    public static boolean findNodeIterative(Node node, int targetData) {

        while (node.next != null) {
            if (node.data == targetData) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public static boolean findNodeRecursive(Node node, int targetData) {

        if (node.next == null) {
            return false;
        }

        if (node.data == targetData) {
            return true;
        }


        return findNodeRecursive(node.next, targetData);
    }
}
