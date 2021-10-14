package String_1;

public class Car {
    String brand, model, color;
    int year;
    double price;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Car(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }
    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }
    public Car(String brand, String model, int year, double price, String  color) {
        this(brand, model, year, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
