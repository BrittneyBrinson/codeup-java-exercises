package groceries;

import java.util.ArrayList;


public class GroceryCategory {
    private String categoryName;
    private ArrayList<String> Meats;
    private ArrayList<String> Dairy;
    private ArrayList<String> Fruits;
    private ArrayList<String> Beverages;


    public GroceryCategory(String whatCategory){
        this.categoryName = whatCategory;
    }

    public void addMeats(String newMeats){

        Meats.add(newMeats);
    }
    public void addDairy(String newDairy){

        Dairy.add(newDairy);
    }
    public void addFruits(String newFruits){

        Fruits.add(newFruits);
    }
    public void addBev(String newBev){

        Beverages.add(newBev);
    }
}

