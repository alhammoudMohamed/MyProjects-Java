package JavaWeek10.Exercise1;

import JavaWeek4.Exercise9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    FileReader reader = new FileReader();

    public List<Pokemon> getPokemons() {
        return reader.asStream("JavaWeek10/Exercise1/pokemon.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Pokemon(
                        columns[1],
                        columns[2],
                        Integer.valueOf(columns[6]),
                        Integer.valueOf(columns[10]),
                        Integer.valueOf(columns[11]),
                        columns[12]))
                .collect(Collectors.toList());


    }
}
