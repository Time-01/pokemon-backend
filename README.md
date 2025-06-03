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

## Estrutura do Projeto

O projeto segue uma estrutura padrão de um aplicativo **Java Spring Boot**, organizada da seguinte forma:

src
<p></p>
├── main
<p></p>
│   ├── java
<p></p>
│   │   └── com
<p></p>
│   │       └── cartas
<p></p>
│   │           └── pokemon
<p></p>
│   │               ├── config
<p></p>
│   │               │   └── CorsConfig.java
<p></p>
│   │               ├── controllers
<p></p>
│   │               │   └── CartaController.java
<p></p>
│   │               ├── dtos
<p></p>
│   │               │   └── CartaDTO.java
<p></p>
│   │               ├── entities
<p></p>
│   │               │   └── Carta.java
<p></p>
│   │               ├── enums
<p></p>
│   │               │   └── Status.java
<p></p>
│   │               ├── repositories
<p></p>
│   │               │   └── CartaRepository.java
<p></p>
│   │               └── services
<p></p>
│   │                   ├── CartaService.java
<p></p>
│   │                   └── PokemonApplication.java
<p></p>
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
