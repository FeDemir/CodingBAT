package String_1;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        System.out.println("Batch: " + CydeoStudent.batchNumber);

        CydeoStudent studentOne = new CydeoStudent("James Bond", 7, 7);
        System.out.println(studentOne);

        CydeoStudent studentTwo = new CydeoStudent("Sherlock Holmes", 10, 8);
        System.out.println(studentTwo);

        System.out.println(studentOne.name + " and " + studentTwo.name + " have the following instructors: " + Arrays.toString(CydeoStudent.instructors));
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentOne.myCoffee.drink(2);
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentTwo.myCoffee.drink(3);
        System.out.println(CydeoStudent.myCoffee.amountLeft);

    }
}
