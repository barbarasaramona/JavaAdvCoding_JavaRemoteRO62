package advanced.interfeteFunctionale;

public class Main {
    public static void main(String[] args) {
        Function function = (a, b) -> a + b;
        System.out.println(function.sum(10,12));
    }
}
