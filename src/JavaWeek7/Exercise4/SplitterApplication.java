package JavaWeek7.Exercise4;

import JavaWeek7.Exercise3.NumberJudge;


public class SplitterApplication {
    public static void main(String[] args) {
        NumberJudge numberJudge = new NumberJudge();
        Integer number = 147896;
        System.out.println( numberJudge.split(number));

    }
}
