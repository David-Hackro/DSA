import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

    // Complete the isValid function below.
    // Complete the isValid function below.
    static String isValid(String s) {
        //ababcc
        //aabbccc

        char[] sortWord = s.toCharArray();
        Arrays.sort(sortWord);
        int maxCounter = 1; //2
        int maxCounterNext = 0;
        char firstLetter = sortWord[0];
        boolean firstLetterFlag = true;
        int onlyException = 0;
        String result = "YES";

        //aabbccc
        for (int index = 1; index < sortWord.length; index++) {

            if (firstLetterFlag && (sortWord[index] == firstLetter)) {
                maxCounter++;
            } else {

                if (onlyException >= 2) {
                    result = "NO";
                    break;
                }

                firstLetterFlag = false; // flag for validate only the first letter [Only a,a]
                //b
                if (firstLetter != sortWord[index]) {
                    firstLetter = sortWord[index];
                    maxCounterNext = 1;
                } else if (maxCounterNext > maxCounter + 1) { //[2] > 3
                    onlyException++;
                } else {
                    maxCounterNext++;
                }
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
