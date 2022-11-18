package util;
import java.util.Scanner;

public class Input{

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);

    }
    public String getString(){
        return scanner.toString();
    }

    public int getInt(String scanner){
        return Integer.parseInt(scanner);
    }








}










