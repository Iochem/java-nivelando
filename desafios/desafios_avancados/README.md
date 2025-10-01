# 🚀 Desafios Avançados em Java

Este repositório contém **desafios práticos de nível avançado em Java**, desenvolvidos para treinar conceitos avançados e boas práticas, sem a necessidade de criar uma aplicação completa.

## 📌 Desafio 1 - Optional e Streams

### Conceitos Abordados
- **Optional** : uso de `map`, `ifPresent`, `orElse` para evitar `null`.
- **Streams** : `filter`, `findFirst`, `anyMatch` para manipular coleções.
- **Pensamento funcional** : substituir `if/for` por operações fluentes mais legíveis. 
- **Manipulação de listas e objetos mutáveis** : Alterar diretamente os objetos dentro da lista

### Descrição

Praticar Optional + Streams em uma lista de horários, com manipulação de disponibilidade de forma avançada, mas em memória.


## 📌 Desafio 2 - Funções de Alta Ordem

### Conceitos Abordados
- **Predicate<T>** : Testar condições sobre objetos usando `.test(c)`.
- **Function<T, R>** :Transformar valores usando `.apply(c)` e `toUpperCase()`.
- **Consumer<T>** : Executar ações sobre objetos usando `.accept()`.
- **Programação funcional** :  separar lógica de teste, transformação e ação em funções independentes, aumentando legibilidade e modularidade.
- **Manipulação de coleções** : percorrer e aplicar funções sobre listas de objetos em memória (`ArrayList<Client>`).

### Descrição

O desafio consiste em processar uma lista de clientes e identificar aqueles elegíveis para uma promoção, treinando funções de alta ordem.

## 📌 Desafio 3 - Ordenações Encadeadas

### Conceitos Abordados
- **Comparator.comparing** : comparação baseada em atributos de objetos.
- **thenComparing** : encadeamento de critérios para desempate.
- **Comparator.comparingInt** : comparação otimizada para tipos primitivos.
- **Streams + sorted** : ordenação fluente de coleções com expressividade.
- **Programação funcional** : uso de `lambdas` e `method references` (::) para deixar o código mais limpo.

### Descrição

Praticar ordenação de listas em memória utilizando Comparator e Streams, explorando critérios encadeados com thenComparing, ordenações crescentes e decrescentes, além de comparação otimizada para tipos primitivos com comparingInt.