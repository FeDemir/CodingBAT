package Company;

public class B extends A{
    //int abc=1;
    public static void staticMethod(){
        System.out.println("B");
    }
    public void instanceMethod(){
        staticMethod();
    }
}
