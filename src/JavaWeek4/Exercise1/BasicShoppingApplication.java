package JavaWeek4.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {



    List<String> groceries = new ArrayList<>();
        System.out.println(groceries);
        String Banana = "bananas";
        String Oranges = "Oranges";
        String Tomatoes = "tomatoes";
        groceries.add(Banana);
        groceries.add(Oranges);
        groceries.add(Tomatoes);
        System.out.println(groceries);
        groceries.remove(Tomatoes);
        System.out.println(groceries);
        groceries.add(Banana);
        groceries.add(Banana);
        System.out.println(groceries);
        groceries.remove(0);
        Integer GroceriesSize =groceries.size();
        System.out.println(GroceriesSize);










}
    }