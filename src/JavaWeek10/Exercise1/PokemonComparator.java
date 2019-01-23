package JavaWeek10.Exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonComparator {
    private PokemonReader reader = new PokemonReader();

    public List<Pokemon> getTopFiveFastestPokemon() {
        return reader.getPokemons().stream()
                .sorted(Comparator.comparing(Pokemon::getSpeed))
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Pokemon> get5LegendaryPokemons() {
        return reader.getPokemons().stream()
                .filter(p -> p.getLegendary().equalsIgnoreCase("true"))
                .limit(5)
                .collect(Collectors.toList());
    }

    public Set<Pokemon> get3PokemonsFireType() {
        return reader.getPokemons().stream()
                .filter(p -> p.getType().equalsIgnoreCase("fire"))
                .limit(3)
                .collect(Collectors.toSet());
    }


    public Set<Pokemon> getTop2HPPokemons(){
        return reader.getPokemons().stream()
                .sorted(Comparator.comparing(Pokemon::getHP).reversed())
                .limit(2)
                .collect(Collectors.toSet());
}

    public Map<Pokemon, Long> howManyTimesEachPokemonAppeared(){
        return reader.getPokemons().stream()
                .collect(Collectors.groupingBy(p->p,Collectors.counting()));

    }

    public Map<Pokemon,Long> howManyTimesLegendryPokemonsAppeared(){
        return reader.getPokemons().stream()
                .filter(p->p.getLegendary().equalsIgnoreCase("True"))
//                .limit(3)
                .collect(Collectors.groupingBy(p->p,Collectors.counting()));


    }




}
