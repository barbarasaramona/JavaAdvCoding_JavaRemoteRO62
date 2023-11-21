package advanced.interfeteFunctionale;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function function = (a, b) -> a + b;
        System.out.println(function.sum(10, 12));
        List<String> orase = Arrays.asList("Constanta", "Bucuresti", "Bacau", "Cluj");
        Consumer<List<String>> oraseUpperCase = list -> {
          for (int i = 0; i < list.size(); i++) {
              list.set(i, list.get(i).toUpperCase());
          }
        };
        Consumer<List<String>> orasePrint = list -> {
            //System.out.println(list);
            list.stream().forEach(System.out::println);
        };
        oraseUpperCase.andThen(orasePrint).accept(orase);

        Predicate<String> oraseCuLiteraB = x -> x.startsWith("B");
        //orase.stream().filter(oraseCuLiteraB).forEach(System.out::println);
        orase.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);

        //java.util.function.Function<String, Integer> lungimeNumeOras = String::length;
        java.util.function.Function<String, Integer> lungimeNumeOras = nume -> nume.length();
        orase.stream().map(lungimeNumeOras).forEach(System.out::println);

        Supplier<Double> doubleSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return 12 + 21.4;
            }
        };
        System.out.println(doubleSupplier.get());

    }
}
