package JavaWeek6.Exercise3;

public class FrenchPress extends CoffeeMaker {
    @Override
    public String getName() {
        return "French Press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;
    }
}
