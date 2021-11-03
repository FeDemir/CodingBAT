package Company;

public class Instagram extends MobileApp{
    public void postPhoto(){
        System.out.println("Phone Posting");

    }
    @Override
    public void useApp(int minutes){
        super.useApp(minutes);
        postPhoto();
    }
}
