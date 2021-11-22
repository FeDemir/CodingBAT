package Warmup_2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.area());
        System.out.println(r.perimeter());
//        Dog dog = new Dog(in.next(), in.nextInt(), in.next());
//        Dog dog2 = new Dog(in.next(), in.nextInt(), in.next());
//        System.out.println(dog);
//        System.out.println(dog2);
//        System.out.println(dog.equals(dog2));


    }
}
