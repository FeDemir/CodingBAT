package Company;

public class run {
    public static void main(String[] args) {
        A a=new A();
        a.staticMethod();
        a.instanceMethodA();
        B b=new B();
        b.staticMethod();
        b.instanceMethod();
        b.instanceMethodA();
        System.out.println(b.abc);
        System.out.println(a.abc);
    }
}
