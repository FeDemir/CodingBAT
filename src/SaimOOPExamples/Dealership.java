package SaimOOPExamples;

import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Ford());
        cars.add(new ModelX());
        cars.add(new Tesla());
        BMW car5=new BMW();
        cars.add(car5);
        lease(car5);
        lease(new ModelX());
        lease(new Ford());
        Ford ford=(Ford) getCar(3);
        Car car6=getCar(1);
        BMW car7=(BMW) car6;
        BMW car8=(BMW) getCar(1);
    }
    public static void lease(Car car){
        System.out.println("Leasing car");
    }
    public static Car getCar(int option){
        if(option==1){
            return new BMW();
        }
        if(option==2){
            return new Tesla();
        }if(option==3){
            return new Ford();
        }if(option==4){
            return new ModelX();
        }
        return null;
    }
}
