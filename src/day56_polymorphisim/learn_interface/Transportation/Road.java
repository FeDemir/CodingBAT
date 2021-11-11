package day56_polymorphisim.learn_interface.Transportation;

public class Road {
    public static void main(String[] args) {
        Transportation transportation=new Transportation();
        transportation.go();
        transportation.stop();

        Car car=new Car();
        car.go();
        car.stop();
        car.openTrunk();

        Tesla tesla=new Tesla();
        tesla.go();
        tesla.stop();
        tesla.openTrunk();
        tesla.charging();
        tesla.selfDriving();



        Transportation obj1=new Car();
        obj1.go();
        obj1.stop();
        //obj1.openTrunk();//You don't have opentrunk in Transportation
        Transportation tesla1=new Tesla();
        tesla1.stop();
        tesla1.go();
        //Transportation doesn't have those methods, so you can't use
//        tesla1.openTrunk();
//        tesla1.selfDriving();
//        tesla1.charging();

        Car tesla2=new Tesla();
        tesla2.stop();
        tesla2.go();
        tesla2.openTrunk();
        //Car doesn't have those methods, so you can't use
//        tesla2.selfDriving();
//        tesla1.charging();
//        Tesla tesla3=new Transportation();
//        Tesla tesla4=new Car();
    }
}
