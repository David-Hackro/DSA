package datastructures.queue;

public class CircularQueue {

    int[] items;
    int size;
    int front;
    int rear;

    CircularQueue() {
        size = 5;
        items = new int[size];
        front = -1;
        rear = -1;
    }


    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }

        if (front == rear + 1) {
            return true;
        }

        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }


    void enQueue(int value) {
        if (isFull()) {
            System.out.println("circula queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;

            items[rear] = value;
            System.out.println("Queue value: " + value);
        }
    }


    int deQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        } else {
            int element = items[front];

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return element;
        }
    }


    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }

}
