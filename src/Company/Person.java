package Company;

public class Person {
    String name="James Bond";

}
class Baby extends Person{
    String name="Mike Smith";
}
class Runner{
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
        Baby baby=new Baby();
        System.out.println(baby.name);
    }
}