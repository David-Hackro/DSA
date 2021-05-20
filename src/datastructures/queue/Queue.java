
class Queue {
    int[] items;
    int size;
    int front;
    int rear;


    Queue() {
        size = 5;
        items = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return front == 0 && rear == size - 1;
    }


    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int value) {
        if (isFull()) {
            System.out.println("the queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            items[rear] = value;
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");

            return -1;
        }

        int val = items[front];

        if (front >= rear) {
            front = -1;

        } else {
            front++;
        }

        return val;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}