package datastructures.stack;

public class Stack {

    private int array[];
    int top;
    int capacity;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int element) {
        if (isFull()) {
            System.out.println("Stack full");
            System.exit(1);
        } else {
            top++;
            array[top] = element;
        }
        //System.out.println("Inserting " + element + " at the position " + top);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack empy");
            return -1;
        } else {
            int result = array[top];
            top--;
            return result;
        }
    }


    int size() {
        return top + 1;
    }


    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void printStack(Stack stack) {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }

    }
}
