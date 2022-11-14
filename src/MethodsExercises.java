import java.lang.Math;
import java.util.Scanner;
public class MethodsExercises {
    public static int basicAddition(int x, int y){
        return  x + y;
    }
    public static int basicSubtraction(int x , int y){
        return x - y;
    }
    public static int basicMultiplication(int x , int y){
        return x * y;
    }
    public static int basicDiv(int x, int y){
        return x / y;
    }
    public static int modulo(int x , int y){
        return x % y;
    }
    public static int getInteger(int min, int max){
      return min + max;
    }


    public static void main(String[] args) {
        System.out.println(basicAddition(3,5));

        System.out.println(basicSubtraction(12,6));

        System.out.println(basicMultiplication(9,10));

        System.out.println(basicDiv(20,10));

        System.out.println(modulo(25,5));

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number from 1 to 10");

//        int userInput = Integer.parseInt(scanner.nextLine());
//
//            if(userInput < getInteger(1,10)){
//                System.out.println("This is your number: " + userInput);
//            }
//            else if(userInput > getInteger(1,10)){
//                System.out.println("That is not a number between 1 - 10. Please try again! ");
//
//                System.out.println("Enter a number from 1 to 10");
//
//                int userInput2 = Integer.parseInt(scanner.nextLine());
//
//                    if(userInput2 < getInteger(1,10)){
//
//                        System.out.println("This is your number: " + userInput2);
//                    }
//            }
//
//            System.out.println("Enter a number from 1 - 10");
//
//            int userInput3 = Integer.parseInt(scanner.nextLine());
//
//            for(int i = 1; i <= userInput3; i++){
//                System.out.println(i + "! = " + i);
//            } COME BACK TO 3

        System.out.println("Let's roll some dice! pick a number of sides for a pair of dice");

            int userInput4 = Integer.parseInt(scanner.nextLine());

        System.out.println("*Dice Rolls*");

            int range = (userInput4 - 1) + 1;

            int dice =(int)(Math.random() * range) + 1 ;

            int dice2 = (int)(Math.random() * range) + 1 ;

        System.out.println("The first die on landed on: " + dice + " The second die landed on: " + dice2);
    }
}

