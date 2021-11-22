package SaimOOPExamples;


import Test1.A;

public abstract class Animal {

    public abstract void walk();

    public abstract void eat();
    public abstract void sleep();
    public final void die(){
        System.out.println("died");
    }
    public void die(int a){
        System.out.println("a = " + a);
    }

}
