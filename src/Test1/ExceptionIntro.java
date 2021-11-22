package Test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num1= scanner.nextInt();

            System.out.println("Enter a number: ");
            int num2= scanner.nextInt();
            System.out.println(num1/num2);
        } catch (InputMismatchException e){
            System.out.println("Enter only numbers!");
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
            System.out.println(e.getMessage());
        }
    }
}
