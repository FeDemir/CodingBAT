package Test1;

import java.util.Scanner;

public class UseFinally {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name");
        String name = "";
        try{
            name= scanner.next();
            System.out.println("enter a number");
            System.out.println(name.charAt(scanner.nextInt()));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Invalid");
            System.out.println(name.charAt(scanner.nextInt()));
        }
        finally {
            System.out.println("Closing");
            scanner.close();
        }
    }
}
