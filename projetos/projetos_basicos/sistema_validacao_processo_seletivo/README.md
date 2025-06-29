# Processo Seletivo em Java


Este é um projeto simples que simula um processo seletivo, ideal para iniciantes em Java. Ele avalia candidatos com base no salário pretendido e um valor base definido, selecionando até 5 candidatos aptos para contato.

### Funcionalidades:
- Cadastro de 8 candidatos com seus salários pretendidos (via HashMap)
- Seleção automática de até 5 candidatos com salário compatível
- Mensagens personalizadas, incluindo contra propostas
- Geração de relatório final numerado dos candidatos selecionados com índice do elemento


## Estrutura usada

- `HashMap<String, Double>` para armazenar nome e salário pretendido
- `ArrayList<String>` para gerar relatório final com status
- Condicionais `if/else` para avaliar o salário
- Laços `for-each` e `for` com índices
- Método estático para análise da proposta (`analisarCandidato`)

### Tecnologias:
- Linguagem: **Java**
- Versão recomendada: **Java 17+**

### Objetivo:
Projeto didático para treinar lógica condicional, coleções e saída de dados em Java.