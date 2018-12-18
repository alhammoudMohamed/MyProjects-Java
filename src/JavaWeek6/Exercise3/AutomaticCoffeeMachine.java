package JavaWeek6.Exercise3;

public class AutomaticCoffeeMachine extends CoffeeMaker {
    @Override
    public String getName() {
        return "Automatic Coffee Machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }
}
