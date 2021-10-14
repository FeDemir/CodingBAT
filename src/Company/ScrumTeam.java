package Company;

import Company.Developer;
import Company.Tester;

import java.util.ArrayList;

public class ScrumTeam {
    String PO="Nadir", BA="Mike", SM="Saim";
    ArrayList<Tester> testers=new ArrayList<Tester>();
    ArrayList<Developer> developers=new ArrayList<Developer>();
    int sprintNumber;
    static String company, CEO;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
    }
    static {
        company="Cydeo";
        CEO="Kuzzat";
    }
    public ScrumTeam(String PO, String BA, String SM, ArrayList<Developer> developers, ArrayList<Tester> testers, int sprintNumber) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.developers = developers;
        this.testers = testers;
        this.sprintNumber = sprintNumber;
    }
    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] tester){
        for (Tester i:tester) {
            testers.add(i);
        }
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developer){
        for (Developer i:developer) {
            developers.add(i);
        }
    }
    public void removeTester(long employeeID){
        for (int i = 0; i < testers.size(); i++) {
            if(testers.get(i).ID==employeeID){
                testers.remove(i);
            }
        }

    }
    public void removeDeveloper(long employeeID){
        for (int i = 0; i < developers.size(); i++) {
            if(developers.get(i).ID==employeeID){
                developers.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                ", sprintNumber=" + sprintNumber +
                '}';
    }
}
