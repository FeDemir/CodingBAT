package SaimOOPExamples;

public abstract class Phone {
    String brand, model;
    double price, size;
    public abstract void calling();
    public abstract void texting();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public Phone(String brand, String model, double price, double size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public Phone() {
    }
}
