package JavaWeek2.ExtraExercises.Exercise1.Gatherer;

import JavaWeek2.ExtraExercises.Exercise1.Hiker;

import java.util.Arrays;
import java.util.List;

public class AutomaticGatherer {
    List<Hiker>getConfirmedHikers(){
        List<Hiker> hikers = Arrays.asList(
                new Hiker("Mohamed"),
                new Hiker("Mustafa"),
                new Hiker("Hala"),
                new Hiker("Khajag"));
        return hikers;

    }
}
