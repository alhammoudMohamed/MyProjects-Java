package JavaWeek8.ReflectionWeek8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.SimpleFormatter;

public class Thermostat {
    private Predicate<Double>trigger;
    private Function<Double,String>display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    public String sense(Double temperature){
        while (!trigger.test(temperature)){

            display.apply(temperature);
        }
        return "Warning!";
    }

    }