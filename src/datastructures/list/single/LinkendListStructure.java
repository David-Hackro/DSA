package datastructures.list.single;
import datastructures.list.single.LinkedList.Node;

class LinkendListStructure {

    public static void printList(Node node) {

        while (node != null) {
            System.out.println(node.data);

            node = node.next;
        }
    }

    public static void main(String[] args) {

        LinkedList linkenlist = new LinkedList();
        linkenlist.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node a = new Node(50);


        linkenlist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = a;


        printList(linkenlist.head);
    }
}