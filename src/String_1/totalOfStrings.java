package String_1;

public class totalOfStrings {
    public static void main(String[] args) {
        String str="1a1s1231k324k324kl23l32?1.";
        System.out.println(str);
        str=str.replaceAll("\\D","");
        System.out.println(str);
        int total=0;
        for (char i:str.toCharArray()) {
            total+=Integer.parseInt(""+i);
        }
        System.out.println(total);
    }
}
