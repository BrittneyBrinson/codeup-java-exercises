package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args) {
        System.out.println("Please pick an option " +
                "\n _____________________________" +
                "\n Enter option 1: View all movies!" +
                "\n Enter option 2:view movies in the animated category!" +
                "\n Enter option 3:view movies in the drama category!" +
                "\n Enter option 4:view movies in the horror category!" +
                "\n Enter option 5:view movies in the sci-fi category!");
        Input userInput = new Input();
        var scanner = new Scanner(System.in);
        int finalInput = scanner.nextInt();
        while (true) {
            if (finalInput == 1) {
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    System.out.println(MoviesArray.findAll()[i].Movie());  //I called the MoviesArray class and with dot notation I accessed its STATIC method.
                        }
                }
                else if(finalInput == 2) {
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        System.out.println(MoviesArray.findAll()[i].getCategory());
                    }
                    break;
                }
            }


        }
    }
