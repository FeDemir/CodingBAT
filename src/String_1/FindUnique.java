package String_1;

public class FindUnique {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String text="";

        for (char i:str.toCharArray()) {
            int count=0;
            for (char j:str.toCharArray()) {
                if(i==j) count++;
            }
            if(count<2) text+=""+i;
        }
        System.out.println(text);
    }
}
