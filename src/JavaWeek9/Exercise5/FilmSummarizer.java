package JavaWeek9.Exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    private FilmReader filmReader = new FilmReader();


    public List<Film> getThreeHighestRating() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScour).reversed())
                .limit(3)
                .collect(Collectors.toList());


    }

    public List<Film> getThreeHighestRatingLongerThanThreeHours() {
        return filmReader.getFilms().stream()
                .filter(e -> e.getRunTime() >   180)
                .sorted(Comparator.comparing(Film::getScour).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getFourMostExpensiveFilms() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());


    }


    public List<Film> getMostExpensiveShorterThanOneAndHalfHours() {
        return filmReader.getFilms().stream()
                .filter(e -> e.getRunTime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());

    }

    public List<Film> getFilmsRatedMoreThanSeven() {
        return filmReader.getFilms().stream()
                .filter(e -> e.getScour() > 7.0)
                .filter(e -> e.getBudget() > 50000)
                .filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());


    }

    public List<Film> getCheapestFilms() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget))
                .limit(1)
                .collect(Collectors.toList());
    }

    public List<Film> getWorstRatingFilms() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScour))
                .limit(1)
                .collect(Collectors.toList());
    }


}

