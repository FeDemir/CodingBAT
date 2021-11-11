package Test1;

public abstract class Student {
    public abstract void study();
}
abstract class LocalStudent extends Test2.Student {

}
class CollegeStudent extends Test2.LocalStudent {
    @Override
    public void study(){
        System.out.println("College student is studying");
    }
}
