package Warmup_2;

public class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
        "Breed: "+breed+"\n"+
        "Age in calendar years: "+age+"\n"+
        "Age in human years: "+getAgeInHumanYears();
    }

    @Override
    public int getAgeInHumanYears() {
        if(age<3) return age*11;
        else return 22+((age-2)*5);
    }

    //@Override
    public boolean equals(Dog obj) {
        return obj.name.equals(name)&&obj.breed.equals(breed)&&obj.getAge()==age;
    }
}
