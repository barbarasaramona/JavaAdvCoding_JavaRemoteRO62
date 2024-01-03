package advanced.interfete_functionale;

import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    AFunction function = (a, b) -> a + b;
    // what happens behind the scene
//    AFunction function = new AFunction() {
//      @Override
//      public int sum(int a, int b) {
//        return a + b;
//      }
//    };
    // more off what happens behind the scene
    //   OBS.: AFunctionClass is a local class, but it can very well represent an inner class or a top-level one
//    class AFunctionClass implements AFunction {
//      @Override
//      public int sum(int a, int b) {
//        return a + b;
//      }
//    }
//    AFunction function = new AFunctionClass();
    System.out.println(function.sum(10, 12));
    //
    List<String> orase = Arrays.asList("Constanta", "Bucuresti", "Bacau", "Cluj");
    //
    Consumer<List<String>> oraseUpperCase = list -> {
      for (int i = 0; i < list.size(); i++) {
        list.set(i, list.get(i).toUpperCase());
      }
    };
    Consumer<List<String>> orasePrint = list -> {
      list.stream().forEach(System.out::println);
    };
    oraseUpperCase.andThen(orasePrint).accept(orase);
    //
    Predicate<String> oraseCuLiteraB = x -> x.startsWith("B");
    orase.stream().filter(oraseCuLiteraB).forEach(System.out::println);
    // the lambda expression may be used directly
//    orase.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);
    //
    Function<String, Integer> lungimeNumeOras = nume -> nume.length();
    // or with method reference
//    Function<String, Integer> lungimeNumeOras = String::length;
    orase.stream().map(lungimeNumeOras).forEach(System.out::println);
    //
    Supplier<Double> doubleSupplier = () -> 12 + 21.4;
    // what happens behind the scene
//    Supplier<Double> doubleSupplier = new Supplier<>() {
//      @Override
//      public Double get() {
//        return 12 + 21.4;
//      }
//    };
    // more off what happens behind the scene
    //   OBS.: SupplierDouble is a local class, but it can very well represent an inner class or a top-level one
//    class SupplierDouble implements Supplier<Double> {
//      @Override
//      public Double get() {
//        return 12 + 21.4;
//      }
//    }
//    Supplier<Double> doubleSupplier = new SupplierDouble();
    System.out.println(doubleSupplier.get());
  }
}
