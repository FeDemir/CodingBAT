package SaimOOPExamples;

public class Book extends Item{
    public Book(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Reading Book");
    }
}
