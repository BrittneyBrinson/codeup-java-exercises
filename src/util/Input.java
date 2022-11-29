package util;
import java.util.Scanner;

public class Input{
    private Scanner sc;


    public Input(){         //Input constructor
        this.sc = new Scanner(System.in);
    }
        String getString(Scanner Obj)
        {
            return this.sc.toString();
        }

    boolean yesNo(String userInput) {
       boolean newOutput = userInput.equals("yes") || userInput.equals("y") ? true : false;
            return newOutput;
    }

    int getInt(int min, int max)
        {
            while(true)
            {
                System.out.println("Please guess a number between the hidden min and max.");
                    int catchOutput = sc.nextInt();
                        if(catchOutput < max & catchOutput > min)
                    {
                        break;
                    }
            }
            return 0;
        }

    public int getInt()
    {
        System.out.println("Enter a number");
            int nextInput = sc.nextInt();
                 return nextInput;
    }

    double getDouble(double min , double max)
    {
        while(true) {
            System.out.println("Guess a decimal between two hidden values!");
            double grabInput = sc.nextDouble();
            if (grabInput < max & grabInput > min) {
                break;
            }
        }
              return 0;
    }

    double getDouble()
    {
        System.out.println("Enter a decimal");
            double userInput = sc.nextDouble();
                return userInput;
    }


    }












