package datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    /**
     * Por cada query Q, tenemos que devolver la suma de los números en numbers desde numbers[Q.first] hasta numbers[Q.second]
     * list.size <= 10^5
     * queries.size <= 10^5
     * <p>
     * Example:
     * {2, 5, 9 ,14 ,20, 27 ,43, 45, 45}
     * list = [2, 3, 4, 5, 6, 7, 15, 2, 0]
     * queries = [
     * [1, 2], = for
     * [3, 4], = for
     * [0, 0], = for
     * [0, 4], = for
     * [0, 7], = for
     * ]
     * answer = [7, 11, 2, 20]
     */

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 15, 2, 0};
        int[][] queries = {{1, 2}, {3, 4}, {0, 0}, {0, 4}};
        System.out.println(getSumInRanges(numbers, queries));
    }

    static ArrayList<Integer> getSumInRanges(int[] numbers, int[][] queries) {
        ArrayList<Integer> addLists = new ArrayList<Integer>();

        addLists.add(numbers[0]);//2

        for (int index = 0; index < numbers.length; index++) {
            if (index > 0) {
                addLists.add(addLists.get(index - 1) + numbers[index]);
            }
        }

        //{0,10}


        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int row = 0; row < queries.length; row++) {
            //     * [1, 2],
            int startIndex = queries[row][0];//1
            int endIndex = queries[row][1]; //2

            if (startIndex != 0) {
                //9 - 0
                results.add(addLists.get(endIndex) - addLists.get(startIndex - 1) );
            } else {
                results.add(addLists.get(endIndex));
            }
        }

        return results;
    }
}
