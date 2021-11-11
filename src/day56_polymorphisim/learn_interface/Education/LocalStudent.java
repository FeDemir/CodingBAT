package day56_polymorphisim.learn_interface.Education;

public class LocalStudent extends Student{
    @Override
    public void dreamBig() {
        System.out.println("join to a college");
    }

    @Override
    public void goToSchool() {
        System.out.println("Drive to school");
    }

    @Override
    public void learn() {
        System.out.println("Attend to classes in classroom.");
    }
}
