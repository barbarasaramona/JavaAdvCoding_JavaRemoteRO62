package advanced.clase_anonime;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Dealership {


    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            if (CarType.MERCEDES.equals(car.getCarType())) {
                discount = 5;
            } else if (CarType.FIAT.equals(car.getCarType())) {
                discount = 10;
            } else if (CarType.SKODA.equals(car.getCarType())) {
                discount = 15;
            }
            System.out.println("Applying " + discount + " % " + " from brand discount... " );
            return discount;
        }

    }

    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            int yearsForDiscount;
            yearsForDiscount = LocalDate.now().getYear() - car.getYearOfFabrication();
            if (CarType.MERCEDES.equals(car.getCarType())) {
                discount = yearsForDiscount * 300;
            } else if (CarType.FIAT.equals(car.getCarType())) {
                discount = yearsForDiscount * 100;
            } else if (CarType.SKODA.equals(car.getCarType())) {
                discount = yearsForDiscount * 150;
            }
            System.out.println("Applying dealer discount... ");
            return discount;
        }
    }

    public int getFinalPrice(Car car) {
        //For BrandOffer
        BrandOffer brandOffer = new BrandOffer();
        int brandOfferDiscount = brandOffer.getDiscount(car);
       //(DC NU MERGE) car.setPrice(car.getPrice() - ((brandOfferDiscount / 100 * car.getPrice())));
        car.setPrice((int)((car.getPrice() * (1 - brandOfferDiscount / 100.))));
        System.out.println("Applying the discount from BrandsOffer..." );

        //For DealerOffer
        DealerOffer dealerOffer = new DealerOffer();
        int dealerOfferDiscount = dealerOffer.getDiscount(car);
        car.setPrice(car.getPrice() - dealerOfferDiscount);
        System.out.println("Applying the discount from DealerOffer: " + dealerOfferDiscount + " euro ");

        return  car.getPrice();

    }

    public void negociate(Car car, Offer offer){
        getFinalPrice(car);
        int clientDiscount = offer.getDiscount(car);
        car.setPrice((int) (car.getPrice() * (1 - clientDiscount / 100.)));
        System.out.println("Final price: " + car.getPrice());

    }
}


