package groceries;

import java.util.ArrayList;

public class Groceries {
    private ArrayList<String> groceryList;
    private String groceryName;
    private int numberOfItems;

    public Groceries(String whatName ,int howMany){             //setter and constructor
        this.groceryList = new ArrayList<>();
        this.numberOfItems = howMany;
        this.groceryName = whatName;

    }

   public int getQuantity(){

        return this.numberOfItems;
   }

   public ArrayList<String> getGroceryList(){

        return this.groceryList;
   }


}
