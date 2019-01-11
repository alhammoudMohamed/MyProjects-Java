package JavaWeek2.ExtraExercises.Exercise3;

import java.util.List;

public class Hansel {
    private Integer footSize= 41;
    private boolean isRightSize(HikingBoot boot){
        return footSize.equals(boot.getSize());
    }
    public void tryHikingBoots(List<HikingBoot>boots){
        for (HikingBoot boot : boots) {
            if(isRightSize(boot)){
                System.out.println("I am buying these shoes");
                return;
            }
            System.out.println("These do not fit, sorry");
        }
    }
}

