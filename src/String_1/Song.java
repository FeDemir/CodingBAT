package String_1;

public class Song {
    String name,author,publisher,genre;
    double length;
    public Song(String name){
        this.name=name;
    }
    public Song(String name, double length){
        this(name);
        this.length=length;
    }
    public Song(String name, double length, String author){
        this(name,length);
        this.author=author;
    }
    public Song(String name, double length, String author, String publisher){
        this(name,length, author);
        this.publisher=publisher;
    }
    public Song(String name, double length, String author, String publisher, String genre){
        this(name,length, author,publisher);
        this.genre=genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        Song newSong= new Song("Hello",4.5,"World","Universe","Slow-Pop");
        System.out.println(newSong.toString());
    }
}
