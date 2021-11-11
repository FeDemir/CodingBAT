package day56_polymorphisim.learn_interface;

public class Speech implements CanTalk {
    @Override
    public void speak() {
        System.out.println("Talking to the moon");
    }
}
class Runner{
    public static void main(String[] args) {
        Speech obj=new Speech();
        obj.speak();
        obj.whisper();
        //obj.yell();
        CanTalk.yell();
        //CanTalk.whisper();
    }
}