package advanced.interfateFunctionale;

public class Main {
    public static void main(String[] args) {
        Funtion funtion = (a, b) -> a + b;
        System.out.println(funtion.sum(18,22));
    }
}
