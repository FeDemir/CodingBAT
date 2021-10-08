package String_1;

import java.util.Arrays;

public class SortString {
    public static String stringSort(String str){
        String [] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replaceAll("\\W","");
    }
    public static void main(String[] args) {

        String str="0DC501GCCCA098911";
        String letter="", num="";
        String text="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64) letter += "" + str.charAt(i);
            else num += "" + str.charAt(i);
            if (letter.length() * num.length() > 0) {
                if(str.charAt(i)>64) {
                    //sort nums
                    text+=stringSort(num);
                    //add to text
                    //reset num
                    num="";
                } else {
                    text+=stringSort(letter);
                    letter="";
                }
            }
        }
        if(num.length()>0) text+=stringSort(num);
        if(letter.length()>0) text+=stringSort(letter);
        System.out.println(text);
    }
}
