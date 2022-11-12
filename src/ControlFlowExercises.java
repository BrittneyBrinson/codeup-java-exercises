import javax.lang.model.SourceVersion;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println( i++);
//        }
//        int i = 0;

//        do{
//            System.out.println(i += 2);
//
//        }while(i <= 100);
//
//        int i = 2;
//            do{
//                System.out.println((i * 2) * (i *= 2));
//            }while( i <= 1000);

//            for(int i = 0; i <= 100; i++){
//                if(i % 3 == 0 & i % 5 == 0){
//                    System.out.println("FizzBuzz " + i);
//                }
//                    else if(i % 5 == 0){
//                        System.out.println("Buzz " + i);
//                }
//                else if(i % 3 == 0){
//                    System.out.println("Fizz " + i);
//                }
//                    else System.out.println(i);
//            }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer");

        int userInput = Integer.parseInt(scanner.nextLine());

        System.out.println("Here is your table!");

        System.out.println(" ");

        System.out.println("number | squared | cubed");

        System.out.println("------ | ------- | -----");

        for (int i = 0; i <= userInput; i++) {
                if (i == i) {
                    System.out.println(i + " | " + i * i + " | " + Math.pow(i, 3));
                }
            }
        System.out.println("If you want to continue, type yes. Otherwise, type no.");

        String stopStart = scanner.nextLine();
                if(stopStart.equals( "yes")){
                    System.out.println("Enter another integer");
                    int userInput2 = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i <= userInput2; i++) {
                        if (i == i) {
                            System.out.println(i + " | " + i * i + " | " + Math.pow(i, 3));
                        }
                    }
                }




        }
    }