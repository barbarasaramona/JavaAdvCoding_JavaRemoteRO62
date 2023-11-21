package advanced.clase_anonime;

import java.time.*;
import java.util.prefs.*;

public class Dealership {
    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) throws BrandNotFoundException{
            int discount = 0;
            if (CarType.MERCEDES.equals(car.getType())) {
                discount = 5;
            } else if (CarType.FIAT.equals(car.getType())) {
                discount = 10;
            } else if (CarType.SKODA.equals(car.getType())) {
                discount = 15;
            }
            else {
                throw new BrandNotFoundException("Car brand not found");
            }
            System.out.println("Applying brand discount: " + discount + " %");
            return discount;
        }
    }

    private class DealerOffer implements Offer{

        @Override
        public int getDiscount(Car car) throws BrandNotFoundException{
            int discount = 0;
            int aniVechime = LocalDate.now().getYear() - car.getYear();
            if (CarType.MERCEDES.equals(car.getType())) {
                discount = 300 * aniVechime;
            } else if (CarType.FIAT.equals(car.getType())) {
                discount = 100 * aniVechime;
            } else if (CarType.SKODA.equals(car.getType())) {
                discount = 150 * aniVechime;
            } else {
                throw new BrandNotFoundException("Car brand not found exception");
            }
            System.out.println("Applying dealer discount: " + discount + " euro");
            return discount;
        }
    }

    public int getFinalPrice(Car car) throws BrandNotFoundException {
        BrandOffer brandOffer = new BrandOffer();
        int brandOfferDiscount = brandOffer.getDiscount(car);
        car.setPrice((int) (car.getPrice() * (1- brandOfferDiscount/100.)));

        DealerOffer dealerOffer = new DealerOffer();
        int dealerOfferDiscount = dealerOffer.getDiscount(car);
        car.setPrice(car.getPrice() - dealerOfferDiscount);

        return car.getPrice();
    }

    void negotiate(Car car, Offer offer) throws BrandNotFoundException {
        System.out.println("Client offer discount:" + offer.getDiscount(car));
    }
}
