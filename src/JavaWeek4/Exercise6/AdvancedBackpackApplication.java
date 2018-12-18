package JavaWeek4.Exercise6;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        Item toothpaste = new Item("Toothpaste");
        Item towel = new Item("Towel");
        Item underwear = new Item("Underwear");
        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println("Backpack: " + backpack);
        Item towel1 = new Item("Towel");
        if (backpack.contains(towel1)){
            System.out.println("the backpack contains " + towel1);
        }
        backpack.remove(towel1);
        if (!backpack.contains(towel1)){
            System.out.println("the backpack no longer contains " + towel1);

        }

        backpack.add(underwear);
        backpack.add(underwear);
        System.out.println(backpack);
        Integer backpackSize = backpack.size();
        System.out.println(backpackSize);


    }

}
