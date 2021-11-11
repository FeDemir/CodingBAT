package Warmup_1;

public class Sphere extends Shape implements hsaVolume{
    double radius;
    @Override
    public double area(double r) {
        return Math.PI*4*Math.pow(r,2);
    }

    @Override
    public double perimeter(double r) {
        return 0;
    }

    @Override
    public double volume() {
        return (0.75)*Math.PI* radius*radius*radius;
    }

    @Override
    public void volume2() {
        
    }
}
