package JavaWeek7.Exercise1;

import java.util.*;

public class MoneyCollector {

    public List<Integer> getPayments(){
        List<Integer> moneyCollected = new ArrayList<>();
        for (int times = 0; times < 10; times++) {
            moneyCollected.add(getRandomPayment());

        }

        return moneyCollected;


    }

    private Integer getRandomPayment() {
        Random random = new Random();
        return 1 + random.nextInt(5);

    }
}