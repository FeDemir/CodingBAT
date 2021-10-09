package String_1;

import java.util.Scanner;

public class ValidatePassword {
    public static boolean validate(String str){
        String text="";
        if(str.length()<6) text+="\nYour password must be at least 6 characters";
        if(str.contains(" ")) text+="\nYour password can't have space";//update
        if(!str.matches("\\[A-Z]{1,}")) text+="\nYour password must have at least one upper case character";
        if(!str.matches("\\[a-z]{1,}")) text+="\nYour password must have at least one lower case character";
        if(str.replaceAll("\\w","").length()<1) text+="\nYour password must have at least one special character";
        if(str.replaceAll("\\D","").length()<1) text+="\nYour password must have at least one numeric character";
        if(text.length()<1) return true;
        else {
            System.out.println(text);
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password="";
        do{

            System.out.println("Please enter a valid password!");
            password= scan.nextLine();


        } while(!validate(password));
        System.out.println("Greate your password accepted!");
        System.out.println("Your password is "+password);
    }
}
