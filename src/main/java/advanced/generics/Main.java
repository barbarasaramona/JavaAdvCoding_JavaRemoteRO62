package advanced.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {4, 1, 9, 3, 0, 7, 5};
        Integer[] sortedArray = Sort.sort(intArray);
        for (Integer x : sortedArray) {
            //System.out.print(x + " , ");
        }
        // System.out.println(Arrays.toString(Sort.sort(intArray)));

        String[] stringArray = {"x", "a", "o", "p", "c", "l"};
        // System.out.println(Arrays.toString(Sort.sort(stringArray)));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");
        linkedList.add("test4");
        linkedList.add("test5");
        Iterator iterator = linkedList.listIterator(2);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
