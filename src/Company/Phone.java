package Company;

public class Phone {
    public static void main(String[] args) {
        MobileApp app1=new MobileApp();
        app1.setName("Generic");
        app1.setVersion(1.0);
        app1.useApp(10);
        app1.download();

        System.out.println();

        Instagram instagram=new Instagram();
        instagram.setName("instagram");
        instagram.setVersion(1.1);
        instagram.download();
        instagram.useApp(15);


        Discord discord=new Discord();
        discord.setName("discord");
        discord.setVersion(1.4);
        discord.download();
        discord.useApp(10);
        
    }
}
