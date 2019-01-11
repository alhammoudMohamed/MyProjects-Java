package JavaWeek8.ReviewExercise;

import JavaWeek4.Exercise9.FileReader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DecryptorTest {

    @Test
    List<Optional<String>> main() {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.asLines("JavaWeek8/ReviewExercise/robomime.txt");
        Sensor sensor = new Sensor();
        List<Optional<String>> instructions = new ArrayList<>();
        for (String line : lines) {
            Optional<String> decrypted = sensor.decrypt(line);
            instructions.add(decrypted);
        }
        return instructions;

    }
}