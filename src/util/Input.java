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
        System.out.println("Pick a number between 50 and 100");
        int catchOutput = sc.nextInt();

       if(catchOutput > 50 && catchOutput < 100)
       {
           System.out.println(catchOutput);
       }
        else if(catchOutput < 50 && catchOutput > 100){
           System.out.println("Please try again. Enter a number between 50 and 100");
           int catchInput2 = sc.nextInt();

       }
        {

       }

        }


    }

}










