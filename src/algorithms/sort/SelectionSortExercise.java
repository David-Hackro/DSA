package algorithms.sort;

public class SelectionSortExercise {
    //sum all consecutive numbers

    public static void main(String[] args) {
        int[] arrayNumbers = {9, 8, 6, 7, 4, 5, 3, 1, 2};
        //sort the array using åselection sort
        int[] arrays = selectionSort(arrayNumbers);

        for (int i = 1; i < arrayNumbers.length; i++) {
            int current = arrayNumbers[i];
            int prev = arrayNumbers[i - 1];
            arrayNumbers[i] = current + prev;
        }

        System.out.println(arrays[6]);
    }

    public static int[] selectionSort(int[] array) {
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

        return array;
    }
}
