package ReflectionWeek5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {
    private String manual(){
        return "manual";
    }
    private String automatic(){
        return "automatic";
    }


    public String getNextCar(String brand) {
        Random random = new Random();
        List<String> carkind = Arrays.asList(manual(), automatic());
        String car = null;
        for (int i = 0; i < 1; i++) {
            int position = random.nextInt();
            car = carkind.get(position);

        }


        return car;


    }
}
