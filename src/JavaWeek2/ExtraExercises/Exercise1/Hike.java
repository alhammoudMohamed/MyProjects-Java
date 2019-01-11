package JavaWeek2.ExtraExercises.Exercise1;

import JavaWeek2.ExtraExercises.Exercise1.Gatherer.Gatherer;

import java.util.ArrayList;
import java.util.List;

public class Hike {
    private Gatherer gatherer = new Gatherer();
    private List<Hiker> hikers = new ArrayList<>();
    public void signUp(){
    hikers = gatherer.signUp();

    }
    public void showHikers(){
        for (Hiker hiker : hikers) {
            System.out.println("The hiker is " + hiker.getName());
        }
    }
}
