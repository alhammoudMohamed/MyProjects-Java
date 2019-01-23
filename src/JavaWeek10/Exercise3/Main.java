package JavaWeek10.Exercise3;

public class Main {
    public static void main(String[] args) {
        SmsComparator comparator = new SmsComparator();

        System.out.println("Ham/spam ratio: " + comparator.getHamToSpamRatio());

        comparator.getMostAppearingWordInHam();

        comparator.getMostUsedHamLetter();
        comparator.getLongestSpamMessage();
    }












}
