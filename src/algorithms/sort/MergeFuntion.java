package algorithms.sort;

public class MergeFuntion {

    public static void main(String[] args) {
        int[] unSortedList = {2, 6, 88, 745, 12, 985, 47, 12, 36, 0, 4, 6, 7, 8, 1, 6, 55, 64, 32, 84, 15};

        int[] sortedArray = mergeSort(unSortedList, 0, unSortedList.length - 1);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(i);
        }
    }

    public static int[] mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int middle = (l + r) / 2;

            mergeSort(array, l, middle);
            mergeSort(array, middle + 1, r);

            merge(array, l, middle, r);
        }

        return array;
    }


    public static void merge(int[] array, int p, int q, int r) {

        //A[p..q] / A[p+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }

        for (int j = 0; j < n2; j++) {
            M[j] = array[q + 1 + j];
        }

        int i = 0; //index L[]
        int j = 0;//index M[]
        int k = 0;//index array[p]

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n2) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (i < n2) {
            array[k] = M[i];
            i++;
            k++;
        }
    }


}
