package Test1;

public interface First {
    public abstract void write();

    void read();
}
interface Second {
    public abstract void listen();

    void load();
}
class Book implements First, Second {
    @Override
    public void write() {

    }

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void listen() {
        
    }

    @Override
    public void load() {

    }
}
