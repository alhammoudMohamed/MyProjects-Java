package JavaWeek10.Exercise1;

public class main {
    public static void main(String[] args) {


        PokemonComparator comparator = new PokemonComparator();

        displayFastet5Pokemons(comparator);

        display5LegenderiesPokemon(comparator);

        displayFireTypePokemons(comparator);

        displayTop2HighestHPPokemons(comparator);

        displayNumberOfPokemonsAppearence(comparator);

        displayNumberOfLegenderiesPokemonsAppearence(comparator);


    }

    private static void displayNumberOfLegenderiesPokemonsAppearence(PokemonComparator comparator) {
        System.out.println("how Many TimesLegendry Pokemons Appeared: ");
        System.out.println(comparator.howManyTimesLegendryPokemonsAppeared());
    }

    private static void displayNumberOfPokemonsAppearence(PokemonComparator comparator) {
        System.out.println("How many time each pokemon appeared : ");
        System.out.println(comparator.howManyTimesEachPokemonAppeared());
    }

    private static void displayTop2HighestHPPokemons(PokemonComparator comparator) {
        System.out.println("The top 2 Highest HP pokemons: ");
        System.out.println(comparator.getTop2HPPokemons());
    }

    private static void displayFireTypePokemons(PokemonComparator comparator) {
        System.out.println("The fire type pokemons: ");
        System.out.println(comparator.get3PokemonsFireType());
    }

    private static void display5LegenderiesPokemon(PokemonComparator comparator) {
        System.out.println("The legendaries pokemons are : ");
        System.out.println(comparator.get5LegendaryPokemons());
    }

    private static void displayFastet5Pokemons(PokemonComparator comparator) {
        System.out.println("fastet five pokemons : ");
        System.out.println(comparator.getTopFiveFastestPokemon());
    }
}
