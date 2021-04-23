package datastructures.stack;

import java.util.Stack;

public class QueueStackFirstMethod {

    private static Stack<Integer> s1 = new Stack<Integer>();
    private static Stack<Integer> s2 = new Stack<Integer>();

    static void enQueue(int element) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(element);


        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }


    static int deQueue() {

        while (!s2.isEmpty()) {
            s2.pop();
        }

        int result = s1.peek();
        s1.pop();

        return result;
    }


    public static void main(String[] args) {
        QueueStackFirstMethod queue = new QueueStackFirstMethod();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());

    }
}
