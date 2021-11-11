package day56_polymorphisim.learn_interface;

public interface Mac {
    String NAME = "Mac";
    String SOFTWARE = "IOS";

    void turnOn();
    public static void getBrand(){
        System.out.println("Apple");
    }
}
