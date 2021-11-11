package Warmup_2;

public class Encrypt {
    public static void main(String[] args) {
        String message="Welcome";
        System.out.println("message = " + message);
        message=Encrypt(message);
        System.out.println("Encrypted message = " + message);
        message=Decrypt(message);
        System.out.println("Decrypted message = " + message);
        
    }
    public static String Encrypt(String str){
        String text="";
        for (char i:str.toCharArray()) {
            text+=(char)(i+13);
        }
        return text;
    }
    public static String Decrypt(String str){
        String text="";
        for (char i:str.toCharArray()) {
            text+=(char)(i-13);
        }
        return text;
    }
}
