package util;
import java.util.Scanner;

public class Input{
    private Scanner scanner;
    public Input(Scanner scanner){         //Input constructor
        this.scanner = new Scanner(System.in);
    }
        String getString(Scanner Obj){
        return this.scanner.toString();
    }

    boolean yesNo(String userInput) {
        userInput.equals("yes");
        return true;
    }













}










