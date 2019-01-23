package JavaWeek8.ReviewExercise;

import JavaWeek4.Exercise9.FileReader;

import java.util.*;

public class main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
         List<String> lines = fileReader.asLines("JavaWeek8/ReviewExercise/robomime.txt");
         Sensor sensor = new Sensor();
         List<String> instructions = new ArrayList<>();
        for (String line : lines) {
             Optional<String> decrypted = sensor.decrypt(line);
             instructions.add(decrypted.get());

        }
        System.out.println(instructions);
        Set<Instruction> instructions1 = new HashSet(instructions);
        System.out.println(instructions1);
        System.out.println(instructions1.size());
    }
    }