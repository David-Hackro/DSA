package datastructures.array;

public class ArraysExercices {

    public static void main(String[] args) {
        //sumArrayValues();
        //printGrid();
        calculateAverage();
    }


    //Write a Java program to sum values of an array

    public static void sumArrayValues() {
        int[] array = {
                22, 44, 66, 88, 4, 23, 56, 233
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("total: " + sum);
    }

    //Write a Java program to print the following grid
    /*
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
     */

    public static void printGrid() {
        char[] array = {
                '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'
        };


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");
        }

    }

    //Write a Java program to calculate the average value of array elements

    public static void calculateAverage() {
        double[] ranking = {4.5, 7.6, 2.0, 4.9, 9.8, 1.6};

        double total = 0;

        for (int i = 0; i < ranking.length; i++) {
            total += ranking[i];
        }
        double average = (total / ranking.length);

        System.out.println("Average: " + average);
    }
}
