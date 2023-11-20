package advanced.clase_anonime;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car(20000, CarType.MERCEDES, 2010);
        Car mercedes1 = new Car(35000, CarType.MERCEDES, 2015);

        Car fiat = new Car(3500, CarType.FIAT, 2008);
        Car fiat1 = new Car(7000, CarType.FIAT, 2010);

        Car skoda = new Car(12000, CarType.SKODA, 2015);
        Car skoda1 = new Car(25000, CarType.SKODA, 2021);

        Dealership dealership = new Dealership();

        System.out.println(dealership.getFinalPrice(mercedes));

        dealership.negotiate(mercedes1, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 5;
            }
        });

        List<Car> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(mercedes1);
        cars.add(fiat);
        cars.add(fiat1);
        cars.add(skoda);
        cars.add(skoda1);
        System.out.println(cars);

        cars.removeIf(car -> car.getPrice() > 25000);
        System.out.println(cars);
    }
}
