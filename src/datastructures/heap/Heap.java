package datastructures.heap;

import java.util.ArrayList;

class Heap {
    /*

        - Start from the first index of non-leaf node whose index is given by n/2 - 1.
        - Set current element i as largest.
        - The index of left child is given by 2i + 1 and the right child is given by 2i + 2.
        If leftChild is greater than currentElement (i.e. element at ith index), set leftChildIndex as largest.

        - If rightChild is greater than element in largest, set rightChildIndex as largest.
        - Swap largest with currentElement


    */
    static void heapify(ArrayList<Integer> ht, int i) {
        int size = ht.size();

        //Set current element i as largest
        int largest = i;

        //(2i + 1)
        int l = 2 * i + 1;
        //(2i + 2)
        int r = 2 * i + 2;

        if (l < size && ht.get(l) > ht.get(largest)) {
            largest = l;
        }

        if (r < size && ht.get(r) > ht.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            int temp = ht.get(largest);
            ht.set(largest, ht.get(i));
            ht.set(i, temp);

            heapify(ht, largest);
        }
    }

    /*
    If there is no node,
      create a newNode.
    else (a node is already present)
      insert the newNode at the end (last node from left to right.)

    heapify the array
    */
    static void insert(ArrayList<Integer> ht, int newNum) {
        int size = ht.size();

        if (size == 0) {
            ht.add(newNum);
        } else {
            ht.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(ht, i);
            }
        }
    }


	/*
	If nodeToBeDeleted is the leafNode
	  remove the node
	Else swap nodeToBeDeleted with the lastLeafNode
	  remove noteToBeDeleted

	heapify the array
	*/


    static void delete(ArrayList<Integer> ht, int num) {
        int size = ht.size();
        int i;

        for (i = 0; i < size; i++) {
            if (num == ht.get(i)) {
                break;
            }
        }

        int temp = ht.get(i);
        ht.set(i, ht.get(size - 1));
        ht.set(size - 1, temp);

        ht.remove(size - 1);


        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(ht, j);
        }
    }

    static void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        Heap h = new Heap();

        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Max-Heap array ");
        printArray(array, size);

        h.delete(array, 4);
        System.out.println("After deleting an element: ");
        printArray(array, size);


    }

}