package JavaWeek8.ReviewExercise;

public class InstructionsWithNoExMark implements Instruction {

    @Override
    public String getUniqueInstrucition(String line) {
        String replaceAll = line.replaceAll("!", "");
        return replaceAll ;
    }

    @Override
    public boolean isUniuqeInsturction(String line) {
        return line.contains("!");
    }
}
