package JavaWeek2.ExtraExercises.Exercise3;

import java.util.List;

public class BootShopApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        BootShopAssistant bootShopAssistant = new BootShopAssistant();
        List<HikingBoot> tries = bootShopAssistant.getHikingBootRecommendations();
        hansel.tryHikingBoots(tries);

    }
}
