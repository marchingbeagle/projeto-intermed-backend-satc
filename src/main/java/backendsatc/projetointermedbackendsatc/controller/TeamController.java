package backendsatc.projetointermedbackendsatc.controller;

import backendsatc.projetointermedbackendsatc.model.Pokemon;
import backendsatc.projetointermedbackendsatc.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/team/add")
    public ResponseEntity<String> addToTeam(@RequestParam String pokemonName) throws Exception {
        teamService.addPokemonToTeam(pokemonName);
        return ResponseEntity.ok( pokemonName + " added to the team!");
    }

    @GetMapping("/team/list")
    public Object listTeam() throws Exception{
        List<Pokemon> teamList = teamService.listTeam();
        return teamList;
    }

    @GetMapping("/ajuda")
    public Object obterAjuda() {
        return new Object() {
            public String estudante = "Erik";
            public String projeto = "Pokemon Team Builder - PokeAPI";
        };
    }
}
