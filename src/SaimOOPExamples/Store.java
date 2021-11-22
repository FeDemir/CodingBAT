package SaimOOPExamples;

import java.time.chrono.Era;

public class Store {
    public static void main(String[] args) {
        Eragon obj1= new Eragon();
        Book obj2=new Eragon();
        Item obj3=new Eragon();
        obj1.use();
        obj2.use();
        obj3.use();
        new Book("").use();
        obj1.open();
        ((Eragon)obj2).open();
        Eragon newObj=(Eragon) obj3;
        newObj.open();
    }
}
