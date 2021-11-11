package day56_polymorphisim.learn_interface.Transportation;

public class Tesla extends Car implements AutoPilot, Electric{
    @Override
    public void selfDriving() {
        System.out.println("Auto pilot driving activated!");
    }

    @Override
    public void charging() {
        System.out.println("Super charging cable plugged in. Tesla is charging right now.");
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void openTrunk() {
        super.openTrunk();
    }
}
