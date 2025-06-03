# API de Cartas Pokémon

Bem-vindo(a) à API de Cartas Pokémon! Esta API simples permite gerenciar uma coleção de cartas Pokémon, possibilitando operações de criação, leitura, atualização e exclusão (CRUD).

---

## Endpoints

A API está disponível no seguinte domínio base:

`https://pokemonsapi.azurewebsites.net`

---

### Cartas

Gerencie suas cartas Pokémon utilizando os seguintes endpoints:

| Método HTTP | Endpoint                        | Descrição                                         |
| :---------- | :------------------------------ | :------------------------------------------------ |
| `POST`      | `/cartas`                       | Cria uma nova carta Pokémon.                      |
| `GET`       | `/cartas`                       | Retorna todas as cartas Pokémon cadastradas.      |
| `PUT`       | `/cartas/{id}`                  | Atualiza os dados de uma carta Pokémon existente. |
| `DELETE`    | `/cartas/{id}`                  | Exclui uma carta Pokémon.                         |

---

## Estrutura de Pastas


json\n{\n\u00A0 "nome": "Carta",\n\u00A0 "status": "PRESENTE",\n\u00A0 "imgUrl": "URL da Imagem"\n}\nesta estrutura de pastas', source_references=['uploaded:ALL']))&lt;ctrl98>
Este não é um projeto Next.js. A estrutura de pastas na imagem, com src/main/java/com/cartas/pokemon e subpastas como config, controllers, dtos, entities, enums, repositories, e services, é típica de um projeto Java Spring Boot. O arquivo PokemonApplication.java também sugere um aplicativo Spring Boot.

Aqui está o README atualizado, incluindo a seção para a estrutura de pastas:

Markdown

# API de Cartas Pokémon

Bem-vindo(a) à API de Cartas Pokémon! Esta API simples permite gerenciar uma coleção de cartas Pokémon, possibilitando operações de criação, leitura, atualização e exclusão (CRUD).

---

## Estrutura do Projeto

O projeto segue uma estrutura padrão de um aplicativo **Java Spring Boot**, organizada da seguinte forma:

src
├── main
│   ├── java
│   │   └── com
│   │       └── cartas
│   │           └── pokemon
│   │               ├── config
│   │               │   └── CorsConfig.java
│   │               ├── controllers
│   │               │   └── CartaController.java
│   │               ├── dtos
│   │               │   └── CartaDTO.java
│   │               ├── entities
│   │               │   └── Carta.java
│   │               ├── enums
│   │               │   └── Status.java
│   │               ├── repositories
│   │               │   └── CartaRepository.java
│   │               └── services
│   │                   ├── CartaService.java
│   │                   └── PokemonApplication.java
│   └── resources


## Exemplos de Uso

A seguir, você encontrará exemplos de como interagir com a API, focando nos **corpos de requisição (JSON)** para cada operação.

### Criar uma Carta (POST)

Para criar uma nova carta, envie uma requisição `POST` para `/cartas` com o seguinte corpo JSON:

```json
{
  "nome": "Carta",
  "status": "PRESENTE",
  "imgUrl": "URL da Imagem"
}
