package JavaWeek6.Exercise4;


import java.util.List;

public class GreedyApplication {

    public static void main(String[] args) {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> coins = greedyAlgorithm.change(22);
        System.out.println("Coins :" +coins);
        ///System.out.println("The number of coins is "+coins.size());

    }
}