package Test1;

public class Running extends Exercise{
     @Override
    public void perform(){
         System.out.println("Running");
     }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println("Burning calories "+(minutes*0.4));
    }
}
