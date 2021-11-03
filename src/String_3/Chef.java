package String_3;

public class Chef extends Employee{
    @Override
    public void work() {
        System.out.println("Cooking");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleeping with wooden spoon");
    }
}
