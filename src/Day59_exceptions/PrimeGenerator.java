package Day59_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator {
    /*
    
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(generatePrime(n)));
    }
    /*
    Numbers – generate a list of prime number
    Write a method generate a list of prime numbers form 1 until N. N cannot be larger than 1000.
    Method:generatePrime
    Parameter: one int
    Return type: int array
    PSEUDOCODE:
    receive number
    create an empty arraylist
    start a loop from 1 to number
    check if number is prime, then add to list
    after loop is over, create an int array with size of list
    iterate through list and pass the values to array
    return array
     */
    public static int[] generatePrime(int n){
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if(isPrime(i)) nums.add(i);
        }
        int[] arr=new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i]=nums.get(i);
        }
        return arr;
    }
    /*
    Numbers -- Prime Number
    Write a method that can check if a number is prime or not.
    Method:generatePrime
    Parameter: one int
    Return type: int array
    PSEUDOCODE:
    loop from 2 to n-1
    check if number is divisible with the i
    if yes, return false
    after the loop return true
     */
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;

    }
}
