package String_1;

public class Pizza {
    String size;
    int cheeseTopping, veggieTopping;
    double tip;
    public void customizeOrder(String size, int cheeseTopping, int veggieTopping){
        this.size=size;
        this.veggieTopping=veggieTopping;
        this.cheeseTopping=cheeseTopping;
    }
    public double calcCost(){
        double price=0;
        if(size.equals("Small")) price=5;
        if(size.equals("Medium")) price=7;
        if(size.equals("Large")) price=9;
        price+=veggieTopping+cheeseTopping;
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", veggieTopping=" + veggieTopping +
                ", tip=" + tip +
                '}';
    }
}
