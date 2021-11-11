package day56_polymorphisim.learn_interface.Transportation;

public class Car extends Transportation{
    @Override
    public void go() {
        System.out.println("CAR -- Car is driving");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Car parked!");
    }
    public void openTrunk(){
        System.out.println("Opening trunk");
    }
}
