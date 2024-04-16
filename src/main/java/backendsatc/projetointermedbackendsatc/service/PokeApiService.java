package backendsatc.projetointermedbackendsatc.service;

import backendsatc.projetointermedbackendsatc.model.Pokemon;
import backendsatc.projetointermedbackendsatc.model.PokemonDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeApiService {
    private static final String POKEAPI_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemonDetails(String pokemonName){
        String apiUrl = POKEAPI_BASE_URL + pokemonName;
        RestTemplate restTemplate = new RestTemplate();

        try {
            PokemonDTO pokemonDTO = restTemplate.getForObject(apiUrl, PokemonDTO.class);
            return mapToPokemon(pokemonDTO);
        } catch (RestClientException e){
           e.printStackTrace();
           return null;
        }
    }

    private Pokemon mapToPokemon(PokemonDTO pokemonDTO) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(pokemonDTO.getName());
        pokemon.setId(pokemonDTO.getId());
        pokemon.setHeight(pokemonDTO.getHeight());
        pokemon.setWeight(pokemonDTO.getWeight());

        return pokemon;
    }
}
