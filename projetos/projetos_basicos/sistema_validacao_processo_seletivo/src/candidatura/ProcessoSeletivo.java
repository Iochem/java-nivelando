package projetos_basicos.sistema_validacao_processo_seletivo.src.candidatura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        double salarioBase = 2000.0;

        System.out.println("Processo seletivo");
        // HashMap com 8 candidatos e seus salários pretendidos
        Map<String, Double> candidatos = new HashMap<>();
        candidatos.put("Ana", 1800.0);
        candidatos.put("Bruno", 2100.0);
        candidatos.put("Carlos", 2000.0);
        candidatos.put("Diana", 1950.0);
        candidatos.put("Eduardo", 2200.0);
        candidatos.put("Fernanda", 1700.0);
        candidatos.put("Gustavo", 2050.0);
        candidatos.put("Helena", 1900.0);

        int selecionados = 0;

        // Lista para armazenar o relatório final
        List<String> relatorioFinal = new ArrayList<>();

        for (Map.Entry<String, Double> entry : candidatos.entrySet()) {
            String nome = entry.getKey();
            double salarioPretendido = entry.getValue();

            if (salarioPretendido <= salarioBase) {
                String status = analisarCandidato(nome, salarioPretendido);

                // Exibe no momento da seleção
                System.out.println("- " + nome + " (R$" + salarioPretendido + ")");
                System.out.println("Status: " + status);
                System.out.println("--------------------------");

                // Armazena no relatório final
                relatorioFinal.add(nome + " | Pretensão: R$" + salarioPretendido + " | " + status);

                selecionados++;
                if (selecionados == 5) break;
            }
        }

        if (selecionados == 0) {
            System.out.println("Nenhum candidato dentro do salário base.");
        } else {
            // Exibe o relatório final com índice do elemento
            System.out.println("\n📋 RELATÓRIO FINAL DOS CANDIDATOS SELECIONADOS:");
            for (int i = 0; i < relatorioFinal.size(); i++) {
                System.out.println((i + 1) + "º - " + relatorioFinal.get(i));
            }
        }
    }

    static String analisarCandidato(String nome, double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            return "Ligar para " + nome + ": salário dentro do orçamento.";
        } else if (salarioPretendido == salarioBase) {
            return "Ligar para " + nome + " com contra proposta: salário no limite.";
        } else {
            return nome + " aguardando resultado dos demais candidatos.";
        }
    }
}
