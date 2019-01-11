package JavaWeek8.ReviewExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sensor {
    List<Instruction> instructions = Arrays.asList(
            new ReversedInstructions(),
            new InstructionsWithNoHash(),
            new InstructionsWithNoExMark());


    public Optional<String> decrypt(String line) {
        //String word = "";
        for (Instruction instruction : instructions) {
            if (instruction.isUniuqeInsturction(line)) {
                String word = instruction.getUniqueInstrucition(line);
                return Optional.of(word);

            }
        }
        return Optional.empty();
    }
}
