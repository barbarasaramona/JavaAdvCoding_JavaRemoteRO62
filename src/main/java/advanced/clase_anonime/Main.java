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
    //
    Dealership dealership = new Dealership();
    System.out.println("Final price: " + dealership.getFinalPrice(mercedes));
    //
    dealership.negotiate(mercedes1, new Offer() {
      @Override
      public int getDiscount(Car car) {
        int discount = 5;
        System.out.println("Applying ClientOffer discount: " + discount + "%");
        return discount;
      }
    });
    //
    List<Car> cars = new ArrayList<>();
    cars.add(mercedes);
    cars.add(mercedes1);
    cars.add(fiat);
    cars.add(fiat1);
    cars.add(skoda);
    cars.add(skoda1);
    System.out.println(cars.stream().map(car -> "Car { price = " + car.getPrice() + " }").toList());
    cars.removeIf(Main::filterCarsCallBack);
    Main main = new Main();
    System.out.println(cars.stream().map(main::mapCarsToPriceCallBack).toList());
  }

  public static boolean filterCarsCallBack(Car car) {
    return 25_000 < car.getPrice();
  }

  public String mapCarsToPriceCallBack(Car car) {
    return "Car { price = " + car.getPrice() + " }";
  }
}
