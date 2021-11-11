package day56_polymorphisim.learn_interface.Education;

import day56_polymorphisim.learn_interface.Education.OnlineStudent;

public class School {
    public static void main(String[] args) {
        OnlineStudent onlineStudent=new OnlineStudent();
        onlineStudent.goToSchool();
        onlineStudent.dreamBig();
        onlineStudent.learn();
        onlineStudent.workHard();
        System.out.println("_______________________________________________\n");
        LocalStudent localStudent=new LocalStudent();
        localStudent.dreamBig();
        localStudent.goToSchool();
        localStudent.learn();
    }
}
