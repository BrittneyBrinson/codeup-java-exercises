import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int range = (100 - 1) + 1;

       int game = (int)(Math.random() * range) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME to the PICK A NUMBER GAME! Guess what number was picked!");

        int userGuess = Integer.parseInt(scanner.nextLine());

            if(userGuess > game){
                System.out.println("HIGHER");

                 if(userGuess < game){
                    System.out.println("LOWER");

                    if(userGuess == game){
                        System.out.println("GOOD GUESS");
                    }
                    else{
                        System.out.println("ERROR PLEASE TRY AGAIN");
                    }
                }
            }






    }
}
