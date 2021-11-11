package SaimOOPExamples;

public class Show {
    public static void main(String[] args) {
        GameOfThrones obj1=new GameOfThrones();
        obj1.characters.add(new Character("John Snow","King in the North",8));
        obj1.characters.add(new Character("Daenerys Targaryen","Mother of Dragons",8));
        obj1.characters.add(new Character("Khal Drogo", "Khal of Dothrakis",1));
        obj1.characters.add(new Character("Tyrion Lannister","Hand od King",8));
        obj1.characters.add(new Character("Eddard Stark","Lord of Winterfell",1));
        obj1.characters.add(new Character("Arya Stark","Killer of Night King",8));
        for (Character character: obj1.characters) {
            if(character.getAppearance()>=3)
                System.out.println(character);
        }
    }
}
