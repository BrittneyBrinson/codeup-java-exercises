package movies;

import util.Input;
public class MoviesApplication {

    public static void main(String[] args) {
        System.out.println("Please pick an option " +
                "\n _____________________________" +
                "\n Enter option 1: View all movies!" +
                "\n Enter option 2:view movies in the animated category!" +
                "\n Enter option 3:view movies in the drama category!" +
                "\n Enter option 4:view movies in the horror category!" +
                "\n Enter option 5:view movies in the scifi category!");
        Input userInput = new Input();
        int finalInput = userInput.getInt();
        System.out.println(finalInput);
        while (true) {
            if (finalInput == 1) {
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    System.out.println(MoviesArray.findAll()[i].Movie() + "--" + MoviesArray.findAll()[i].getCategory());  //I called the MoviesArray class and with dot notation I accessed its STATIC method.
                }
                break;
            } else if (finalInput == 2) {
                for (Movie animatedOnly : MoviesArray.findAll()) {
                    if (animatedOnly.getCategory().equals("animated")) {
                        System.out.println(animatedOnly.Movie());
                    }
                }
                break;
            } else if (finalInput == 3) {
                for (Movie dramaOnly : MoviesArray.findAll()) {
                    if (dramaOnly.getCategory().equals("drama")) {
                        System.out.println(dramaOnly.Movie());
                    }
                }
                break;
            } else if (finalInput == 4) {
                for (Movie horrorOnly : MoviesArray.findAll()) {
                    if (horrorOnly.getCategory().equals("horror")) {
                        System.out.println(horrorOnly.Movie());
                    }
                }
                break;
            } else if (finalInput == 5) {
                for (Movie scifiOnly : MoviesArray.findAll()) {
                    if (scifiOnly.getCategory().equals("scifi")) {
                        System.out.println(scifiOnly.Movie());
                    }
                }
                break;
            }
        }


    }
}


