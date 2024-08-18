Claro! Aqui está um README atualizado para o seu projeto `busca-cliente-API`, incluindo informações sobre como acessar o Swagger para visualizar a documentação da API:

---

# Projeto: Busca Cliente API

## Sobre o Projeto

A **Busca Cliente API** é uma aplicação back-end construída com Spring Boot, projetada para gerenciar clientes e realizar consultas de CEP utilizando a API do ViaCEP. O projeto é uma demonstração de práticas de desenvolvimento de APIs RESTful em Java, utilizando uma arquitetura simples e eficiente.

## Layout da Aplicação

### <img
### [🔗 Screenshot 2](link_para_screenshot2)

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Feign**
- **H2 Database**
- **Lombok**
- **Maven**

## Como Executar o Projeto

### Pré-requisitos

- **Java 17** ou superior
- **Maven**

### Passos para executar

```bash
# Clonar repositório
git clone https://github.com/marcelojacint/busca-cliente-API.git

# Entrar no diretório do projeto
cd busca-cliente-API

# Executar o projeto
./mvnw spring-boot:run
```

## Testes

Para rodar os testes, use o comando:

```bash
./mvnw test
```

## Documentação da API

A documentação da API é gerada e disponibilizada através do Swagger. Após iniciar a aplicação, você pode acessá-la no seguinte endereço:

[Swagger UI - Documentação da API](http://localhost:8080/swagger-ui.html)

## API Endpoints

- **GET /clientes:** Retorna a lista de clientes.
- **POST /clientes:** Cria um novo cliente.
- **PUT /clientes/{id}:** Atualiza os dados de um cliente existente.
- **DELETE /clientes/{id}:** Remove um cliente da base de dados.
- **GET /clientes/{id}:** Retorna os detalhes de um cliente específico.

## Contribuindo

Contribuições são bem-vindas! Se você deseja contribuir com o projeto, sinta-se à vontade para abrir _issues_ ou enviar _pull requests_.
