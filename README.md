# projeto-intermed-backend-satc
## PokeTeam API

Uma API Java Spring Boot para gerenciar equipes de Pokémon usando a PokeAPI.
Visão Geral

A API PokeTeam fornece endpoints para interagir com a PokeAPI e gerenciar equipes de Pokémon. Você pode adicionar Pokémon à sua equipe especificando seus nomes, e a API buscará os detalhes necessários na PokeAPI.
### Configuração

Clonar o Repositório:

```bash
git clone https://github.com/seunomeusuario/poketeam-api.git
cd poketeam-api
```


### Construir o Projeto:

```bash
mvn clean install
```

### Endpoints

- "/ajuda"
- "/team/add"
- "/team/list"
 
### Exemplo de Resposta:

  "/ajuda":
```json
{
    "estudante": "Erik",
    "projeto": "Pokemon Team Builder - PokeAPI"
}
```

  "/team/add":
```json
gengar added to the team!
```
  "/team/list":
```json
{
    "lista": [
        {
            "name": "gengar",
            "id": 94,
            "height": 15,
            "weight": 405
        }
    ]
}
```

### Dependências

    Spring Boot
    Spring Web
    Lombok
