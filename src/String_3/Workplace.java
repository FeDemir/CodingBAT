package String_3;

public class Workplace {
    public static void main(String[] args) {
        //Person person=new Person();//You cannot create an object with abstract class.
        //Employee employee=new Employee();//You cannot create an object with abstract class.
        Tester tester1=new Tester();
        tester1.work();
        tester1.sleep(10);
        tester1.jobTitle="Tester";

        Developer developer=new Developer();
        developer.work();
        developer.sleep(20);
        Chef chef=new Chef();
        chef.work();
        chef.sleep(10);
    }
}
