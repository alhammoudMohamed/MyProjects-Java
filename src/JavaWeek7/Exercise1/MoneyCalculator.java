package JavaWeek7.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class MoneyCalculator {
    public Integer calculate(List<Integer> moneyAsList) {

        Integer sum = 0;
        for (Integer integer :moneyAsList ) {
            sum += integer;

        }

        return sum;
    }

}

