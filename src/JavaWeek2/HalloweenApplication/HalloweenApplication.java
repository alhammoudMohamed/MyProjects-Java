package JavaWeek2.HalloweenApplication;

import java.util.List;

public class HalloweenApplication {

    public static void main(String[] args) {
        Journalist journalist = new Journalist();
        List<Kid> kids  = journalist.getNeighborhoodKids();
        HalloweenJudge judge = new HalloweenJudge();
        judge.displayWhoIsTheWinner (kids);

    }
}

