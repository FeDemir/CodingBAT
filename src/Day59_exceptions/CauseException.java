package Day59_exceptions;

public class CauseException {
    public static void main(String[] args) throws Exception {
       Person person=new Person();
       person.setName("Ferhat");
        System.out.println("person.getName() = " + person.getName());
        try{
            person.setAge(-1);
        } catch (Exception e){
            System.out.println("Invalid age!");
        }
        
        System.out.println("person.getAge() = " + person.getAge());
    }
}
