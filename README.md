# FULL-API-funcionarios

API REST para gerenciamento de funcionários, desenvolvida em Java com Spring Boot.

## 🚀 Sobre o projeto

Este projeto implementa uma API para cadastro, consulta, atualização e exclusão (CRUD) de funcionários. Foi desenvolvido para fins de aprendizado e prática com Spring Boot, Spring Data JPA, validação de dados e boas práticas de desenvolvimento.

## 🛠 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate Validator (Bean Validation)
- Maven
- Banco de dados: PostgreSQL
- Lombok

## 📋 Funcionalidades

- Cadastro de funcionário
- Consulta de funcionário por ID
- Listagem de todos os funcionários
- Atualização de dados do funcionário
- Remoção de funcionário
- Validação de dados de entrada com mensagens amigáveis
- Tratamento de exceções e erros

## 💻 Como rodar o projeto

### Pré-requisitos

- Java 17+ instalado
- Maven instalado
- Banco de dados configurado (SQL, noSQL e H2)

### Passos para executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/klayveralencar777/FULL-API-funcionarios.git


## 🔗 Endpoints principais

| Método | Rota                   | Descrição                                     
|--------|------------------------|--------------------------------------------
| GET    | `/funcionarios`        | Retorna a lista de todos os funcionários                                                   
| GET    | `/funcionarios/{id}`   | Retorna um funcionário específico pelo ID                                              
| POST   | `/funcionarios`        | Cria um novo funcionário                     
| PUT    | `/funcionarios/{id}`   | Atualiza os dados de um funcionário         
| DELETE | `/funcionarios/{id}`   | Remove um funcionário pelo ID   


Exemplo de corpo da requisição válido em JSON

{
  "nome": "João Pereira",
  "cpf": "555.444.333-22",
  "telefone": "(41) 98765-4321",
  "dataNascimento": "1992-07-10",
  "endereco": "Rua das Palmeiras, 150",
  "cidade": "Curitiba"
}
