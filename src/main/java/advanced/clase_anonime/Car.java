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
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("price=").append(price);
        sb.append(", carType=").append(type);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
