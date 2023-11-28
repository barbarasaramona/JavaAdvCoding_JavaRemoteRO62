package advanced.clase_anonime;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Car mercedes = new Car(30000, CarType.MERCEDES, 2019);
        Car mercedes1 = new Car(50000, CarType.MERCEDES, 2021);
        Car fiat = new Car(10000, CarType.FIAT, 2018);
        Car fiat1 = new Car(7000, CarType.FIAT, 2010);
        Car skoda = new Car(20000, CarType.SKODA, 2019);
        Car skoda1 = new Car(25000, CarType.SKODA, 2021);
        //System.out.println("The final price for the car is: " + dealership.getFinalPrice(mercedes) + "eur");
        dealership.negociate(mercedes1, new Offer() {
            @Override
            public int getDiscount(Car car) {
                Scanner scanner  = new Scanner(System.in);
                System.out.println("What's the client discount?");
                int clientDiscount = scanner.nextInt();
                return  clientDiscount;
            }
        });
        List<Car> carsList = new ArrayList<>();
        carsList.add(mercedes);
        carsList.add(mercedes1);
        carsList.add(fiat);
        carsList.add(skoda);

        System.out.println("The list before modifications" + carsList);

        carsList.removeIf(car -> car.getPrice() > 25000);
        System.out.println("updated list: " + carsList);

    }
}
