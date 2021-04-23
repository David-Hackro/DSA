package datastructures.array;

public class Array {

    public static void main(String[] args) {
        int[] exampleA = {1, 2, 3};
        int exampleB[] = {1, 2, 3};

        readArray(exampleA);
    }

    public static void readArray(int[] array) {
        //array.length is a positive or zero
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
