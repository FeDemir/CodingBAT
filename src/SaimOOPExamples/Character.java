package SaimOOPExamples;

public class Character {
    String name,occupation;
    int appearance;

    public Character(String name, String occupation, int appearance) {
        setName(name);
        setOccupation(occupation);
        setAppearance(appearance);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getOccupation() {return occupation;}

    public void setOccupation(String occupation) {this.occupation = occupation;}

    public int getAppearance() {return appearance;}

    public void setAppearance(int appearance) {this.appearance = appearance;}

    @Override
    public String toString() {
        return "Character{" + "name='" + name + '\'' + ", occupation='" + occupation + '\'' + ", appearance=" + appearance + '}';
    }
}
