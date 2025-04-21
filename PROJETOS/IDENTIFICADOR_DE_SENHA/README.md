# Identificador de Senha (Java)

Este projeto é um identificador e verificador de senha desenvolvido em Java. O usuário define uma senha numérica e depois deve digitá-la corretamente. O programa permite no máximo **5 tentativas** e possui **tratamento de exceções** para garantir que apenas números inteiros sejam aceitos como entrada.

## Funcionalidades

- ✅ Armazena uma senha numérica definida pelo usuário  
- ✅ Solicita a senha até o usuário acertar ou esgotar 5 tentativas  
- ✅ Exibe mensagens personalizadas em caso de erro  
- ✅ Utiliza `try/catch` para evitar exceções ao digitar dados inválidos

## Tecnologias e conceitos ustilizados

- Java 17+
- `Scanner` para entrada de dados
- `try/catch` para tratamento de exceções

## Como executar

1. Clone o repositório ou copie o código `IdentificadorDeSenha.java`
2. Compile e execute com um terminal ou no VS Code:

```bash
javac IdentificadorDeSenha.java
java IdentificadorDeSenha
