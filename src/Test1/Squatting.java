package Test1;

public class Squatting extends Lifting{
    @Override
    public void perform() {
        System.out.println("Squatting");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println("Calories burned = " + (minutes*0.4));
    }

    @Override
    public void rackWeights() {
        System.out.println("Putting away the weights");
    }
}
