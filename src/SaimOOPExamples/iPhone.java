package SaimOOPExamples;

public class iPhone extends Phone implements AppleApps{
    @Override
    public void facetime() {

    }

    @Override
    public void calling() {

    }

    @Override
    public void texting() {

    }

    @Override
    public void download() {

    }

    public iPhone(String brand, String model, double price, double size) {
        super(brand, model, price, size);
    }

    public iPhone() {
    }
}
