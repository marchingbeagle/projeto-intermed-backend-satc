package backendsatc.projetointermedbackendsatc.controller;

import backendsatc.projetointermedbackendsatc.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/add/{pokemonName}")
    public ResponseEntity<String> addToTeam(@PathVariable String pokemonName) throws IOException, InterruptedException {
        teamService.addPokemonToTeam(pokemonName);
        return ResponseEntity.ok("Pokemon " + pokemonName + " added to the team!");
    }
}
