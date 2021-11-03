package Company;

public class MobileApp {
    private String name;
    private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void useApp(int minutes){
        System.out.println("Using " + name + " for " + minutes + "minutes");
    }
    public void download(){
        System.out.println(getName()+" is downloading version "+getVersion());
    }
}
