package Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Sprint01 {
    public static void main(String[] args) {
        ScrumTeam sprint01=new ScrumTeam(01);
        //test adding developers one by one or as Developer[] array list
        Developer[] developers={new Developer("Adalat",1234),new Developer("Adilya",2345)};
        sprint01.addDeveloper(new Developer("Ferhat",1001));
        System.out.println(sprint01.toString());//ScrumTeam{PO='Nadir', BA='Mike', SM='Saim', testers=0, developers=1, sprintNumber=1}
        sprint01.addDevelopers(developers);
        System.out.println(sprint01.toString());//ScrumTeam{PO='Nadir', BA='Mike', SM='Saim', testers=0, developers=3, sprintNumber=1}

        //test adding testers one by one dor as array list
        sprint01.addTester(new Tester("Ahmet",3456));
        System.out.println(sprint01.toString());//ScrumTeam{PO='Nadir', BA='Mike', SM='Saim', testers=1, developers=3, sprintNumber=1}
        Tester[] testers={new Tester("Aisha",4567),new Tester("Aktolkyn",5678)};
        sprint01.addTesters(testers);
        System.out.println(sprint01.toString());//ScrumTeam{PO='Nadir', BA='Mike', SM='Saim', testers=3, developers=3, sprintNumber=1}
        //constructing sprint01 with multiple parameter
        ArrayList<Developer> devTeam=new ArrayList<>(Arrays.asList(developers));
        ArrayList<Tester> testTeam=new ArrayList<>(Arrays.asList(testers));
        sprint01=new ScrumTeam("Murodil","Asya","Nadir & Saim",devTeam,testTeam,1);
        System.out.println(sprint01.toString());
        //ScrumTeam{PO='Murodil', BA='Asya', SM='Nadir & Saim', testers=2, developers=2, sprintNumber=1}

        //test removing developer and tester
        sprint01.removeTester(5678);
        sprint01.removeDeveloper(2345);
        System.out.println(sprint01.toString());
        //ScrumTeam{PO='Murodil', BA='Asya', SM='Nadir & Saim', testers=1, developers=1, sprintNumber=1}
    }
}
