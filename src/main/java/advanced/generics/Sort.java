package advanced.generics;

import java.util.*;

public class Sort {
  public static <T extends Comparable<T>> T[] sort(T[] array) {
    T[] newArray = Arrays.copyOf(array, array.length);
    int parsingSize = newArray.length;
    boolean swapped;
    do {
      --parsingSize;
      swapped = false;
      for (int index = 0; index < parsingSize; index++) {
        if (0 < newArray[index].compareTo(newArray[index + 1])) {
          T temp = newArray[index];
          newArray[index] = newArray[index + 1];
          newArray[index + 1] = temp;
          swapped = true;
        }
      }
    }
    while (swapped);
    return newArray;
  }
}
