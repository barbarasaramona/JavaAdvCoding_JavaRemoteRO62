package advanced.clase_anonime;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car(20000, CarType.Mercedes, 2010);
        Car mercedes1 = new Car(35000, CarType.Mercedes, 2015);

        Car fiat = new Car(3500, CarType.Fiat, 2008);

        Car skoda = new Car(12000, CarType.Skoda, 2009);

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
        cars.add(skoda);
        System.out.println(cars);

        cars.removeIf(car -> car.getPrice() > 25000);
        System.out.println(cars);

    }
}
