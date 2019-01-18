package JavaWeek9.Exercise5;

import java.util.List;

public class filmApplication {
    public static void main(String[] args) {
        FilmSummarizer filmSummarizer = new FilmSummarizer();
        List<Film> topThreeRating  = filmSummarizer.getThreeHighestRating();
        System.out.println("Top 3 with highest rating, sorted by rating: ");
        System.out.println(topThreeRating);
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating:");
        System.out.println(filmSummarizer.getThreeHighestRatingLongerThanThreeHours());
        System.out.println("Top 4 most expensive, sorted by budget:");
        System.out.println(filmSummarizer.getFourMostExpensiveFilms());
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget:");
        System.out.println(filmSummarizer.getMostExpensiveShorterThanOneAndHalfHours());
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        System.out.println(filmSummarizer.getFilmsRatedMoreThanSeven());
        System.out.println("The cheapest film, sorted by budget");
        System.out.println(filmSummarizer.getCheapestFilms());
        System.out.println("The the worst rating film, sorted by rating");
        System.out.println(filmSummarizer.getWorstRatingFilms());
    }
}
