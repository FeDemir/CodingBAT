package Warmup_1;

public class Circle extends Shape {
    @Override
    public double area(double r) {
       return Math.PI*Math.pow(r,2);
    }

    @Override
    public double perimeter(double r) {
        return 2*Math.PI*r;
    }


}
