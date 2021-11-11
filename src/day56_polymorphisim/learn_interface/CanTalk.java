package day56_polymorphisim.learn_interface;

public interface CanTalk {
    void speak();
    public static void yell(){
        System.out.println("Yelling!!!");

    }
    public default void whisper(){
        System.out.println("Whispering");
    }
}
