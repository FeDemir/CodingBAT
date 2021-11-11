package day56_polymorphisim.learn_interface.Education;

public class OnlineStudent extends Student implements Hardworker{
    @Override
    public void dreamBig() {
        System.out.println("Enroll to online classes");
    }

    @Override
    public void workHard() {
        System.out.println("Be a self learner");
    }

    @Override
    public void goToSchool() {
        System.out.println("Join to zoom.");
    }

    @Override
    public void learn() {
        System.out.println("watch videos online");
    }

    @Override
    public void speak() {

    }

    @Override
    public void whisper() {
        Hardworker.super.whisper();
    }
}
