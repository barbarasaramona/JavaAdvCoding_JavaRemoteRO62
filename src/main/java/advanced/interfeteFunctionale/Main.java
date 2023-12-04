package advanced.interfeteFunctionale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Function function = (a, b) -> a + b;
        System.out.println(function.sum(10,12));
        List<String> orase = Arrays.asList("Constanta", "Bucuresti", "Bacau", "Cluj");
        Consumer<List<String>> oraseUpperCase = list -> {
           for(int i = 0 ; i < list.size(); i++){
               list.set(i,list.get(i).toUpperCase());
           }
        };
        Consumer<List<String>> orasePrint = list -> {
            //System.out.println(list);
            list.stream().forEach(System.out::println);
        };
        oraseUpperCase.andThen(orasePrint).accept(orase);

        Predicate<String> orascuLiteraB = x -> x.startsWith("B");
         orase.stream().filter(orascuLiteraB).forEach(System.out::println);
         orase.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);

    }
}
