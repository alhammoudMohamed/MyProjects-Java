package JavaWeek4.Exercise2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        String toothpaste = "Toothpaste";
        String towel = "Towel";
        String underwear= "underwear";
        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println(backpack);
        boolean containsTowel = backpack.contains(towel);
        System.out.println("Does the backpack contain a towel? " + containsTowel);
        backpack.remove(toothpaste);
        boolean containsToothpaste = backpack.contains(toothpaste);
        System.out.println("Does the backpack contain a toothpaste : " + containsToothpaste + " ? ");
        backpack.add(underwear);
        backpack.add(underwear);
        System.out.println(backpack);
        Integer backpackSize = backpack.size();
        System.out.println(backpackSize);





    }

}
