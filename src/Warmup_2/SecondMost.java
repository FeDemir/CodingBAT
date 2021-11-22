package Warmup_2;

import java.util.Arrays;

public class SecondMost {
    public static void main(String[] args) {
        String str="aaaacdwdaaaafffffffffffffff";
        System.out.println("Most 2nd frequent character = "+mostFrequent(str.replaceAll(mostFrequent(str)+"","")));
        int[] arr={1,3,2,4,5,1,2,2,5,1,1,1};
        System.out.println("Most populated animal = " + mostFrequent(arr));
    }
    public static char  mostFrequent(String str){
        int count=0,max=0;
        char most=str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            if(count>max){
                max=count;
                most=str.charAt(i);
            }
            count=0;
        }
        return most;
    }
    public static int mostFrequent(int[] arr){
        return Integer.parseInt(mostFrequent(Arrays.toString(arr).replaceAll("\\D",""))+"");
        //mostfrequent method for string is above
    }
}
