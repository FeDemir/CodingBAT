package Company;

public class Discord extends MobileApp{
    public void weChat(){
        System.out.println("Sending and receiving messages");
    }
    @Override
    public void useApp(int minutes){
        System.out.println("Using "+getName()+" for " + minutes);
        weChat();
    }
}
