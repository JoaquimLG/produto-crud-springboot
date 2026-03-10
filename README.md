# CRUD de Produtos com Java e Spring Boot

## Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST para
gerenciamento de produtos, implementando operações básicas de CRUD
(Create, Read, Update e Delete).

O objetivo principal deste projeto foi **ter contato, aprender e praticar o
desenvolvimento de APIs REST utilizando Java e Spring Boot**, além de
explorar o uso de ferramentas e frameworks comuns no ecossistema Spring.

A API permite cadastrar, listar, buscar, atualizar e remover produtos,
com validações de dados e persistência em banco de dados.

------------------------------------------------------------------------

## Tecnologias utilizadas

-   **Java** -- Linguagem utilizada no desenvolvimento da aplicação.
-   **Spring Boot** -- Framework utilizado para facilitar a criação da
    aplicação e configuração do servidor.
-   **Spring Data JPA** -- Responsável pela comunicação entre a
    aplicação e o banco de dados.
-   **H2 Database** -- Banco de dados em memória utilizado para testes e
    desenvolvimento.
-   **Lombok** -- Utilizado para reduzir código repetitivo, gerando
    automaticamente getters, setters e construtores.
-   **Jakarta Validation** -- Utilizado para validação de dados nas
    requisições da API.

------------------------------------------------------------------------

## Estrutura do projeto

O projeto segue uma organização em camadas, separando responsabilidades
entre diferentes pacotes:

-   **model** -- Contém a entidade do sistema (representação das
    tabelas do banco).
-   **repository** -- Responsável pelo acesso aos dados utilizando
    Spring Data JPA.
-   **service** -- Camada de regras de negócio da aplicação.
-   **controller** -- Responsável por expor os endpoints da API REST.

Essa separação facilita a manutenção, escalabilidade e organização do
código.

------------------------------------------------------------------------

## Funcionalidades da API

A API disponibiliza os seguintes endpoints:

  Método   Endpoint         Descrição
  -------- ---------------- -------------------------------
  GET      /produtos        Lista todos os produtos
  GET      /produtos/{id}   Busca um produto pelo ID
  POST     /produtos        Cria um novo produto
  PUT      /produtos/{id}   Atualiza um produto existente
  DELETE   /produtos/{id}   Remove um produto

------------------------------------------------------------------------

## Validações

A entidade Produto possui validações utilizando Jakarta Validation:

-   O **nome** não pode estar em branco
-   O **preço** é obrigatório e não pode ser negativo
-   A **quantidade** é obrigatória e não pode ser negativa

------------------------------------------------------------------------

## Banco de dados

O projeto utiliza o **H2 Database**.

O banco é configurado com **persistência em arquivo**, permitindo que os
dados não sejam perdidos ao reiniciar a aplicação durante o
desenvolvimento.

Também é possível acessar o **console do H2** pelo navegador para
visualizar os dados diretamente no banco.

------------------------------------------------------------------------

## Como executar o projeto

### Pré-requisitos

-   Java 17 ou superior
-   Maven
-   IDE de sua preferência (IntelliJ, Eclipse ou VS Code)

### Passos

1.  Clone o repositório

``` bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2.  Abra o projeto na sua IDE de preferência


3.  Execute o projeto utilizando a classe:

    **ProdutoCrudSpringbootApplication**


A aplicação será iniciada normalmente na porta padrão:

    http://localhost:8080

------------------------------------------------------------------------

## Como testar a API

A API pode ser testada utilizando ferramentas que realizam requisições
HTTP, como:

-   Postman
-   Insomnia

### Exemplo de requisição para criar um produto

**POST**

    http://localhost:8080/produtos

**Body (JSON)**

``` json
{
  "nome": "Teclado",
  "preco": 120.0,
  "quantidade": 10
}
```

### Exemplo para listar produtos

**GET**

    http://localhost:8080/produtos

------------------------------------------------------------------------

## Boas práticas adotadas

O projeto foi desenvolvido seguindo algumas boas práticas de
desenvolvimento:

-   Separação em camadas (Controller, Service, Repository e Model)
-   Uso de validações para garantir integridade dos dados
-   Utilização de ResponseEntity para respostas HTTP adequadas
-   Uso de Optional para evitar problemas com valores nulos
-   Padrões de commit organizados
-   Estrutura de pacotes clara e bem definida

------------------------------------------------------------------------

## Objetivo educacional

Este projeto foi desenvolvido com foco em aprendizado, buscando
compreender melhor:

-   Desenvolvimento de APIs REST
-   Arquitetura em camadas
-   Integração com banco de dados utilizando JPA
-   Validação de dados em APIs
-   Organização de projetos Spring Boot
