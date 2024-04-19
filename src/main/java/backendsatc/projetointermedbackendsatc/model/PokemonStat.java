package backendsatc.projetointermedbackendsatc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat {
    private String name;
}
