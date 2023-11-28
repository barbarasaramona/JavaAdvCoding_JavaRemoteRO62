package advanced.clase_anonime;

public class Car {
     private int price;
     private CarType carType;
     private int yearOfFabrication;

   public Car (int price, CarType carType, int yearOfFabrication){
         this.price = price;
         this.carType = carType;
         this.yearOfFabrication = yearOfFabrication;

    }

    public int getPrice() {
        return price;
    }

    public Car setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    @Override
     public String toString() {
          final StringBuilder sb = new StringBuilder("Car{");
          sb.append("price=").append(price);
          sb.append(", carType=").append(carType);
          sb.append(", yearOfFabrication=").append(yearOfFabrication);
          sb.append('}');
          return sb.toString();
     }
}
