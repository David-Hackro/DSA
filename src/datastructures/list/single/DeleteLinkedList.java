package datastructures.list.single;

class DeleteLinkedList {

    Node head;

    static
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }


    static Node deleteNode(Node head, int position) {
        Node temp = head;
        Node prev = null;
        int counter = 0;

        while (temp != null && counter != position) {
            prev = temp;
            temp = temp.next;
            counter++;
        }

        prev.next = temp.next;


        return head;
    }

    static void printLinkedList(Node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DeleteLinkedList linkedList = new DeleteLinkedList();

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

        printLinkedList(head);
        System.out.println("-----------------------------");


        head = deleteNode(head, 3);
        printLinkedList(head);

    }

}
