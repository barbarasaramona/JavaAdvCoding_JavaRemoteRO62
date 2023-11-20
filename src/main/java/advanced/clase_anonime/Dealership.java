package advanced.clase_anonime;

public class Dealership {

    // Clasa interna pentru discount in functie de brand
    private static class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            switch (car.getType()) {
                case MERCEDES:
                    System.out.println("Applying Brand discount: 5%");
                    return 5;
                case FIAT:
                    System.out.println("Applying Brand discount: 10%");
                    return 10;
                case SKODA:
                    System.out.println("Applying Brand discount: 15%");
                    return 15;
                default:
                    return 0;
            }
        }
    }

    // Clasa interna pentru discount in functie de vechime
    private static class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            switch (car.getType()) {
                case MERCEDES:
                    discount = car.getYear() * 300;
                    System.out.println("Applying Dealer discount: " + discount + " euros");
                    break;
                case FIAT:
                    discount = car.getYear() * 100;
                    System.out.println("Applying Dealer discount: " + discount + " euros");
                    break;
                case SKODA:
                    discount = car.getYear() * 150;
                    System.out.println("Applying Dealer discount: " + discount + " euros");
                    break;
            }
            return discount;
        }
    }

    // Metoda pentru calcularea prețului final după aplicarea ofertelor
    public int getFinalPrice(Car car) {
        Offer brandOffer = new BrandOffer();
        Offer dealerOffer = new DealerOffer();

        int brandDiscount = brandOffer.getDiscount(car);
        int dealerDiscount = dealerOffer.getDiscount(car);

        // Implementarea ofertei clientului sub formă de clasă anonimă
        Offer clientOffer = new Offer() {
            @Override
            public int getDiscount(Car car) {
                int discount = (int) (car.getPrice() * 0.05);
                System.out.println("Applying Client discount: 5%");
                return discount;
            }
        };

        int clientDiscount = clientOffer.getDiscount(car);

        int totalDiscount = brandDiscount + dealerDiscount + clientDiscount;
        return car.getPrice() - totalDiscount;
    }

    // Metoda pentru negociere
    public void negotiate(Car car, Offer offer) {
        int discount = offer.getDiscount(car);
        System.out.println("Negotiating with a discount of " + discount + " euros");
    }
}