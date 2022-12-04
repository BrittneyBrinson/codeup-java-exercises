import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercises {

    public Person[] peopleArray;

    public static Person[] addPerson(Person[] peopleArray, Person addMe){
        Person[] anotherArr = new Person[peopleArray.length + 1];
            for(int i = 0; i < peopleArray.length; i++){
                anotherArr[i] = peopleArray[i];
            }
            anotherArr[anotherArr.length - 1] = addMe;
        return anotherArr;
    }




    public static void main(String[] arguments){
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));  // Arrays.toString is necessary to see numbers. Otherwise, you will see object location(not the actual obj)

            Person bravo = new Person("Lilly");
            Person charlie = new Person("Hyde");
            Person delta = new Person("Lexie");
            Person[] threePeople = {bravo,charlie,delta};
                for(Person people : threePeople){
                    System.out.println(people.getName());
                }




    }
}
