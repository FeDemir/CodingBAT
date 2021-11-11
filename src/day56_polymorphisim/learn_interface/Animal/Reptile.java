package day56_polymorphisim.learn_interface.Animal;

public class Reptile extends Animal{
    @Override
    public void eat() {
        System.out.println("Reptile is eating -- FROM REPTILE");
    }
}
