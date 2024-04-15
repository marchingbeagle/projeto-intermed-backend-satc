package backendsatc.projetointermedbackendsatc.service;

import backendsatc.projetointermedbackendsatc.model.Pokemon;
import backendsatc.projetointermedbackendsatc.model.PokemonDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

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
