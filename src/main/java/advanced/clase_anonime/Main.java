package advanced.clase_anonime;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new Car(20000, CarType.MERCEDES, 2010);
        Car mercedes2 = new Car(35000, CarType.MERCEDES, 2015);
        Car fiat1 = new Car(3500, CarType.FIAT, 2008);
        Car fiat2 = new Car(7000, CarType.FIAT, 2010);
        Car skoda1 = new Car(12000, CarType.SKODA, 2015);
        Car skoda2 = new Car(25000, CarType.SKODA, 2021);

        Dealership dealership = new Dealership();

        System.out.println("Final price for Mercedes 1: " + dealership.getFinalPrice(mercedes1));
        System.out.println("Final price for Mercedes 2: " + dealership.getFinalPrice(mercedes2));
        System.out.println("Final price for Fiat 1: " + dealership.getFinalPrice(fiat1));
        System.out.println("Final price for Fiat 2: " + dealership.getFinalPrice(fiat2));
        System.out.println("Final price for Skoda 1: " + dealership.getFinalPrice(skoda1));
        System.out.println("Final price for Skoda 2: " + dealership.getFinalPrice(skoda2));

        // Negociere cu o ofertă sub formă de clasă anonimă (client)
        Car mercedes3 = new Car(20000, CarType.MERCEDES, 2019);
        Offer clientNegotiationOffer = car -> {
            int discount = (int) (car.getPrice() * 0.05);
            System.out.println("Applying Client Negotiation Offer: 5%");
            return discount;
        };
        dealership.negotiate(mercedes3, clientNegotiationOffer);

        // Testare utilizare expresii lambda pentru filtrarea mașinilor cu prețuri peste 25000
        List<Car> cars = new ArrayList<>();
        cars.add(mercedes1);
        cars.add(mercedes2);
        cars.add(fiat1);
        cars.add(fiat2);
        cars.add(skoda1);
        cars.add(skoda2);

        System.out.println("Cars before filtering: " + cars);

        // Filtrare mașini cu prețuri sub 25000
        cars.removeIf(car -> car.getPrice() > 25000);

        System.out.println("Cars after filtering: " + cars);
    }
}

