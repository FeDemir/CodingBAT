package SaimOOPExamples;

public class Notebook {

    static int pages;

    static {
        pages = 50;

    }

    public static void write(){
        pages--;
    }

}

class School {

    public static void main(String [] args){
        new Notebook();
        System.out.println(Notebook.pages);
        Notebook.write();
        Notebook.write();

        new Notebook();
        Notebook.write();

        System.out.println(Notebook.pages);
    }

}

