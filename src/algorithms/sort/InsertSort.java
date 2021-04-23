package algorithms.sort;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 5, 6, 9, 1, 2, 0};

        int[] sortArray = insertSort(arr);

        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(i);
        }
    }

    public static int[] insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }


}
