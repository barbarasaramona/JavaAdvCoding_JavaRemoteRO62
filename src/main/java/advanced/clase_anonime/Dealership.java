//package advanced.clase_anonime;
//
//import java.time.LocalDate;
//
//public class Dealership {
//   private class BradndOffer implements Offer{
//       @Override
//       public int getDiscount(Car car) {
//           int discount = 0;
//           if (CarType.Mercedes.equals(car.getType())){
//               discount = 5;
//           } else if (CarType.Fiat.equals(car.getType())){
//               discount = 10;
//           } else if (CarType.Skoda.equals(car.getType())) {
//               discount = 15;}
//           }
//
//       }
//
//   }
//    private class DealerOffer implements Offer{
//
//    @Override
//    public int getDiscount(Car car){
//        int vechime = LocalDate.now().getYear() - car.getYear();
//        if ((CarType.Mercedes.equals(car.getType()))){
//            return 300 * vechime;
//        } else if (CarType.Fiat.equals(car.getType())) {
//            return 100 * vechime;
//
//        } else if (CarType.Skoda.equals(car.getType())) {
//            return 150 * vechime;
//        }
//    }
//    public int getFinalPrice(Car car){
//        BrandOffer brandOffer = new BrandOffer();
//        int brandOffer = brandOffer.getDicount(car);
//        car.setPrice((int) (car.getPrice()* (1-brandOffer/100.)));
//    }
//    DealerOffer dealerOffer = new DealerOffer();
//    int dealerOfferDiscount = dealerOffer.getDiscount(car);
//    car.setPrice(car.getPrice() - dealerOfferDiscount);
//
//    return car.getPrice();
//}
