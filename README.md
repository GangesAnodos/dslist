# dslist - Backend API

### Descrição do Projeto

Este é o projeto de backend da aplicação dslist, desenvolvido durante o "Intensivão Java Spring Boot". Trata-se de uma API REST para gerenciar listas de jogos, permitindo a consulta de jogos e a organização de listas com funcionalidade de reordenação.

### Tecnologias Utilizadas

* **Java**: O projeto utiliza a versão 21 do Java.
* **Spring Boot**: Framework principal para a construção da API, simplificando o desenvolvimento de aplicações Java.
* **Spring Data JPA**: Utilizado para a persistência de dados e abstração da camada de acesso ao banco de dados.
* **Maven**: Ferramenta de gerenciamento de dependências e de build.
* **PostgreSQL**: Banco de dados relacional configurado para o ambiente de desenvolvimento e produção.
* **H2 Database**: Banco de dados em memória utilizado para o ambiente de testes.

### Funcionalidades da API

A API já implementa as seguintes funcionalidades:

* **Listar todos os games**: Endpoint `GET /games` para buscar todos os jogos disponíveis.
* **Buscar game por ID**: Endpoint `GET /games/{gameId}` para obter os detalhes de um jogo específico.
* **Listar listas de games**: Endpoint `GET /lists` para obter todas as listas de jogos cadastradas.
* **Listar games de uma lista**: Endpoint `GET /lists/{listId}/games` para obter todos os jogos de uma lista específica, ordenados por posição.
* **Reordenar games em uma lista**: Endpoint `POST /lists/{listId}/replacement` para mover a posição de um jogo dentro de uma lista.

### Como Executar o Projeto

#### Pré-requisitos
* Java 21
* Apache Maven
* Docker (para rodar o banco de dados)

#### 1. Configuração do Banco de Dados
O projeto utiliza um banco de dados PostgreSQL. Para o ambiente de desenvolvimento, você pode iniciá-lo facilmente com o Docker.

Execute o seguinte comando no terminal:
```bash
docker run --name dslist-db -e POSTGRES_PASSWORD=1234567 -p 5433:5432 -d postgres
```
