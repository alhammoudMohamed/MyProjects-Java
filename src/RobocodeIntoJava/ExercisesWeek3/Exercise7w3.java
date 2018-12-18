package RobocodeIntoJava.ExercisesWeek3;

import java.util.ArrayList;
import java.util.List;

public class Exercise7w3 {
    public static void main(String[] args) {

        List<String> presentsOfMugatu = new ArrayList<>();
        presentsOfMugatu.add("coffe machine");
        presentsOfMugatu.add("sofa");
        presentsOfMugatu.add("Tv");
        presentsOfMugatu.add("table tenis");
        List<String> presentsOfSamantha = new ArrayList<>();
        presentsOfSamantha.add("flowers");
        presentsOfSamantha.add("fridge");
        presentsOfSamantha.add("coffe machine");
        presentsOfSamantha.add("Tv");
        List<String> finalList = new ArrayList<>();
        List<String> repeatedPresents = new ArrayList<>();

        finalList = presentsOfMugatu;
        for (String present : presentsOfSamantha
        ) {
            if (finalList.contains(present)) {

                repeatedPresents.add(present);
            } else finalList.add(present);


        }
        System.out.println("Mugatu's presents: " + presentsOfMugatu);
        System.out.println("Samantha's presents: " + presentsOfSamantha);
        System.out.println("The repeated list : " + repeatedPresents);
        System.out.println("The final list: " + finalList);

    }
}
