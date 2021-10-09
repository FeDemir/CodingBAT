package String_1;

public class SameLetters {
    public static boolean checkLetters(String str1, String str2){
        for (char i:str1.toCharArray()) {
            if(!str2.contains(""+i)) return false;
        }
        for (char i:str2.toCharArray()) {
            if(!str1.contains(""+i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {


        String str1 = "abc";
        String str2 = "cbaad";
        System.out.println(checkLetters(str1,str2));

    }
}
