package advanced.generics;

import java.util.*;

public class Sort {
    public static <T extends Comparable<T>> T[] sort(T[] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length-1; i++ ) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].compareTo(newArray[j+1]) > 0) {
                   T temp = newArray[j];
                   newArray[j] = newArray[j+1];
                   newArray[j+1] = temp;
                }
            }
        }
        return newArray;
    }
}
