package String_3;

public abstract class Employee extends Person{
    String jobTitle;
    double salary;
    public abstract void work();

    //@Override
    public void sleep(int minutes) {
        System.out.println("Employee is sleeping");
    }
}
