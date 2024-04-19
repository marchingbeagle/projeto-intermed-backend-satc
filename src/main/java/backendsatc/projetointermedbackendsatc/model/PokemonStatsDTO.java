package backendsatc.projetointermedbackendsatc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStatsDTO {
    private int base_stat;
    private PokemonStat stat;
}
