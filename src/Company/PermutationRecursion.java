package Company;

import java.util.Scanner;

public class PermutationRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println(permutate(scanner.next()));
    }
    public static String permutate(String str){
        return permutate("",str);
    }
    private static String permutate(String prefix, String str){
        if(str.length()==0) System.out.println(prefix);
        for (int i = 0; i < str.length(); i++) {
            permutate(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));

        }


        return "";
    }
}
