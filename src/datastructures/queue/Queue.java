package datastructures.queue;

public class Queue {

    int array[];
    int front;
    int rear;
    int size;

    Queue(int s) {
        size = s;
        array = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }

        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }

        return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue Full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            array[rear] = element;
        }
    }

    int deQueue() {
        if (isEmpty()) {
            return -1;
        }

        int element = array[front];
        if (front >= rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        return element;
    }


    public static void main(String[] args) {
        int size = 4;
        Queue queue = new Queue(size);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(6);
        queue.enQueue(8);
        
        for (int i = 0; i < size; i++) {
            System.out.println(queue.deQueue());
        }
    }
}
