package advanced.clase_anonime;

class Car {
    private int price;
    private CarType type;
    private int year;

    // Constructor
    public Car(int price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }

    // Getters și toString
    public int getPrice() {
        return price;
    }

    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", carType=" + type + ", year=" + year + '}';
    }
}