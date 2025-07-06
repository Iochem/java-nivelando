#  Banco Digital em Java — Desafio de Projeto DIO

Este repositório contém a implementação de um **sistema bancário simples** utilizando **Java e Programação Orientada a Objetos (POO)**. O projeto foi desenvolvido como parte de um **desafio de projeto prático da DIO (Digital Innovation One)**, com o objetivo de reforçar os conceitos fundamentais da POO em um contexto realista.

---

## 🧠 Objetivo

Simular o funcionamento de um **banco digital** com contas correntes e poupança, aplicando os pilares da POO:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

---

## 🚀 Funcionalidades

-  Criar cliente com nome e CPF
-  Criar conta corrente e conta poupança para o cliente
-  Fazer **aplicações (depósitos)**
-  Realizar **retiradas com verificação de saldo ou limite**
-  Fazer **transferências** entre contas
-  Simular **limites de operações** (valor máximo e número de transferências)
-  Aplicar **juros** em caso de saldo negativo (cheque especial)

---
## 📚 Conceitos Utilizados

-  **POO em Java** (classes, herança, sobrescrita, polimorfismo)
-  **Exceções personalizadas** (`SaldoNegativoException`, `LimiteOperacaoException`)
-  **Validações de regra de negócio**
-  **Interação via terminal (Scanner)**

---

## ⚙️ Regras de Negócio Implementadas

### Conta Corrente

- Permite saldo negativo até R$ -500
- Aplica juros de 2% ao entrar no cheque especial
- Não possui limite de valor ou quantidade de transferências

### Conta Poupança

- Não permite saldo negativo
- Limite de **3 transferências por execução**
- Valor máximo por transferência: **R$2000**

---
