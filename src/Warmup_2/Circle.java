package Warmup_2;

import java.text.DecimalFormat;
import java.text.Format;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
//        DecimalFormat dec = new DecimalFormat("#0.0");
//        return Double.parseDouble(dec.format(Math.PI*radius*radius));
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        DecimalFormat dec = new DecimalFormat("#0.00");
        return Double.parseDouble(dec.format(2*Math.PI*radius));
//        return 2*Math.PI*radius;
    }
}
