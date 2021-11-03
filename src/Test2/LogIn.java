package Test2;

public class LogIn {
    public static void main(String[] args) {
     Credentials obj=new Credentials();
//        System.out.println(obj.username);
//        System.out.println(obj.password);
    }
}
        class Credentials{
    private String username="ANgryBird";
    private String password="WoodenSpoon";
    public String getUsername(){
        return username;
    }

            public String getPassword() {
                return password;
            }
        }