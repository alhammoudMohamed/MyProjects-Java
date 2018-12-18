package JavaWeek6.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee brew = coffeeMaker.brew();
            System.out.println(brew.getMadeBy() + brew.getBrewedTime());
        }
        List<CoffeeMaker> coffeeMakers1 = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers1) {
            checkOne(coffeeMaker.getName());
        }
        checkOne("blabla");
    }
    private static void checkOne(String name) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
        if (coffeeMaker.isPresent()) {
            coffeeMaker.get().brew();
            System.out.println(coffeeMaker.get().getName() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes");
        } else
            System.out.println("The coffee maker with the name " + name + " pot is not available");

    }



}
