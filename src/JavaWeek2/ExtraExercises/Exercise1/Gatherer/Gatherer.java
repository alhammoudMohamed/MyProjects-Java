package JavaWeek2.ExtraExercises.Exercise1.Gatherer;

import JavaWeek2.ExtraExercises.Exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {
    private Scanner scanner = new Scanner(System.in);
    private AutomaticGatherer automaticGatherer = new AutomaticGatherer();


    public List<Hiker> signUp(){
        List<Hiker> hikers = new ArrayList<>();
        hikers.addAll(automaticGatherer.getConfirmedHikers());
        String name = askForHikerName();
        while (!name.isEmpty()){
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = askForHikerName();

        }
        return  hikers;


    }

    private String askForHikerName() {
        System.out.println("What is your name? ");
        return scanner.nextLine();
    }
}
