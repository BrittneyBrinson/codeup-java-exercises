package util;
import java.util.Scanner;

public class Input{
    private Scanner sc;


    public Input(){         //Input constructor
        this.sc = new Scanner(System.in);
    }
        String getString(Scanner Obj){
        return this.sc.toString();
    }

    boolean yesNo(String userInput) {
       boolean newOutput = userInput.equals("yes") || userInput.equals("y") ? true : false;
       return newOutput;
    }

    int getInt(int min, int max) {
        System.out.println("Please enter a integer between 50 - 100");
        int userInput = Integer.parseInt(sc.nextLine());
        min = 50;
        max = 100;
         while(userInput > 100 & userInput < 50){
             System.out.println("Incorrect. Please try again. Enter a number between 50 - 100");
         }
          return userInput;
    }

















}










