package Pokemon_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int id;

    public Pokemon(String name, String type, int level, int id) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del Pokémon: ");
        String pokemonName = scanner.nextLine();

        PokemonTypeIdentifier identifier = new PokemonTypeIdentifier();
        Pokemon pokemon = identifier.getPokemon(pokemonName);

        if (pokemon != null) {
            System.out.println("Nombre: " + pokemon.getName());
            System.out.println("Tipo: " + pokemon.getType());
            System.out.println("Nivel: " + pokemon.getLevel());
            System.out.println("Identificación: " + pokemon.getId());
        } else {
            System.out.println("No se encontró información para " + pokemonName);
        }
    }
}

