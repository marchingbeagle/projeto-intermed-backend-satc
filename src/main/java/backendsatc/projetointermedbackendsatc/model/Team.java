package backendsatc.projetointermedbackendsatc.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Team {
    private List<Pokemon> pokemons;

    public Team() {
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
}
