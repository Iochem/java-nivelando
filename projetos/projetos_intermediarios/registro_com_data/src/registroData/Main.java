package projetos_intermediarios.registro_com_data.src.registroData;

import java.security.Provider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();

        System.out.println("=== Sistema de Registro com Data ===");

        int opcao;
        do {
            System.out.println("\n=== Sistema de Registro ===");
            System.out.println("1. Novo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o registro: ");
                    String nome = sc.nextLine();
                    service.adicionarRegistro(nome);
                }
                case 2 -> {
                    System.out.print("Lista os registros Internacionalizados e formatados : ");
                    service.listarRegistros();
                }
                case 3 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        sc.close();
    }
}
