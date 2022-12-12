package groceries;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Do you want to create a grocery list?");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.println("Please pick a category!" +
                        "\n 1) Fruits" +
                        "\n 2) Dairy" +
                        "\n 3) Meats" +
                        "\n 4) Beverages");
                int whatNext = scanner.nextInt();
                if (whatNext == 1) {
                    System.out.println("What is the name of the grocery for the FRUIT category?");
                    String whatFruit = scanner.next();
                    System.out.println("How many " + whatFruit + " do you want to add ?");
                    int howManyFruits = scanner.nextInt();
                    var fruitList = new HashMap<>();
                    fruitList.put(whatFruit, howManyFruits);
                    System.out.println("Perfect! Are you done adding items? if yes, then the list will be finalized.");
                    String finalChoice = scanner.next();
                        if(finalChoice.equalsIgnoreCase("yes")){
                            System.out.println(fruitList.toString());
                        }
                        else{continue;}
                } else {
                    System.out.println("Goodbye! Have a nice day :)");
                }
            }

        }

    }
}
