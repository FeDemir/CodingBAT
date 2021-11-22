package SaimOOPExamples;

public abstract class SocialMedia {
    String personalURL;
    int accountLength;
    static String platform;
    static {
        platform="Facebook";
    }
    public abstract void Directmessaging(String username, String message);
    public abstract void Post(String body);
    public abstract void Notifications();
}
