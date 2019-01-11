package JavaWeek8.ReviewExercise;
public class InstructionsWithNoHash implements Instruction {
    @Override
    public String getUniqueInstrucition(String line) {
          line = line.replaceAll("#", "");
        line = line.replaceAll("robomime","");
        return line;
    }
    @Override
    public boolean isUniuqeInsturction(String line) {
        return line.contains("#");
    }
}
