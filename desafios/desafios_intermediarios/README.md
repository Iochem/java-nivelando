# 🚀 Desafios Intermediários em Java

Este repositório contém dois desafios práticos de nível **intermediário**, desenvolvidos em Java. Os exercícios exploram conceitos importantes como algoritmos de busca, manipulação de dados, estruturas de repetição e matemática aplicada.

---

## 📌 Desafio 1 - Busca Binária

### Conceitos Abordados
- **Algoritmo de Busca Binária**: técnica eficiente de busca em arrays ordenados, com complexidade `O(log n)`
- **Estruturas de repetição**: uso do `while`
- **Comparação e controle de índices** em arrays
- **Leitura de entrada do usuário** com `Scanner`

### Descrição

O programa realiza a **busca binária** de um número informado pelo usuário dentro de um array ordenado. Ele compara o valor procurado com o elemento central do array e reduz o intervalo de busca pela metade a cada passo.

---

# 📌 Desafio 2 - Redução de Dígitos (Raiz Digital)

### Conceitos Abordados/
- **Manipulação de Strings** e conversão de tipos
- **Iteração** sobre caracteres com `for-each`
- **Repetição** com `while` até a condição de parada ser satisfeita
- **Matemática aplicada**: cálculo da **raiz digital**
- **Construção de lógica** para redução numérica
### Descrição

O usuário digita um número inteiro positivo, e o programa realiza a soma repetida dos dígitos desse número até que reste apenas um único dígito.
Esse processo é conhecido como raiz digital, e é usado, por exemplo, como verificação de erros em sistemas numéricos (como ISBNs, códigos de barras etc).
---

## 📌 Desafio 3 - Validador CPF

### Conceitos Abordados
- Manipulação de Strings e limpeza de entrada (remoção de caracteres não numéricos)
- Conversão de caracteres para números inteiros
- Cálculo matemático com pesos regressivos para dígitos verificadores
- Estrutura condicional e repetição (loops)
- Validação de dados e verificação de casos especiais (ex: CPF com todos os dígitos iguais)
- Modularização do código em métodos

### Descrição
O programa recebe um CPF e verifica sua validade seguindo as regras oficiais, calculando os dígitos verificadores a partir dos 9 primeiros números e rejeitando entradas inválidas como CPFs com todos os dígitos iguais ou tamanho incorreto.

---