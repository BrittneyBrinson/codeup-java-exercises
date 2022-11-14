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

        System.out.println("Enter a number from 1 to 10");

        int userInput = Integer.parseInt(scanner.nextLine());

            if(userInput < getInteger(1,10)){
                System.out.println("This is your number: " + userInput);
            }
            else if(userInput > getInteger(1,10)){
                System.out.println("That is not a number between 1 - 10. Please try again! ");

                System.out.println("Enter a number from 1 to 10");

                int userInput2 = Integer.parseInt(scanner.nextLine());

                    if(userInput2 < getInteger(1,10)){

                        System.out.println("This is your number: " + userInput2);
                    }
            }


    }
}

