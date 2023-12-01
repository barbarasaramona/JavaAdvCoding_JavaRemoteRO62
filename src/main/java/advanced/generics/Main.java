package advanced.generics;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("===== sorting");
    Integer[] intArray = {4, 1, 9, 3, 0, 7, 5};
    Integer[] sortedArray = Sort.sort(intArray);
    System.out.println("  printing with canonical for loop");
    if (0 < sortedArray.length) {
      System.out.print(sortedArray[0]);
      for (int index = 1; sortedArray.length > index; ++index) {
        System.out.print(", " + sortedArray[index]);
      }
      System.out.println();
    }
    //
    String[] stringArray = {"x", "a", "o", "p", "c", "l"};
    System.out.println("  printing with Arrays.toString");
    System.out.println(Arrays.toString(Sort.sort(stringArray)));
    //
    System.out.println("===== using iterator");
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("test1");
    linkedList.add("test2");
    linkedList.add("test3");
    linkedList.add("test4");
    linkedList.add("test5");
    Iterator iterator = linkedList.listIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
