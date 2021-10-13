package String_1;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String text="";
        int [] arr={1,2,3,43,3,3,23,112,3,1};
        System.out.println(Arrays.stream(arr).sum());
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (char i:str.toCharArray()) {
            text=""+i+text;
        }
        System.out.println(text);

    }
}
