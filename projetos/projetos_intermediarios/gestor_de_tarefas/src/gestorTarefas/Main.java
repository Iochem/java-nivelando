package projetos_intermediarios.gestor_de_tarefas.src.gestorTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoService service = new ToDoService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n📋 Menu To-Do List:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar todas");
            System.out.println("3 - Listar por status");
            System.out.println("4 - Alterar status");
            System.out.println("5 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            int idTarefa;

            System.out.println("\n ");
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    //Adicionar o nome da matéria no controlador
                    service.adicionar(nomeTarefa);
                    System.out.println("Status atual:PENDENTE");
                    break;
                case 2:
                    service.listarTodas();
                    break;
                case 3:
                    System.out.println("Status (PENDENTE, CONCLUIDA, CANCELADA): ");
                    System.out.print("Escolha qual status deseja consultar: ");
                    String statusEscolha = sc.nextLine().toUpperCase();
                    service.listarPorStatus(statusEscolha);
                    break;
                case 4:
                    System.out.println("Status disponíveis : PENDENTE, CONCLUIDA, CANCELADA");
                    System.out.print("ID da tarefa: ");
                    idTarefa = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo status: ");
                    String novoStatus = sc.nextLine().toUpperCase();

                    service.alterarStatus(idTarefa, novoStatus);

                    break;
                case 5:
                    System.out.print("Informe o ID da tarefa: ");
                    idTarefa = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    service.excluir(idTarefa);
                    break;
                case 0:
                    System.out.print("Finalizando...");
                    break;
                default:
                    System.out.print("Opção inválida! Tente novamente");
            }
            System.out.println("\n ");

        } while (opcao != 0);

        sc.close();
    }

}

