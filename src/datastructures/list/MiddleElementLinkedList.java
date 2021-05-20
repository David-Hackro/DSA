package datastructures.list;

public class MiddleElementLinkedList {

    Node head;


    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }


    public static Node fullNodeList(Node head) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        return head;
    }

    public static void showList(Node head) {
        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static Node getMiddleElement(Node head) {

        int size = 0;
        Node n = head;

        while (n != null) {
            size++;
            n = n.next;
        }


        int middle = (size % 2 == 0) ? (size / 2) : ((size / 2) + 1);

        int counter = 0;
        Node nn = head;

        while (nn != null) {
            if (counter == middle) {
                return nn;
            }
            counter++;
            nn = nn.next;
        }

        return null;
    }


    public static void main(String[] args) {
        Node head = new Node(0);

        head = fullNodeList(head);
        showList(head);

        Node middleNode = getMiddleElement(head);

        System.out.println("midle element: " + middleNode.data);
    }

}
