package JavaWeek2.ExtraExercises.Exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {

    public List<HikingBoot> getHikingBootRecommendations() {
        List<HikingBoot> boots = Arrays.asList(
                new HikingBoot(40),
                new HikingBoot(41),
                new HikingBoot(42));
        Collections.shuffle(boots);

        return boots;

    }


}
