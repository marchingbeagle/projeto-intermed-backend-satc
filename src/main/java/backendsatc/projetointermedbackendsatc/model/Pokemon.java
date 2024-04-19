package backendsatc.projetointermedbackendsatc.model;

import lombok.Data;

@Data
public class Pokemon {
    private String name;
    private int id;
    private int height;
    private int weight;
    private PokemonStatsDTO[] stats;
}
