package String_3;

public class Developer extends Employee{
    @Override
    public void work() {
        System.out.println("Developer is creating feature");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Losing sleep because of a bug");
    }
}
