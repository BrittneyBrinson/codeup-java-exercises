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

    int getInt(int min, int max){
        System.out.println("Enter a number between 50 - 100");
        min = 50;
        max = 100;
        int grabInput = Integer.parseInt(sc.nextLine());

        if(grabInput > 100 && grabInput < 50){
            throw new IllegalArgumentException("Please enter a number that is BETWEEN 50-100");
        }

        return grabInput;

        }

















}










