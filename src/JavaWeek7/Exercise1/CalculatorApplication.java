package JavaWeek7.Exercise1;

import java.util.List;

public class CalculatorApplication {
    public static void main(String[] args) {

        MoneyCollector moneyCollector = new MoneyCollector();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        List<Integer> moneyCollected = moneyCollector.getPayments();
        System.out.println("The money collected is " + moneyCollected);
        Integer sumMoney = moneyCalculator.calculate(moneyCollected);
        System.out.println("The sum of the money is " + sumMoney);

    }
}
