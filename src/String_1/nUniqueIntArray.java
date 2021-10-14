package String_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nUniqueIntArray {
    public static int[] generate(int n){
        int[] arr=new int[n];
        int temp;
        for (int i = 0; i < n-1; i++) {

            do{
                temp=new Random().nextInt(10)-new Random().nextInt(10);
            } while(contains(arr,temp));
            arr[i]=temp;
        }

        temp=-1* Arrays.stream(arr).sum();
        if(!contains(arr,temp)) arr[n-1]=temp;
        else generate(n);
        return arr;

    }
    public static boolean contains(int[] arr, int temp){
        for (int i:arr) {
            if(i==temp) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        System.out.println(Arrays.toString(generate(scanner.nextInt())));
    }

}
