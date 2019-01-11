package JavaWeek8.ReflectionWeek8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.SimpleFormatter;

public class Thermostat {

    public String sense(Double temperature,Predicate<Double>trigger,Function<Double,String> display){
        while (!trigger.test(temperature)){

            display.apply(temperature);
        }
        return "Warning";
    }

    }