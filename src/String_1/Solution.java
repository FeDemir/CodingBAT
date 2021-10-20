package String_1;

import java.util.Arrays;

public class Solution {
    public static String[] ConcatArrays(String a[], String b[]){
        /*
        compare array sizes and get the longest array's length to int n
        create a new array with total size of 2 arrays
        create a position variable
        start a for loop with n
            if array a's length is bigger than iteration, get value from a array to arr and increase position
            if array b's length is bigger than iteration, get value from b array to arr and increase position
        return arr
         */
        int n=a.length>b.length ? a.length: b.length;
        String[] arr=new String[a.length+b.length];
        int pos=0;
        for (int i = 0; i < n; i++) {
            if(i<a.length) {
                arr[pos]=a[i];
                pos++;
            }
            if(i<b.length) {
                arr[pos]=b[i];
                pos++;
            }

        }
        return arr;
    }
    public static int[] ConcatArrays(int a[], int b[]){
        /*
        compare array sizes and get the longest array's length to int n
        create a new array with total size of 2 arrays
        create a position variable
        start a for loop with n
            if array a's length is bigger than iteration, get value from a array to arr and increase position
            if array b's length is bigger than iteration, get value from b array to arr and increase position
        return arr
         */
        int n=a.length>b.length ? a.length: b.length;
        int[] arr=new int[a.length+b.length];
        int pos=0;
        for (int i = 0; i < n; i++) {
            if(i<a.length) {
                arr[pos]=a[i];
                pos++;
            }
            if(i<b.length) {
                arr[pos]=b[i];
                pos++;
            }

        }
        return arr;
    }
    public static String[] add(String[] a, String[] b){
        //int n=a.length>b.length ? a.length: b.length;
        String[] arr=new String[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            arr[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[a.length+i]=b[i];
        }
        return arr;


    }
    public static void main(String[] args) {
        String a="abcd", b="1";
        System.out.println(Arrays.toString(ConcatArrays(a.split(""),b.split(""))));
        System.out.println(Arrays.toString(ConcatArrays(new int[]{10,3,4,12,2},new int[]{0,0})));
        System.out.println(Arrays.toString(add(a.split(""),b.split(""))));

    }
}
