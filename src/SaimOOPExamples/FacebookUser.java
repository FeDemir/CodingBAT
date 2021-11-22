package SaimOOPExamples;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia{
    private String username, password, fullName;
    private int age, numberOfFriends;
    ArrayList<Post> posts = new ArrayList<>();

    public FacebookUser(String username, String password) {
        this.username = username;
        if(password.contains(username)) {
            System.out.println("Password contained username. Default password created: ‘password’");
            this.password = "password";
        } else this.password=password;
        personalURL=  "facebook.com/"+username;
    }

    public FacebookUser(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public FacebookUser(String username, String password, String fullName) {
        this(username, password);
        if (fullName.replaceAll("\\[a-zA-Z]","").length()>0)  {
            System.out.println("Invalid name");
            fullName="no name";
        }

        this.fullName = fullName;
    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username,password,fullName);
        if(age<1) {
            System.out.println("Invalid age!");
            age=0;
        }
        if(numberOfFriends<1) {
            System.out.println("Invalid number of friends!");
            numberOfFriends=0;
        }
        this.age = age;
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    public void Directmessaging(String username, String message) {

    }

    @Override
    public void Post(String body) {

    }

    @Override
    public void Notifications() {

    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                '}';
    }
    public static boolean sendFriendRequest(FacebookUser facebookUser){
        return true;

    }
}
