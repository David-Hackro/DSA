package datastructures.hashtable;

import java.util.Hashtable;

public class Hash {

    public static void main(String[] args) {
        Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();

        hash.put(123, 10);
        hash.put(456, 20);
        hash.put(789, 30);

        System.out.println(hash);

        hash.remove(123);
        System.out.println(hash);

        System.out.println("Get the value with the key 456: " + hash.get(456));
        System.out.println("The hashtable contains the key 456:" + hash.containsKey(456));


    }
}
