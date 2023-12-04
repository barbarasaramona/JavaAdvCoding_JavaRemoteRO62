//package advanced.interfateFunctionale;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//
//public class Main {
//    public static void main(String[] args) {
//        Funtion funtion = (a, b) -> a + b;
//        System.out.println(funtion.sum(18, 22));
//        List<String> orase = Arrays.asList("Constanta", "Bucuresti", "Bacau", "Cluj");
//        Consumer<List<String>> oraseUpperCase = List -> {
//            for (int i = 0; i < List.size(); i++) {
//                List.set(i, List.get(i).toUpperCase());
//            };           ;
//            Consumer<List<String>> orasePrint = list -> {
//                list.stream().forEach(System.out::println);
//
//            };
//        };
//        oraseUpperCase.andThen(orasePrint).accept(orase);
//
//        Predicate<String> oraseCuLiteraB = x -> x.startsWith("B");
//        orase.stream().filter(oraseCuLiteraB).forEach(System.out::println);
//        orase.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);
//
//
//        Function<String, Integer> lungimeNUmeOrase = String::length;
//        orase.stream().map(lungimeNUmeOrase).forEach(System.out::println);
//
//        Supplier<Double> doubleSupplier = () -> Math::random;
//        System.out.println(doubleSupplier.get());
//    }
//}
