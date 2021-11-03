package Company;

public class Parent {
      public static void hello(){
        System.out.println("hello from parent");
    }
}
class Child extends Parent{
   //@Override
    public  static void hello(){
        System.out.println("Hello from child");
    }
}
class Main{
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.hello();
        Child child=new Child();
        child.hello();
    }
}
