package backendsatc.projetointermedbackendsatc.service;

import backendsatc.projetointermedbackendsatc.model.Pokemon;
import backendsatc.projetointermedbackendsatc.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private PokeApiService pokeApiService;

    private Team team;

    public TeamService() {
        this.team = new Team();
    }

    public void addPokemonToTeam(String pokemonName) throws InterruptedException, IOException {
        Pokemon pokemon = pokeApiService.getPokemonDetails(pokemonName);
        team.addPokemon(pokemon);
    }

    public List<Pokemon> listTeam()throws IOException, InterruptedException{
        return team.getPokemons();
    }
}
