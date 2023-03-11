# Desafio DIO Academia Digital

## Sobre o projeto

Academia Digital é uma aplicação REST desenvolvida na linguagem JAVA conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o Spring Data JPA. Para isso, uma <strong>API RESTful</strong> será desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.


## Stack utilizada

    IDE IntelliJ
    Java 11
    Maven
    Spring Web
    Spring Data JPA
    PostgreSQL Driver
    Hibernate Validator
    Lombok
    Spring Doc OpenAPI


## Rodando localmente

Antes de rodar é necessário criar o banco de dados academia no PostGreSQL e configurar usuário e senha no application.yml

```bash
# clonar repositório
https://github.com/BrunoRiguetto/AcademiaDIO.git

# entrar na pasta do projeto hermesConfiguracoes
cd academia-digital

# executar o projeto
./mvnw spring-boot:run
```


## Documentação da API

A documentação foi desenvolvida para que o acesso seja fácil a todos os interessados, através de ferramentas de OpenApi, pode ser acessada da seguinte maneira:

- Após rodar a aplicação acessar o link do Swagger, podendo executar os endpoints: http://localhost:8081/swagger-ui/index.html#/


## Autores

Bruno Riguetto 
