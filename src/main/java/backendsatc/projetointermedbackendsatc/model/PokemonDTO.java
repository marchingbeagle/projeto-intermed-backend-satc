package backendsatc.projetointermedbackendsatc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDTO {
    private String name;
    private int id;
    private int height;
    private int weight;
}