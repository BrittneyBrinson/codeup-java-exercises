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
                    String catchOutput = sc.toString();
                    try {
                        if (Integer.valueOf(catchOutput) < max & Integer.valueOf(catchOutput) > min) {
                            break;
                        }
                    }catch(Exception e){
                        System.out.println("Type conversion error");
                    }
                    break;
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
            String grabInput = sc.toString();
            if (Double.valueOf(grabInput) < max & Double.valueOf(grabInput) > min) {
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












