package String_1;

public class Reverse {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String text="";
        for (char i:str.toCharArray()) {
            text=""+i+text;
        }
        System.out.println(text);

    }
}
