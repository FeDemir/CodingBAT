package String_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String[] arr=str.split("");
        String text="";
        int count=1;
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(!arr[i].equals(" ")&&arr[i].equals(arr[j])){
                    count++;
                    arr[j]=" ";
                }
            }
            if(!arr[i].equals(" ")) text+=""+count+arr[i];
            count=1;
        }
        return text;
    }

}
