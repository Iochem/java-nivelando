# Sistema de Controle de Notas 

Este projeto implementa um sistema simples para gerenciar notas e médias de um aluno por matéria, com funcionalidades para adicionar matérias, lançar notas, calcular médias e verificar aprovação.

---

## Funcionalidades

- Cadastro de matérias
- Lançamento de múltiplas notas por matéria
- Cálculo da média de notas por matéria
- Exibição de todas as matérias com suas médias e status (Aprovado/Reprovado)
- Validação de entradas e tratamento de erros com exceções personalizadas

---

## Estrutura do Projeto

- `Aluno` - Armazena o nome do aluno e um `HashMap` associando cada matéria à sua média.
- `ControladorDeNotas` - Controla as operações de adicionar notas, calcular médias, exibir resultados e validação.
- `Main` - Interface em terminal para interação com o usuário via menu.
- Exceções personalizadas:
    - `MateriaNaoDefinidaException`: lançada quando se tenta adicionar nota ou calcular média sem definir a matéria.
    - `NotaOuMediaInexistenteException`: lançada quando não há notas adicionadas ou a média ainda não foi calculada.

---

## Exceções Personalizadas

O uso de exceções específicas permite um tratamento de erros mais claro e organizado, facilitando o entendimento e manutenção do código.

---
## Tecnologias utilizadas
- Java 11+
- IDE IntelliJ IDEA ou VS Code
- Uso de exceções personalizadas para controle de erros