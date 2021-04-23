package algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numArray = {1, 4, 5, 7, 8, 11, 14, 15, 20, 30, 45, 46, 47, 59, 60, 70};

        int guess = 47;

        System.out.println(binarySearch(numArray, guess));
    }

    public static boolean binarySearch(int[] array, int guess) {
        int left = 0;
        int rigth = array.length - 1;

        while (left <= rigth) {
            int mid = (left + rigth) / 2;

            if (array[mid] == guess) {
                return true;
            } else if (array[mid] > guess) {
                rigth = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }


}
