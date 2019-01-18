package JavaWeek9.Exercise5;

import JavaWeek4.Exercise9.FileReader;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    public List<Film>getFilms(){
       return new FileReader().asStream("JavaWeek9/Exercise5/films.csv")
                .skip(1)
                .map(e-> Arrays.asList(e.split(";")))
                .map(e-> new Film(e.get(8), Double.valueOf(e.get(9)),Integer.valueOf(e.get(10)),
                        Integer.valueOf(e.get(6)),Long.valueOf(e.get(0)),Long.valueOf(e.get(5))))
               .collect(Collectors.toList());
    }
}
