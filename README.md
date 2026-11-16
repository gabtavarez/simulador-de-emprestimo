# Simulador de Empréstimo

API REST em Java 21 + Spring Boot que simula empréstimos: recebe valor, prazo e taxa de juros e devolve parcelas e total (tabelas Price e SAC).

## Rodar

```bash
docker compose up --build
```

Swagger: http://localhost:8080/swagger-ui.html

## Testes

```bash
mvn test
```

## Stack

Java 21 · Spring Boot 3.5 · Bean Validation · springdoc-openapi · JUnit 5 · Docker
