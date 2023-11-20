package advanced.clase_anonime;

public class Car {

    private int price;
    private CarType type;
    private int year;

    public Car(int price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + type +
                ", year=" + year +
                '}';
    }

    public CarType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
