package String_1;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String text="";
        for (char i:str.toCharArray()) {
            if(!text.contains(""+i)) text+=""+i;

        }
        System.out.println(text);

    }
}
