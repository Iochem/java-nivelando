package projetos_intermediarios.controlador_de_notas.src.controladorDeNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("informe o nome do aluno: ");
        String nomeAluno = sc.nextLine().toLowerCase();

        //Cria o objeto de aluno
        Aluno aluno = new Aluno(nomeAluno);
        ControladorDeNotas controlador = new ControladorDeNotas(aluno);

        int opcao;

        do {
            System.out.println("\n---MENU---");
            System.out.println("1 - Adicionar materia");
            System.out.println("2 - Adicionar nota");
            System.out.println("3 - Calcular media");
            System.out.println("4 - Ver todas as matérias anexadas e aprovações");
            System.out.println("5 - sair");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome da matéria: ");
                    String materia = sc.nextLine();
                    //Adicionar o nome da matéria no controlador
                    controlador.setNomeMateria(materia);
                    break;
                case 2:
                    try{
                        System.out.println("Informe a nota (entre 0 e 10): ");
                        float nota = sc.nextFloat();
                        if (nota < 0 || nota > 10) {
                            System.out.println("❌ Nota inválida! Digite um valor entre 0 e 10.\n");
                        } else {
                            controlador.adicionarNotas(nota);
                            System.out.println("✅ Nota adicionada com sucesso!");
                        }
                    }catch(MateriaNaoDefinidaException e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        controlador.calcularMedia();
                        System.out.println("A media da matéria" + controlador.getNomeMateria() + "É: " + controlador.getMedia());
                    } catch(MateriaNaoDefinidaException | NotaOuMediaInexistenteException e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    try{
                    controlador.materiasENotasAnexadas();
                    } catch(MateriaNaoDefinidaException | NotaOuMediaInexistenteException e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.print("Opção inválida! Tente novamente");
            }
        }while(opcao != 5);
        sc.close();
    }
}
