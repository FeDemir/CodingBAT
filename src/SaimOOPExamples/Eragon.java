package SaimOOPExamples;

public class Eragon extends Book{
    public Eragon() {
        super("Eragon");
    }

    @Override
    public void use() {
        System.out.println("Reading Eragon");
    }
    public void open(){
        System.out.println("Openning");
    }
}
