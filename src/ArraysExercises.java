import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercises {

    public Person[] peopleArray;

//    public static int addPerson(Person[] peopleArray){
//        return ;
//    }




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
