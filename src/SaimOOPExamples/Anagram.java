package SaimOOPExamples;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ABC","CAB"));
        System.out.println(isAnagram("ABC","CABb"));
    }
    public static boolean isAnagram(String str1,String str2){
        int[] arr=new int[255];
        for (char i:str1.toCharArray()) {
            arr[i]++;
        }
        for (char i:str2.toCharArray()) {
            arr[i]--;
        }
        for (int i:arr) {
            if(i!=0) return false;
        }
        return true;
    }
}
