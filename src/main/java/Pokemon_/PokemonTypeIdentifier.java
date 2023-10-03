package Pokemon_;

import java.util.HashMap;
import java.util.Map;

public class PokemonTypeIdentifier {
    private static Map<String, Pokemon> pokemonDatabase = new HashMap<>();

    static { // Agrega los Pokémon y sus características
        pokemonDatabase.put ("Charmander", new Pokemon("Charmander", "Fuego", 5, 1));        
        pokemonDatabase.put("Bulbasaur", new Pokemon("Bulbasaur", "Planta/Veneno", 3, 2));
        pokemonDatabase.put ("Squirtle", new Pokemon("Squirtle", "Agua", 5, 3));
        pokemonDatabase.put("Pikachu", new Pokemon("Pikachu", "Eléctrico", 30, 4));
    }

    public static Pokemon getPokemon(String pokemonName) {
        return pokemonDatabase.get(pokemonName);
    }

    static String getType(String pokemonName) {
        throw new UnsupportedOperationException("No esta");
    }
}
