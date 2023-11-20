package advanced.clase_anonime;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car(25000, CarType.Mercedes,2018);
        Car mercedes1 = new Car(20000, CarType.Mercedes,2016);
        Car fiat = new Car(2000, CarType.Fiat,2002);
        Car fiat1 = new Car(5000, CarType.Fiat,2010);
        Car skoda = new Car(5000, CarType.Skoda,2012);
        Car skpda1 = new Car(7000, CarType.Skoda,2014);

        Dealership dealership = new Dealership();
        System.out.println(dealership.getFinalPrice(mercedes));
    }
}
