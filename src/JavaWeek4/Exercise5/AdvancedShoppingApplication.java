package JavaWeek4.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        Grocery banana = new Grocery("banana");
        Grocery orange = new Grocery("orange");
        Grocery tomatoes = new Grocery("tomatoes");
        groceries.add(banana);
        groceries.add(orange);
        groceries.add(tomatoes);
        System.out.println("Groceries " + groceries);
        Grocery tomatoes1 = new Grocery("tomatoes");
        groceries.remove(tomatoes1);
        System.out.println(groceries);
        groceries.add(orange);
        groceries.add(orange);
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        Integer groceriesSize = groceries.size();
        System.out.println(groceriesSize);







    }


}