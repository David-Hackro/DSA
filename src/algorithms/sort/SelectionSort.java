package algorithms.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 6, 7, 4, 5, 3, 1, 2};

        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                //min > current
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int current = array[i];
                int next = array[minIndex];
                array[i] = next;
                array[minIndex] = current;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
