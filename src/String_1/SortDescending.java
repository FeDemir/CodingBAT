package String_1;

import java.util.Arrays;

public class SortDescending {
    /*
    1. Array -- Sort Descending
    Write a return method that can sort an int array in Ascending order without using the sort
    method of the Arrays class
    Ex:
        int[] arr = {7, 8, 9, 10};
        arr = Sort(arr); ==> { 10, 9, 8, 7} */
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={0,9,8,7,6,5,45,4,234,23,234,2};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
